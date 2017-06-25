package com.thoughtworks.xstream.annotationsTutorial;

import com.sitech.utils.xstream.XStreamUtility;
import com.thoughtworks.xstream.aliasTutorial.Author;

public class Tutorial {
	public static void main(String[] args) {
//		XStream stream = new XStream();
//		stream.processAnnotations(RendezvousMessage.class);//强制使用注解的模式，使用后xstream将不再使用自动模式
		RendezvousMessage msg = new RendezvousMessage(15, false,"firstPart","secondPart");
//		System.out.println(stream.toXML(msg));
		Author author = new Author("jack");
		msg.setAuthor(author);
		System.out.println(XStreamUtility.toXml(msg, "UTF-8"));
		
//		System.out.println("=======================================");
		
//		XStream stream2 = new XStream();
//		stream2.autodetectAnnotations(true);//自动检测模式，默认
//		RendezvousMessage2 msg2 = new RendezvousMessage2(15,false,"This is the message content.");
//		System.out.println(stream2.toXML(msg2));
	}
}
