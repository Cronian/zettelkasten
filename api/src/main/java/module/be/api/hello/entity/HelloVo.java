package module.be.api.hello.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="hello")
public class HelloVo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;
    private String msg;
}
