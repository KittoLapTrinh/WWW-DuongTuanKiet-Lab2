package backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQueries({
        @NamedQuery(
                name = "Customer.findAll", query = "select c from Customer c"
        )
})
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private long id;
    @Column(name = "cust_name", length = 150)
    private String name;
    @Column(length = 150)
    private String email;
    @Column(length = 15)
    private String phone;
    @Column(length = 250)
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Order> oderList;

    public Customer(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}
