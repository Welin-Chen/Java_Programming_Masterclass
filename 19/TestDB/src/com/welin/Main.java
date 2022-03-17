package com.welin;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/chenweilin/Desktop/java/19/TestDB/" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " TEXT, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" +
                    ")");

            insertContact(statement,"Joe",9899,"joe@email.com");
            insertContact(statement,"Mary",1211,"mary@email.com");
            insertContact(statement,"Maggie",8888,"maggie@email.com");
            insertContact(statement,"Vicky",5555,"vicky@email.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=5678" +
                    " WHERE " + COLUMN_NAME + "='Vicky'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + "='Maggie'");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(COLUMN_NAME) + " " +
                        resultSet.getInt(COLUMN_PHONE) + " " +
                        resultSet.getString(COLUMN_EMAIL));
            }

            resultSet.close();

            statement.close();
            conn.close();
        } catch (SQLException throwables) {
            System.out.println("Something went wrong: " + throwables.getMessage());
            throwables.printStackTrace();
        }
    }

    public static void insertContact(Statement statement, String name, Integer phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + "," +
                COLUMN_PHONE + "," +
                COLUMN_EMAIL +
                ")" +
                "VALUES('" + name + "'," + phone + ",'" + email + "')");
    }
}
