package com.thoughtworks.xstream.aliasTutorial;

import com.thoughtworks.xstream.XStream;

public class Test_addImplicitCollection {

	public static void main(String[] args) {

		Blog teamBlog = new Blog(new Author("Guilherme Silveira"));
		teamBlog.add(new Entry("first", "My first blog entry."));
		teamBlog.add(new Entry("tutorial", "Today we have developed a nice alias tutorial. Tell your friends! NOW!"));

		XStream xstream = new XStream();
		xstream.alias("blog", Blog.class);
		xstream.alias("entry", Entry.class);
		
		//隐式的collection，去掉了<entries>节点的显示
		//Just as a side note: An array or a map can also be declared as implicit.
		xstream.addImplicitCollection(Blog.class, "entries");

		System.out.println(xstream.toXML(teamBlog));

	}
}
