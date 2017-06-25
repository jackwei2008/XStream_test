package com.sitech.utils.xstream;

import com.thoughtworks.xstream.XStream;

public class XStreamUtility {

    private static final XStream xStream = XStreamFactory.getXStream ();

    /**
     * Javabean תXML
     * @param t ��תjavabean����
     * @param <T>
     * @return xml�ַ���
     */
    public static <T> String toXml(T t, String encoding){
    	xStream.autodetectAnnotations(true);//�Զ����ģʽ��Ĭ��
        String headLine = "<?xml version=\"1.0\" encoding=\""+ encoding +"\"?>";
        return headLine + xStream.toXML ( t );
    }

    /**
     * XML�ַ���תjavabean
     * @param xmlStr xml�ַ���
     * @param <T>
     * @return Java����
     */
    public static <T> T toJavaBean(String xmlStr){
    	xStream.autodetectAnnotations(true);//�Զ����ģʽ��Ĭ��
        return (T) xStream.fromXML ( xmlStr);
    }
}
