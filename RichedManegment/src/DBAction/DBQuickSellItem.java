package DBAction;

import Bean.BuyItemBean;
import DBConnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBQuickSellItem {

    public boolean saveAddToCardToDB(BuyItemBean bean) throws SQLException { 
        boolean sucss = false;
        DBConnection db = new DBConnection();
        Connection connection = db.getConnection();
        String sql = "INSERT INTO `addtocart`(`item_id`, `Quantity`, `SellPrice`, `add_date`, `Status`)"
                + " VALUES (?,?,?,now(),?) ";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1,bean.getId() );
            pstmt.setString(2, bean.getItemQuantity());
            pstmt.setDouble(3, bean.getSellPrice());
            pstmt.setInt(4, 1);                      
            pstmt.executeUpdate();
            sucss = true;
        } catch (SQLException e) {
            System.out.println("Stock Is Not Insert" + e);
        } finally {
            connection.close();
            return sucss;
        }
    }
    
}
