/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob2B;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 984970
 */
public class Order {

    private long orderNum;

    private List<OrderLine> orderlines;

    public Order() {
        orderlines = new ArrayList<>();

        //For 1..* relation there must be at least one object
        OrderLine ol = new OrderLine(this);
        orderlines.add(ol);

    }

    public long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(long orderNum) {
        this.orderNum = orderNum;
    }

    public List<OrderLine> getOrderlines() {
        return orderlines;
    }

    public void setOrderlines(List<OrderLine> orderlines) {
        this.orderlines = orderlines;
    }
    
    public String toString()
    {
        return "Orderlines count : "+this.orderlines.size();
    }

}
