package com.thoughtworks.xstream.json.response;

/**
 * Created by Spirit on 2017/4/26.
 */
public class Response {
	private String RspCode;
	private String RspDesc;
	private String RspType;

	public String getRspCode() {
		return RspCode;
	}

	public void setRspCode(String rspCode) {
		RspCode = rspCode;
	}

	public String getRspDesc() {
		return RspDesc;
	}

	public void setRspDesc(String rspDesc) {
		RspDesc = rspDesc;
	}

	public String getRspType() {
		return RspType;
	}

	public void setRspType(String rspType) {
		RspType = rspType;
	}
}
