package com.thoughtworks.xstream.aliasTutorial;

import com.thoughtworks.xstream.XStream;


public class Test_AttributeAliasing {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blog teamBlog = new Blog(new Author("Guilherme Silveira"));
		teamBlog.add(new Entry("first", "My first blog entry."));
		teamBlog.add(new Entry("tutorial", "Today we have developed a nice alias tutorial. Tell your friends! NOW!"));

		XStream xstream = new XStream();
		xstream.alias("abc", Blog.class);
		xstream.alias("entry", Entry.class);

		xstream.addImplicitCollection(Blog.class, "entries");
		
		//The next step is to set the writer member variable as an XML attribute. In order to do this, 
		//we shall tell XStream to alias the writer field of the Blog class as an "author" attribute:
		xstream.useAttributeFor(Blog.class, "writer");
		xstream.aliasField("author", Blog.class, "writer");
		
		//And now it leaves us with one problem: how does XStream converts an Author in a String so it can be written as a XML tag attribute?
		//Attributes cannot be written for types that are handled by Converter implementations, 
		//we have to use a SingleValueConverter and implement our own converter for the Author:
		xstream.registerConverter(new AuthorConverter());

		System.out.println(xstream.toXML(teamBlog));
		Blog blog = (Blog)xstream.fromXML("<abc author='Guilherme Silveira'><entry><title>first</title><description>My first blog entry.</description></entry><entry><title>tutorial</title><description>Today we have developed a nice alias tutorial. Tell your friends! NOW!</description></entry></abc>");
		//System.out.println("11111111" + blog.getWriter().getName());
	}

}
