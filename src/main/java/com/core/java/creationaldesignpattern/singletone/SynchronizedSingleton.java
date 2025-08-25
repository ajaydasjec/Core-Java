package com.core.java.creationaldesignpattern.singletone;

public class SynchronizedSingleton {
    public static void main(String[] args) {
        DBConnectionSynhronize.getInstance();
    }
}
class DBConnectionSynhronize{
    private static DBConnectionSynhronize connection;

    private DBConnectionSynhronize(){
        System.out.println("Initiate DB Connection");
    }

    synchronized public static DBConnectionSynhronize getInstance(){
        if(connection == null){
            connection = new DBConnectionSynhronize();
        }
        return connection;
    }
}
