package com.kongxiang.serial;

import java.io.Serializable;

// Serializable 不是互联网传输的必须条件
// 语言处理怎么处理呢
public class Resp {
	
	private String id;
	private String name;
	private String responseMessage;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	

}
