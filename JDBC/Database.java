package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC"); // this will make driver available
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://SQLlite//uni.db"); // to establish connection

        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from dept");

        int dno;
        String dname;

        while (rs.next()) {
            dno = rs.getInt("deptno");
            dname = rs.getString("dname");

            System.out.println(dno);
            System.out.println(dname);
        }

        rs.close();
        stm.close();
        con.close();
    }
}
