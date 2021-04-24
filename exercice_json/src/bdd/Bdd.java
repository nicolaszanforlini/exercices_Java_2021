package bdd;
import java.sql.*;
import java.util.Scanner;

import infos.Infos;

public class Bdd {

    private static Connection conn = null;

    public static void startBdd() {

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/exercice?user=nicolas&password=pass");
            System.out.println("connection bdd Ok...");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("No connect to bdd...");
        }
    }

    public static void insertInfos(Infos i) {

        try {
            String query = " insert into infos (nom, prenom, age, mail)" + " values (?, ?, ?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, i.getNom());
            preparedStmt.setString(2, i.getPrenom());
            int num = Integer.parseInt(i.getAge());
            preparedStmt.setInt(3, num);
            preparedStmt.setString(4, i.getMail());
            preparedStmt.execute();
            conn.close();
            System.out.println("Insertion Ok...");
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("No Insertion...");
        }
    }

    public static String demandeInsertion () {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }


}
