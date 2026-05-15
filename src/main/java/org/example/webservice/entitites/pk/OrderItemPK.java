package org.example.webservice.entitites.pk;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.example.webservice.entitites.Order;
import org.example.webservice.entitites.Product;

import java.io.Serializable;

@Embeddable
public class OrderItemPK implements Serializable {

    private static final long serialVersionUID = 1L;
    // Chaves estrangeiras compostas

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        OrderItemPK that = (OrderItemPK) o;
        return getProduct().equals(that.getProduct()) && getOrder().equals(that.getOrder());
    }

    @Override
    public int hashCode() {
        int result = getProduct().hashCode();
        result = 31 * result + getOrder().hashCode();
        return result;
    }
}

