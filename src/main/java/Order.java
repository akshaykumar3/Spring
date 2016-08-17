import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by akshay.kumar1 on 17/08/16.
 */
public class Order {

    public String item;
    public String price;

    @Autowired
    public void setItem(String item) {
        this.item = item;
    }

    @Autowired
    public void setPrice(String price) {
        this.price = price;
    }

    public String getItem() {
        return this.item;
    }

    public String getPrice() {
        return this.price;
    }
}
