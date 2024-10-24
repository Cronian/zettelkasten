package module.be.api.memo.respository;

import module.be.api.memo.entity.MemoVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoRepository extends JpaRepository<MemoVo, Long> {

}
