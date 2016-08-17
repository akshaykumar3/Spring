import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by akshay.kumar1 on 17/08/16.
 */
public class Payment {

    private Order order;

    public Order getOrder() {
        return order;
    }

    @Autowired
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString(){
        return "Ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
    }
}
