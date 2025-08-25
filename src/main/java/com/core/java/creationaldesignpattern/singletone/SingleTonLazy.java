package com.core.java.creationaldesignpattern.singletone;

public class SingleTonLazy {
    public static void main(String[] args) {
        DBConnectionLazy.getInstance();
    }
}
class DBConnectionLazy{
    private static DBConnectionLazy connection;

    private DBConnectionLazy(){
        System.out.println("DB Connection initialized");
    }
    public static DBConnectionLazy getInstance(){
        if(connection == null){
            connection = new DBConnectionLazy();
        }
        return connection;
    }

}
