import java.sql.*;
import java.util.Scanner;

public class Consultas {
    public static void empleadosOficinaMayor(){
        Connection con=ConexionDB.getConnection();

        try {
            PreparedStatement preparedStatement=con.prepareStatement("SELECT e.officeCode , COUNT(*) as total \n" +
                    "FROM employees e \n" +
                    "group by e.officeCode \n" +
                    "ORDER by total DESC \n" +
                    "limit 1;");

            ResultSet rs=preparedStatement.executeQuery();

            rs.next();

            Integer total=rs.getInt(1);

            PreparedStatement preparedStatement1=con.prepareStatement("SELECT e.employeeNumber, e.lastName," +
                    " e.firstName, e.extension, e.email, e.officeCode, e.reportsTo, e.jobTitle \n" +
                    "FROM employees e where e.officeCode="+total+";");

            ResultSet rs2=preparedStatement1.executeQuery();

            while (rs2.next()){
                System.out.println();
                System.out.println("EmployeeNumber: "+rs2.getInt(1));
                System.out.println("lastName: "+rs2.getString(2));
                System.out.println("firstName: "+rs2.getString(3));
                System.out.println("extension: "+rs2.getString(4));
                System.out.println("email: "+rs2.getString(5));
                System.out.println("officeCode: "+rs2.getString(6));
                System.out.println("reportsTo: "+rs2.getInt(7));
                System.out.println("jobTitle: "+rs2.getString(8));
                System.out.println();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void productosNoVendidos(){
        Connection connection=ConexionDB.getConnection();

        try {
            PreparedStatement preparedStatement=connection.prepareStatement("SELECT p.*\n" +
                    "FROM products p  \n" +
                    "where p.productCode not in (SELECT o2.productCode from orderdetails o2);");

            ResultSet rs=preparedStatement.executeQuery();

            while (rs.next()){
                System.out.println();
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(6));
                System.out.println(rs.getInt(7));
                System.out.println(rs.getInt(8));
                System.out.println(rs.getInt(9));
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void informeCategoria(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el product line que quieras");
        String productLine=sc.nextLine();

        Connection connection=ConexionDB.getConnection();

        try {
            PreparedStatement preparedStatement=connection.prepareStatement("SELECT p.productName , o.orderNumber, o.quantityOrdered \n" +
                    "FROM products p inner join orderdetails o \n" +
                    "on p.productCode =o.productCode \n" +
                    "WHERE p.productLine=?;");

            preparedStatement.setString(1,productLine);

            ResultSet rs=preparedStatement.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getInt(2));
                System.out.println(rs.getInt(3));
            }

            PreparedStatement preparedStatement1=connection.prepareStatement("SELECT SUM(o.quantityOrdered) \n" +
                    "FROM products p inner join orderdetails o \n" +
                    "on p.productCode =o.productCode \n" +
                    "WHERE p.productLine=?;");

            preparedStatement1.setString(1,productLine);

            ResultSet rs2=preparedStatement1.executeQuery();

            rs2.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
