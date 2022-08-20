package module.be.api.hello.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="hello")
public class HelloVo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;
    private String msg;
}
