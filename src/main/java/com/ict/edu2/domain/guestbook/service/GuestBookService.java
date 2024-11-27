package com.ict.edu2.domain.guestbook.service;

import java.util.List;

import com.ict.edu2.domain.guestbook.vo.GuestbookVO;

public interface GuestBookService {
    public List<GuestbookVO> getGuestBookList() throws Exception;
    public GuestbookVO getGuestBookOneList(String gb_idx) throws Exception;
}
