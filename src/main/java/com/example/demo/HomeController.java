package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final MemberService memberService;

    @GetMapping("/index")
    public ResponseEntity<String> index() {
        memberService.regist();
        return ResponseEntity.ok("SUCCESS");
    }
}
