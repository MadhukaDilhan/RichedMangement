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

public class DBBuyItem {

    public ArrayList<BuyItemBean> getTableData() {
        ArrayList<BuyItemBean> dataList = new ArrayList<BuyItemBean>();
        String query = "SELECT `stock_id`, `item_no`, `item_name`, `Quantity`, `buy_price`, `sell_price`, `status` FROM `stockdetails` ORDER BY stock_id DESC";
        try {
            DBConnection db = new DBConnection();
            Connection connection = db.getConnection();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                BuyItemBean data = new BuyItemBean();
                data.setId(rs.getInt("stock_id"));
                data.setItemNo(rs.getString("item_no"));
                data.setItemName(rs.getString("item_name"));
                data.setItemQuantity(rs.getString("Quantity"));
                data.setBuyPrice(rs.getDouble("buy_price"));
                data.setSellPrice(rs.getDouble("sell_price"));
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

    public ArrayList<BuyItemBean> getSelectedData(int id) {
        ArrayList<BuyItemBean> dataList = new ArrayList<BuyItemBean>();
        String query = "SELECT `stock_id`, `item_no`, `item_name`, `Quantity`, `buy_price`, `sell_price`, `status` FROM `stockdetails` WHERE stock_id=" + id + "";
        try {
            DBConnection db = new DBConnection();
            Connection connection = db.getConnection();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                BuyItemBean data = new BuyItemBean();
                data.setId(rs.getInt("stock_id"));
                data.setItemNo(rs.getString("item_no"));
                data.setItemName(rs.getString("item_name"));
                data.setItemQuantity(rs.getString("Quantity"));
                data.setBuyPrice(rs.getDouble("buy_price"));
                data.setSellPrice(rs.getDouble("sell_price"));
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

    public boolean editBuyItem(BuyItemBean bean) throws SQLException {
        boolean sucss = false;
        DBConnection db = new DBConnection();
        Connection connection = db.getConnection();
        String sql = "UPDATE stockdetails SET item_no=?,item_name=?,"
                + "Quantity=?,buy_price=?,sell_price=?"
                + " WHERE stock_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, bean.getItemNo());
            pstmt.setString(2, bean.getItemName());
            pstmt.setString(3, bean.getItemQuantity());
            pstmt.setDouble(4, bean.getBuyPrice());
            pstmt.setDouble(5, bean.getSellPrice());
            pstmt.setInt(6, bean.getId());
            pstmt.executeUpdate();
            sucss = true;
            connection.close();
        } catch (SQLException e) {
            System.out.println("Stock Is Not Insert" + e);
        } finally {           
            return sucss;
        }
    }

}
