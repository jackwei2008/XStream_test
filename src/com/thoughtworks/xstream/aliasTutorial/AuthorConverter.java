package com.thoughtworks.xstream.aliasTutorial;

import com.thoughtworks.xstream.converters.SingleValueConverter;

class AuthorConverter implements SingleValueConverter {
	//The first method to implement tells XStream which types it can deal with:
	public boolean canConvert(Class type) {
		return type.equals(Author.class);
	}
	
	//The second one is used to extract a String from an Author:
    public String toString(Object obj) {
            return ((Author) obj).getName();
    }
    
    //And the third one does the opposite job: takes a String and returns an Author:
    public Object fromString(String name) {
            return new Author(name);
    }


}
