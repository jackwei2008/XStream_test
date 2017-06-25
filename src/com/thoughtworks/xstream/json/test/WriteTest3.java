package com.thoughtworks.xstream.json.test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import com.thoughtworks.xstream.json.response.ContractRoot;
import com.thoughtworks.xstream.json.response.Response;
import com.thoughtworks.xstream.json.response.TcpCont;

import java.io.Writer;

/**
 * Created by Spirit on 2017/4/26.
 */
public class WriteTest3 {
	public static void main(String[] args) {
		//注意：不同的MODE生成的JSON串格式也不一样。
		XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {
			public HierarchicalStreamWriter createWriter(Writer writer) {
				return new JsonWriter(writer, JsonWriter.STRICT_MODE);
			}
		});

		Response response = new Response();
		response.setRspCode("110046");
		response.setRspDesc("代理商账户金额不足");
		response.setRspType("0");

		TcpCont tcpCont = new TcpCont();
		tcpCont.setActionCode("1");
		tcpCont.setResponse(response);
		tcpCont.setRspTime("20160202145959245");
		tcpCont.setTransactionID("1001000101201602021234567890");

		ContractRoot root = new ContractRoot();
		root.setTcpCont(tcpCont);

		xstream.alias("ContractRoot", ContractRoot.class);
		System.out.println(xstream.toXML(root));
	}
}
