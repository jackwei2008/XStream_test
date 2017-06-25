package com.thoughtworks.xstream.json.test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.json.pojo.Product;

public class WriteTest {
	public static void main(String[] args) {

        Product product = new Product("Banana", "123", 23.00);
        XStream xstream = new XStream(new JettisonMappedXmlDriver());
        xstream.setMode(XStream.NO_REFERENCES);
        xstream.alias("product", Product.class);
        
        //{"product":{"name":"Banana","id":123,"price":23}}
        System.out.println(xstream.toXML(product));		
		
	}
}
