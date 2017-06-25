package com.thoughtworks.xstream.annotationsTutorial;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import com.thoughtworks.xstream.converters.basic.BooleanConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

@XStreamAlias("message")
@XStreamConverter(value=ToAttributedValueConverter.class, strings={"content"})
class RendezvousMessage2 {

	@XStreamAlias("type")
	private int messageType;
	
	private String content;
	
	@XStreamConverter(value=BooleanConverter.class, booleans={false}, strings={"yes", "no"})
	private boolean important;	
	
	@XStreamOmitField
	/**
	 * Unfortunately our little example does not work! Although we register the converter with the XStreamConverter annotation and provide
	 *  with its arguments the field name, the conversion will fail later on. To use this converter you have to respect the implicit requirement:
	 *   Any field (derived or not) has to be expressed as a single string i.e. technically XStream has to use a SingleValueConverter.
	 *    In our case we have a list of strings that prevent the conversion. Therefore we have to use either a custom converter that
	 *     transforms this list into a single string or we use for simplicity a simple string here:
	 * 		private List<String> content; 不支持list类型放到属性中，下面的calendar类型同样也不支持，因此通过上面的注解把这个属性忽略掉   
	 */
	@XStreamConverter(SingleValueCalendarConverter.class)
	private Calendar created = new GregorianCalendar();	

	public RendezvousMessage2(int messageType, boolean important,String content) {
		this.messageType = messageType;
		this.important = important;
		this.content = content;
	}
}
