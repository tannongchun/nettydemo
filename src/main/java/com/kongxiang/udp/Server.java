
package com.kongxiang.udp;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
public class Server {
    public void run(int port) throws Exception {
      EventLoopGroup group = new NioEventLoopGroup();
        try {
            // 都不是 ServerBootstrap ?
            Bootstrap b = new Bootstrap();
            b.group(group).channel(NioDatagramChannel.class)
              .option(ChannelOption.SO_BROADCAST, true) // 广播
              .handler(new ServerHandler());
            // 绑定端口
             b.bind(port).sync().channel().closeFuture().await();
        } finally {
            group.shutdownGracefully();
        }
    }
    public static void main(String[] args) throws Exception {
        new Server().run(8764);
    }
}
