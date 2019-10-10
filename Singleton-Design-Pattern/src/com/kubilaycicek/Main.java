package com.kubilaycicek;

public class Main {

    public static void main(String[] args) {
        Database.getDatabase().sqlConnect("TestDb", "kubilay", "password");
        Database.getDatabase().executeSQL("Select * From TABLE_NAME");
    }
}
