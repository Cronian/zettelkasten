package module.be.api.hello.repository;

import module.be.api.hello.entity.HelloVo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface helloRepository extends JpaRepository<HelloVo, Long> {
    public List<HelloVo> findById(long id);
}
