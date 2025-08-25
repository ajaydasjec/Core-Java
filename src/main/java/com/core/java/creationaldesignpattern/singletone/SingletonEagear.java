package com.core.java.creationaldesignpattern.singletone;

public class SingletonEagear {
    public static void main(String[] args) {
        DBConnectionEager.getInstance();
    }
}
class DBConnectionEager{
    private static DBConnectionEager connection = new DBConnectionEager();
    private DBConnectionEager(){
        System.out.println("DB Connection created.");
    }
    public static DBConnectionEager getInstance(){
        return connection;
    }
}