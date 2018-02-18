package DBAction;

import Bean.BuyItemBean;
import DBConnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public ArrayList<BuyItemBean> getAddToCartTableData() {
        ArrayList<BuyItemBean> dataList = new ArrayList<BuyItemBean>();
        String query = "SELECT addtocart.cart_id,stockdetails.item_name,addtocart.Quantity,addtocart.SellPrice FROM addtocart inner JOIN stockdetails ON addtocart.item_id = stockdetails.stock_id where addtocart.Status ='1'";
        try {
            DBConnection db = new DBConnection();
            Connection connection = db.getConnection();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                BuyItemBean data = new BuyItemBean();
                data.setId(rs.getInt("addtocart.cart_id"));                
                data.setItemName(rs.getString("stockdetails.item_name"));
                data.setItemQuantity(rs.getString("addtocart.Quantity"));        
                data.setSellPrice(rs.getDouble("addtocart.SellPrice"));
                dataList.add(data);
            }
            st.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBBuyItem.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return dataList;
    }

    public void deleteDataInAddToCart() {
        ArrayList<BuyItemBean> dataList = new ArrayList<BuyItemBean>();
        String query = "TRUNCATE TABLE  addtocart";
        try {
            DBConnection db = new DBConnection();
            Connection connection = db.getConnection();
            Statement st = connection.createStatement();
            st.executeQuery(query);           
            st.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBBuyItem.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }
    
}
