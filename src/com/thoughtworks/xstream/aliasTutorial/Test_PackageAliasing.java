package com.thoughtworks.xstream.aliasTutorial;

import com.thoughtworks.xstream.XStream;

public class Test_PackageAliasing {
	public static void main(String[] args) {

        Blog teamBlog = new Blog(new Author("Guilherme Silveira"));
        teamBlog.add(new Entry("first","My first blog entry."));
        teamBlog.add(new Entry("tutorial",
                "Today we have developed a nice alias tutorial. Tell your friends! NOW!"));

        XStream xstream = new XStream();
        xstream.aliasPackage("my.company", "org.thoughtworks");
        System.out.println(xstream.toXML(teamBlog));

}
}
