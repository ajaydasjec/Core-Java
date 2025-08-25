package com.core.java.creationaldesignpattern.singletone;

public class DoubleLockingSingleton {
    public static void main(String[] args) {
        DBConnectionDoubleLocking.getInstance();
    }
}

class DBConnectionDoubleLocking{
    private static DBConnectionDoubleLocking connection;

    private DBConnectionDoubleLocking(){
        System.out.println("Connection initialized..");
    }

    public static DBConnectionDoubleLocking getInstance(){
        if (connection == null){
            synchronized (DBConnectionDoubleLocking.class){
                if (connection == null) {
                    connection = new DBConnectionDoubleLocking();
                }
            }
        }
        return connection;
    }
}
