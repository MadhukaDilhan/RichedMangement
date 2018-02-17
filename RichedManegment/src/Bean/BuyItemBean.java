package Bean;

public class BuyItemBean {

    private int id;
    private int status;
    private String item_no;
    private String item_name;
    private String item_quantity;
    private double buy;
    private double sell;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setItemNo(String i_no) {
        this.item_no = i_no;
    }

    public String getItemNo() {
        return this.item_no;
    }

    public void setItemName(String item_name) {
        this.item_name = item_name;
    }

    public String getItemName() {
        return this.item_name;
    }

    public void setItemQuantity(String item_quantity) {
        this.item_quantity = item_quantity;
    }

    public String getItemQuantity() {
        return this.item_quantity;
    }

    public void setBuyPrice(double buy) {
        this.buy = buy;
    }

    public double getBuyPrice() {
        return this.buy;
    }

    public void setSellPrice(double sell) {
        this.sell = sell;
    }

    public double getSellPrice() {
        return this.sell;
    }
}
