package com.kubilaycicek;

public class Database {
    private static Database db = new Database();

    private Database() {
    }

    public static Database getDatabase() {
        return db;
    }

    public void executeSQL(String sql) {
        System.out.println("executing a query : " + sql);
    }

    public void sqlConnect(String databaseName, String user, String pass) {
        System.out.println("Connecting Database .. DB: " + databaseName + " USER: " + user + " Password: " + pass);
    }
}