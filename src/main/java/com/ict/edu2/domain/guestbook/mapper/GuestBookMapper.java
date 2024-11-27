package com.ict.edu2.domain.guestbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ict.edu2.domain.guestbook.vo.GuestbookVO;

@Mapper
public interface GuestBookMapper {
    // 간단한 Query 처리의 경우 여기서 바로 작성한다!
    @Select("select * from guestbook order by gb_idx")
    public List<GuestbookVO> getGuestBookList() throws Exception;

    // xml로 보내서 처리하고 싶은 경우
    public GuestbookVO getGuestBookOneList(String gb_idx) throws Exception;
    
}
