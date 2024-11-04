package module.be.api.memo.service;

import lombok.RequiredArgsConstructor;
import module.be.api.memo.entity.Memo;
import module.be.api.memo.respository.MemoRepository;
import module.be.api.memo.dto.MemoDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemoService {

    private final MemoRepository memoRepository;

    public List<MemoDto> getAll() {
        List<Memo> list = memoRepository.findAll();

        return list.stream()
                .map(MemoDto::new)
                .collect(Collectors.toList());
    }

    public Memo save(MemoDto dto) {
        return memoRepository.save(dto.buildMemo(dto));
    }

}
