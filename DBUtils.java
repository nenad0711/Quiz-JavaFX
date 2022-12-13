package com.example.final_project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
/**
 * Project Name: Quiz Game
 * COP 3330C Object Oriented Programming
 * written by: @author Nenad Jovanovic (njovanovic1@mail.valenciacollege.edu)
 * created: 12/5/22
 */
                              /** Method that`s adding players and their scores to MySQl DB */
public class DBUtils {
    static ObservableList<Player> list;
    public static void addPlayer(String name, int points) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/game", "java_user", "java123");
            PreparedStatement pStat = null;
            pStat = conn.prepareStatement("INSERT INTO `players`(player_name,score) VALUES(?,?)");
            pStat.setString(1, name);
            pStat.setInt(2, points);
            pStat.executeUpdate();
        }
        catch (SQLException e) {

            throw new RuntimeException(e);

        }
    }
                                  /** Method that retrieves players and their scores from MySQl DB */
            public static ObservableList<Player> findAllPeople() {

             try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             }
             catch (ClassNotFoundException e) {
             throw new RuntimeException(e);
             }
             try{
             Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/game", "java_user", "java123");

                 list = FXCollections.observableArrayList();
                 PreparedStatement ps = conn.prepareStatement("SELECT * FROM players");
                 ResultSet rs = ps.executeQuery();
            while (rs.next()){
                    list.add(new Player(rs.getString("player_name"),rs.getInt("score")));
                    }
             }
             catch(SQLException e){
             System.out.println(e.getMessage());
             }
                return list;
             }
}




