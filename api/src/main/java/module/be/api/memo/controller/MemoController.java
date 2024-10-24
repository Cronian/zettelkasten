package module.be.api.memo.controller;

import lombok.RequiredArgsConstructor;
import module.be.api.memo.entity.MemoVo;
import module.be.api.memo.service.MemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/memo")
public class MemoController {

    private final MemoService memoService;

    @GetMapping("/list")
    public List<MemoVo> list() {
        return  memoService.getAll();
    }
}
