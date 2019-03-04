package com.sa.lab1.e3;

public class Test {

	public static void main(String[] args) {
		Query query1 = new QueryBuilder().setSelect("name").setFrom("student").build();
		System.out.println(query1.toString());

		Query query2 = new QueryBuilder().setSelect("name").setFrom("student").setWhere("name = 'Name1'").build();
		System.out.println(query2.toString());

		Query query3 = new QueryBuilder().setSelect("name").setWhere("name = 'Name1'").build();
		System.out.println(query3.toString());
	}
}
