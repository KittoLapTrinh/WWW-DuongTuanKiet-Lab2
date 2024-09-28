package backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.lang.annotation.Target;

@Entity
@Table(name = "order_detail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQueries({
        @NamedQuery(
                name = "OrderDetail.getTotalPrice",
                query = "select SUM(od.price) from OrderDetail od where od.order.id =: id"
        ),
        @NamedQuery(
                name = "OrderDetail.staticsPriceByProduct",
                query = "select product.id, SUM(od.price) from OrderDetail od group by od.product.id"
        )

})
public class OrderDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private double quantity;
    private double price;
    @Column(length = 255)
    private String note;
}
