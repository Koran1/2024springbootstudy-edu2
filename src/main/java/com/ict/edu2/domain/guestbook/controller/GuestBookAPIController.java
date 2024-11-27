package com.ict.edu2.domain.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ict.edu2.domain.guestbook.service.GuestBookService;
import com.ict.edu2.domain.guestbook.vo.GuestbookVO;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/guestbook")
public class GuestBookAPIController {

    @Autowired
    private GuestBookService guestBookService;
    
    // 전체보기
    @GetMapping("/gb_list")
    @ResponseBody
    public List<GuestbookVO> getGuestBookList() {
        try {
            return guestBookService.getGuestBookList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 상세보기
    @GetMapping("/gb_onelist")
    @ResponseBody
    public GuestbookVO getGuestBookOneList(@RequestParam("gb_idx") String gb_idx) {
        try {
            return guestBookService.getGuestBookOneList(gb_idx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    

}
