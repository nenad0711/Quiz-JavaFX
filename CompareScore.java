/**
 * Project Name: Quiz Game
 * COP 3330C Object Oriented Programming
 * written by: @author Nenad Jovanovic (njovanovic1@mail.valenciacollege.edu)
 * created: 12/5/22
 */

package com.example.final_project;

import java.util.Comparator;
                                 /** Method that compares Players by their score */
public class CompareScore implements Comparator<Player> {


    @Override
    public int compare(Player player1, Player player2) {
        return -(player1.getPoint() - player2.getPoint());
    }
}

