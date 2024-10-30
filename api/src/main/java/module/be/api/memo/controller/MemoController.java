package module.be.api.memo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import module.be.api.memo.dto.MemoDto;
import module.be.api.memo.service.MemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/memo")
@Slf4j
public class MemoController {

    private final MemoService memoService;
    @GetMapping("/list")
    public List<MemoDto> list() {
        return  memoService.getAll();
    }
}
