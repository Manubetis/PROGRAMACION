import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transacciones {
    public static void main(String[] args) {
        insertarPedido();
    }

    public static void insertarPedido() {
        Connection connection = ConexionDB.getConnection();

        int orderNumber = 1907;
        int customerNumber = 119;

        try {
            connection.setAutoCommit(false);

            PreparedStatement preparedStatement = connection.prepareStatement("insert into orders " +
                    "values(?,2003-01-06, 2003-01-13, 2003-01-10, Shipped, Check on availability, ?)");

            preparedStatement.setInt(1, orderNumber);
            preparedStatement.setInt(2, customerNumber);

            preparedStatement.executeUpdate();


            PreparedStatement preparedStatement1 = connection.prepareStatement("insert into orderdetails " +
                    "values(?,?,50,136.00,3)");

            preparedStatement1.setInt(1, orderNumber);
            preparedStatement1.setString(2, "S10_1678");

            preparedStatement1.executeUpdate();


            PreparedStatement preparedStatement2 = connection.prepareStatement("insert into orderdetails " +
                    "values(?,?,10,106.00,9)");

            preparedStatement2.setInt(1, orderNumber);
            preparedStatement2.setString(2, "S10_4698");

            preparedStatement2.executeUpdate();

            connection.commit();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException throwables) {
                System.out.println("Error rollback");
                throwables.printStackTrace();
            }
        }
    }
}
