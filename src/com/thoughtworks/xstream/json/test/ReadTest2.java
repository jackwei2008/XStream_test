package com.thoughtworks.xstream.json.test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.json.pojo.ContractRoot;
import com.thoughtworks.xstream.json.pojo.TcpCont;
import com.thoughtworks.xstream.json.pojo.SvcCont;

public class ReadTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String json = "{\"ContractRoot\":{\"TcpCont\":{\"DstSysID\":\"6099070001\",\"TransactionID\":\"1000000244201704271526334362\",\"AppKey\":\"1000000244\",\"ReqTime\":\"20170427152633\",\"Sign\":\"d0ff0be0deaef5335f522d5515d1da1b\",\"Method\":\"chk.order.chkdeposit\",\"Version\":\"V1.0\"},\"SvcCont\":{\"AccNbr\":\"13303469876\",\"Amount\":\"2000\",\"staffCode\":\"JZ_NVERHE1\",\"channelNbr\":\"2107111001666\",\"commonRegionId\":\"8210100\",\"ReqSerial\":\"\",\"CustOrderId\":\"\",\"StaffCode\":\"SJZCS_4G\",\"ChannelNbr\":\"1406211633562\",\"CommonRegionId\":\"8140100\"}}}";
		    
		XStream xstream = new XStream(new JettisonMappedXmlDriver());
		xstream.alias("ContractRoot", ContractRoot.class);
//		xstream.alias("TcpCont",TcpCont.class);
//		xstream.alias("SvcCont",SvcCont.class);
		ContractRoot root = (ContractRoot)xstream.fromXML(json);
		System.out.println(root.getSvcCont().getAccNbr());
	}

}
