package com.spring.core.springcoreadvanced;

public class MyDAO {
    private final String dbServer;

    MyDAO(String dbServer) {
        this.dbServer = dbServer;
    }

    @Override
    public String toString() {
        return "MyDAO [dbServer=" + dbServer + "]";
    }
}
