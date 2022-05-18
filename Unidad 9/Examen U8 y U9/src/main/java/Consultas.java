import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    public static void main(String[] args) {

        // Primer Metodo:
        System.out.println(getProductLines());

        // Salto de línea:
        System.out.println("---------------------------------------");

        // Segundo Metodo:
        CategoriaMasVendida();

    }

    public static List<ProductLines> getProductLines() {
        List<ProductLines> lista = new ArrayList<>();
        Connection connection = ConexionDB.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT p.productLine," +
                    " p.textDescription , p.htmlDescription\n" +
                    "FROM productlines p ;");

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String productLine = "";
                String textDescription = "";
                String htmlDescription = "";

                productLine = rs.getString(1);
                textDescription = rs.getString(2);
                htmlDescription = rs.getString(3);

                ProductLines productLine1 = new ProductLines(productLine, textDescription, htmlDescription);

                lista.add(productLine1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static void CategoriaMasVendida(){
        Connection connection= ConexionDB.getConnection();

        try {
            PreparedStatement preparedStatement=connection.prepareStatement("SELECT p.productName ," +
                    "SUM(o.quantityOrdered)as total \n" +
                    "FROM products p inner join orderdetails o \n" +
                    "on p.productCode =o.productCode \n" +
                    "GROUP by p.productName \n" +
                    "order by total DESC\n" +
                    "limit 1;");

            ResultSet rs=preparedStatement.executeQuery();

            rs.next();

            System.out.println("La Categoría más vendida es: "+ rs.getString(1));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
