/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob2B;

/**
 *
 * @author 984970
 */
public class OrderLine {

    private Order order;

    public OrderLine() {

    }

    public OrderLine(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
