package module.be.api.memo.service;

import lombok.RequiredArgsConstructor;
import module.be.api.memo.entity.MemoVo;
import module.be.api.memo.respository.MemoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {

    private final MemoRepository memoRepository;

    public List<MemoVo> getAll() {
        return memoRepository.findAll();
    }

}
