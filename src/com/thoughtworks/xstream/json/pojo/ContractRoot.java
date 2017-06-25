package com.thoughtworks.xstream.json.pojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class ContractRoot {
	private TcpCont TcpCont;
	private SvcCont SvcCont;

	public com.thoughtworks.xstream.json.pojo.TcpCont getTcpCont() {
		return TcpCont;
	}

	public void setTcpCont(com.thoughtworks.xstream.json.pojo.TcpCont tcpCont) {
		TcpCont = tcpCont;
	}

	public com.thoughtworks.xstream.json.pojo.SvcCont getSvcCont() {
		return SvcCont;
	}

	public void setSvcCont(com.thoughtworks.xstream.json.pojo.SvcCont svcCont) {
		SvcCont = svcCont;
	}
}
