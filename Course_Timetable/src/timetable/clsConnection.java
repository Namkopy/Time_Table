/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class clsConnection {

   
    public static Connection getGetDatacon() {
        return con;
    }

    public static void setGetDatacon(Connection aGetDatacon) {
        con = aGetDatacon;
    }

    public static String getUsername() {
        return Username;
    }

    public static void setUsername(String aUsername) {
        Username = aUsername;
    }

    public static Statement getStmt() {
        return stmt;
    }

    public static void setStmt(Statement aStmt) {
        stmt = aStmt;
    }

    public static ResultSet getRs() {
        return rs;
    }

    public static void setRs(ResultSet aRs) {
        rs = aRs;
    }
    
    private static Connection con;
    private static String Username;
    private static Statement stmt;
    private static ResultSet rs;
    private static String fileName;
    
    public static void ConnecttionDB() throws Exception{
        fileName = "D:\\Study\\IT\\Y3\\Java\\Timetable\\Course_timatable\\Course_Timetable";
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver").newInstance();
        con =DriverManager.getConnection("jdbc:ucanaccess://"+ fileName +"/Course_Timetable.accdb");  
        stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    }
    
}
