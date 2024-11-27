package com.ict.edu2.domain.guestbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.edu2.domain.guestbook.mapper.GuestBookMapper;
import com.ict.edu2.domain.guestbook.vo.GuestbookVO;

@Service
public class GuestBookServiceImpl implements GuestBookService{

    @Autowired
    private GuestBookMapper guestBookMapper;

    @Override
    public List<GuestbookVO> getGuestBookList() throws Exception {
        return guestBookMapper.getGuestBookList();
    }

    @Override
    public GuestbookVO getGuestBookOneList(String gb_idx) throws Exception {
        return guestBookMapper.getGuestBookOneList(gb_idx);
    }



}
