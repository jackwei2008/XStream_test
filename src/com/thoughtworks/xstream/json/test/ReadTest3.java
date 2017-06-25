package com.thoughtworks.xstream.json.test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.json.response.ContractRoot;

/**
 * Created by Spirit on 2017/4/26.
 */
public class ReadTest3 {
	public static void main(String[] args) {
		String json = "{\n" + "\t\"ContractRoot\":{\n" + "\t\t\"TcpCont\":{\n" + "\t\t\t\"ActionCode\":\"1\",\n" + "\t\t\t\"Response\":{\n" + "\t\t\t\t\"RspCode\":\"0000\",\n"
				+ "\t\t\t\t\"RspDesc\":\"校验成功\",\n" + "\t\t\t\t\"RspType\":\"0\"\n" + "\t\t\t},\n" + "\t\t\t\"RspTime\":\"20160202145959245\",\n"
				+ "\t\t\t\"TransactionID\":\"1001000101201602021234567890\"\n" + "\t\t}\n" + "\t}\n" + "}";

		XStream xstream = new XStream(new JettisonMappedXmlDriver());
		xstream.alias("ContractRoot", ContractRoot.class);
		ContractRoot root = (ContractRoot)xstream.fromXML(json);
		System.out.println(root.getTcpCont().getResponse().getRspCode());
	}
}
