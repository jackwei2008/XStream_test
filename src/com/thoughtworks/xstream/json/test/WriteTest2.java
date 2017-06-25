package com.thoughtworks.xstream.json.test;

import java.io.Writer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import com.thoughtworks.xstream.json.pojo.Product;

public class WriteTest2 {
	public static void main(String[] args){
		//注意：不同的MODE生成的JSON串格式也不一样。
		XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {
		    public HierarchicalStreamWriter createWriter(Writer writer) {
		        return new JsonWriter(writer, JsonWriter.STRICT_MODE);
		    }
		});
        Product product = new Product("Banana", "123", 23.00);
//        {
//        	  "name": "Banana",
//        	  "id": "123",
//        	  "price": 23.0
//        	}
        
//        {"product": {
//        	  "name": "Banana",
//        	  "id": "123",
//        	  "price": 23.0
//        	}}
        xstream.alias("product", Product.class);
        System.out.println(xstream.toXML(product));		
	}
}
