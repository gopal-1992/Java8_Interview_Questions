package com.gopal.Cognizant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListReturnTypeTest  extends ListReturnType{
	@Override
	public
	//here we shoud return same type of object not ref typr or boarder type
	List<String> method1(String name, List<String> names) {
	return null;
	}
	
	
	public static void main(String[] args) {

	}

}
