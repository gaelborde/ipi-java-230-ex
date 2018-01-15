package com.ipiecoles.java.java230;

import com.ipiecoles.java.java230.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.Statement;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private EmployeService employeService;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Nombre d'employés : " + employeService.countAllEmploye());

        System.out.println(employeService.findById(5L));
    }

   /* @Override
    public void run(String... strings) throws Exception {
        String url = "jdbc:mysql://localhost:3306/entreprise";
        String user = "root";
        String pwd = "console";
        java.sql.Connection connexion = null;
        try {
            connexion = java.sql.DriverManager.getConnection(url, user, pwd);
        } catch (java.sql.SQLException e) {
            //Problème de connexion à la base !
        }
//L'object connexion va nous permettre d'effectuer des requêtes...

        Statement statement = connexion.createStatement();
        //La variable de type ResultSet contiendra les résultats de la requêtes
        String query = "SELECT * FROM employe";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println("Value = " + resultSet.getInt(1));
        }
//Lorsqu'on a fini de l'utiliser :
        if (connexion != null) {
            try {
                connexion.close();
            } catch (java.sql.SQLException e) {
                //Problème de déconnexion, ce n'est pas très grave...
            }
        }
    }

        public static void print(Object t){
            System.out.println(t);
        }
        */
}
