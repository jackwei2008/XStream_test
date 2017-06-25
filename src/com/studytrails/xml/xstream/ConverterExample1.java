package com.studytrails.xml.xstream;
 
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;
 
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.BooleanConverter;
import com.thoughtworks.xstream.converters.basic.DateConverter;
 
public class ConverterExample1 {
 
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        ConverterExample1 converter = new ConverterExample1();
        converter.convert();
    }
 
    private void convert() throws MalformedURLException, URISyntaxException {
 
        BasicConverterFields basicConverterExample = new BasicConverterFields();
        basicConverterExample.initialize();
 
        XStream xStream = new XStream();
 
        xStream.registerLocalConverter(BasicConverterFields.class, "flag", BooleanConverter.BINARY);
 
        DateConverter dateConverter = new DateConverter("yyyy-MM-dd HH:mm:ss", new String[] {}, TimeZone.getTimeZone("UTC"));
        xStream.registerConverter(dateConverter);
 
        String xml = xStream.toXML(basicConverterExample);
 
        System.out.println(xml);
         
        BasicConverterFields basicConverterFromXML = (BasicConverterFields) xStream.fromXML(xml);
        System.out.println(basicConverterFromXML);
         
    }
    

    class BasicConverterFields {
        BigDecimal bigDecimal = new BigDecimal(10000000000.0);
        BigInteger bigInteger = new BigInteger("1000000000");
        boolean flag = true;
        byte byteA = 'a';
        char charA = 'a';
        Date date = new Date();
        Double doubleA = new Double(1000000000000.0);
        Float floatA = new Float(10000000000000f);
        int intA = 100;
        Long longA = new Long(100000);
        Object nullA = null;
        Short shortA = new Short((short) 1);
        StringBuffer stringBufferA = new StringBuffer("test");
        StringBuilder stringBuilderA = new StringBuilder().append("test");
        URI UriA = null;
        URL urlA = null;
        UUID uuidA = UUID.fromString("0000000a-000b-000c-000d-00000000000e");
 
        public void initialize() throws URISyntaxException, MalformedURLException {
            UriA = new URI("file://C/work/fileA");
            urlA = new URL("http://www.google.com");
        }
 
        @Override
        public String toString() {
            return "BasicConverterFields [bigDecimal=" + bigDecimal + ", bigInteger=" + bigInteger + ", flag=" + flag + ", byteA=" + byteA
                    + ", charA=" + charA + ", date=" + date + ", doubleA=" + doubleA + ", floatA=" + floatA + ", intA=" + intA + ", longA=" + longA
                    + ", nullA=" + nullA + ", shortA=" + shortA + ", stringBufferA=" + stringBufferA + ", stringBuilderA=" + stringBuilderA
                    + ", UriA=" + UriA + ", urlA=" + urlA + ", uuidA=" + uuidA + "]";
        }
 
    }
 
}