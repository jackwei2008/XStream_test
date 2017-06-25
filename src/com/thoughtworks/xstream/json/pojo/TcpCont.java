package com.thoughtworks.xstream.json.pojo;

public class TcpCont {
	private String AppKey;
	private String Method;
	private String ReqTime;
	private String Sign;
	private String TransactionID;
	private String Version;
	private String DstSysID;

	public String getDstSysID() {
		return DstSysID;
	}

	public void setDstSysID(String dstSysID) {
		DstSysID = dstSysID;
	}

	public String getAppKey() {
		return AppKey;
	}

	public void setAppKey(String appKey) {
		AppKey = appKey;
	}

	public String getMethod() {
		return Method;
	}

	public void setMethod(String method) {
		Method = method;
	}

	public String getReqTime() {
		return ReqTime;
	}

	public void setReqTime(String reqTime) {
		ReqTime = reqTime;
	}

	public String getSign() {
		return Sign;
	}

	public void setSign(String sign) {
		Sign = sign;
	}

	public String getTransactionID() {
		return TransactionID;
	}

	public void setTransactionID(String transactionID) {
		TransactionID = transactionID;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

}	
