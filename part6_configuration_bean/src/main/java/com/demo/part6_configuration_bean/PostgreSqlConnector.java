package com.demo.part6_configuration_bean;

public class PostgreSqlConnector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Đã kết nối tới Postgresql: " + getUrl());
    }
}
