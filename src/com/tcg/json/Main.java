package com.tcg.json;

import org.json.*;

public class Main {

	public static void main(String[] args) {
		JSONObject obj = JSONUtils.getJSONObjectFromFile("/obj.json");
		String[] names = JSONObject.getNames(obj);
		for(String string : names) {
			System.out.println(string + ": " + obj.get(string));
		}
		
		System.out.print("\n");
		
		JSONArray jsonArray = obj.getJSONArray("Array");
		for(int i = 0; i < jsonArray.length(); i++) {
			System.out.println(jsonArray.get(i));
		}
		
		System.out.print("\n");
		
		int number = obj.getInt("Number");
		System.out.println(number);
		
		System.out.print("\n");
		
		String string = obj.getString("String");
		System.out.println(string);
		
		System.out.print("\n");
		
		boolean bool = obj.getBoolean("Boolean");
		System.out.println(bool);
		
	}

}
