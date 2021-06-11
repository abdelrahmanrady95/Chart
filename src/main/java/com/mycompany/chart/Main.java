/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rady
 */
public class Main {
    public static void main(String[] args) throws IOException {
    TitanicPassengersDao p1 = new  TitanicPassengersDao();
        List<TitanicPassengers> passengersInfo = new ArrayList<TitanicPassengers> ();     
        passengersInfo = p1.getPassengersFromJsonFile();
        
        p1.graphPassengerAges(passengersInfo);
        p1.graphPassengerClass(passengersInfo);
        p1.graphPassengerSurvived(passengersInfo);
        p1.graphPassengerSurvivedGender(passengersInfo);
    }
}
