package sdet_day17;



public class Q9 {
 public static void main(String[] args) {

     try {
         Connection con = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/hemanth",
                 "root",
                 "hemanth");

         String query =
                 "SELECT * FROM employee ORDER BY department";

         Statement st = con.createStatement();

         ResultSet rs = st.executeQuery(query);

         while (rs.next()) {
             System.out.println(
                     rs.getInt("id") + " "
                     + rs.getString("name") + " "
                     + rs.getString("department") + " "
                     + rs.getDouble("salary"));
         }

         con.close();

     } catch (Exception e) {
         System.out.println(e);
     }
 }
}