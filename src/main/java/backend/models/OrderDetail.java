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
