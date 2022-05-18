import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    public static void insertarCliente() {
        Connection con = ConexionDB.getConnection();

        try {
            con.setAutoCommit(false);

            PreparedStatement preparedStatement = con.prepareStatement("insert into customers values(1907,Manolo,Kik,Sar,6788,AKDDKJA,Alli,Sevilla,Spain, 123133,12312)");

            preparedStatement.executeUpdate();


            con.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
