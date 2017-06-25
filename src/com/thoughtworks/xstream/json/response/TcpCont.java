package com.thoughtworks.xstream.json.response;

/**
 * Created by Spirit on 2017/4/26.
 */
public class TcpCont {
	private String ActionCode;
	private Response Response;
	private String RspTime;
	private String TransactionID;

	public String getActionCode() {
		return ActionCode;
	}

	public void setActionCode(String actionCode) {
		ActionCode = actionCode;
	}

	public com.thoughtworks.xstream.json.response.Response getResponse() {
		return Response;
	}

	public void setResponse(com.thoughtworks.xstream.json.response.Response response) {
		Response = response;
	}

	public String getRspTime() {
		return RspTime;
	}

	public void setRspTime(String rspTime) {
		RspTime = rspTime;
	}

	public String getTransactionID() {
		return TransactionID;
	}

	public void setTransactionID(String transactionID) {
		TransactionID = transactionID;
	}
}
