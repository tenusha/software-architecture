package com.sa.lab1.e3;

public class QueryBuilder {

    Query query;
    String select = "";
    String from = "";
    String where = "";
    String order = "";

    QueryBuilder() {
        query = new Query();
    }

    QueryBuilder setSelect(String s) {
        select = "SELECT " + s;
        return this;
    }

    QueryBuilder setFrom(String s) {
        from = " FROM " + s;
        return this;
    }

    QueryBuilder setWhere(String s) {
        where = " WHERE " + s;
        return this;
    }

    QueryBuilder setOrder(String s) {
        order = " ORDER BY " + s;
        return this;
    }

    Query build() {
        if (!select.isEmpty()) {
            if (!from.isEmpty()) {
                query.setQuery(select + from + where + order);
                return query;
            } else {
                throw new IllegalStateException("Query must hava a FROM");
            }
        } else {
            throw new IllegalStateException("Query must hava a SELECT");
        }
    }

}
