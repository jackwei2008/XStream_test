package com.studytrails.xml.xstream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;

import com.thoughtworks.xstream.XStream;

/**
 * XStream - Collection Converters
 * @author Spirit
 *
 */
public class ConverterExample2 {
	public static void main(String[] args) {
		ConverterExample2 example2 = new ConverterExample2();
		example2.runExample();
	}

	public void runExample() {
		XStream xStream = new XStream();
		CollectionConverterExample classContainingCollection = new CollectionConverterExample();
		classContainingCollection.initialize();
		String xml = xStream.toXML(classContainingCollection);
		System.out.println(xml);
	}
}

class CollectionConverterExample {

	String[] stringArray = new String[] { "StringA", "StringB", "StringC" };
	char[] charArray = new char[] { 'a', 'b', 'c', 'd', 'e' };
	List<String> listA = new ArrayList<String>();
	Map<String, String> mapA = new HashMap<String, String>();
	Properties properties = new Properties();
	List<String> singletonList;
	Map<String, String> singletonMap;

	TreeMap<String, String> treeMap = new TreeMap<String, String>();
	TreeSet<String> treeSet = new TreeSet<String>();
	enum testEnum {testA, testB}
	testEnum testeEnumValue = testEnum.testA;
	EnumMap<testEnum, String> testEnumMap = new EnumMap<CollectionConverterExample.testEnum, String>(testEnum.class);
	EnumSet<testEnum> testEnumSet = EnumSet.range(testEnum.testA, testEnum.testB);

	public void initialize() {
		listA.add("testA");
		mapA.put("keyA", "ValueA");
		properties.put("propertyA", "valueA");
		treeMap.put("treeA", "valueA");
		treeMap.put("treeB", "valueB");
		treeSet.add("treeB");
		treeSet.add("treeA");
		singletonList = Collections.singletonList("singletonListA");
		singletonMap = Collections.singletonMap("key1", "value1");
		
		testEnumMap.put(testEnum.testA, "testEnumMapValue1");
		testEnumMap.put(testEnum.testB, "testEnumMapValue2");

	}
	

}