package com.ict.edu2;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class SampleController {
    
    // 반환형이 String 일 때 => String 으로 출력
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    // 반환형이 String[] 일 때 => JSON 형식으로 출력
    @GetMapping("/hello2")
    public String[] getHello2() {
        return new String[]{"Hello", "World2"};
    }

    // 반환형이 Object 일 때 - VO
    @GetMapping("/hello3")
    public SampleVO getSampleVO() {
        SampleVO svo1 = new SampleVO();
        svo1.setAge("24");
        svo1.setName("고길동");
        return svo1;
    }

    // 반환형이 Object 일 때 - List
    @GetMapping("/hello4")
    public List<SampleVO> getSampleList() {
        List<SampleVO> list = new ArrayList<>();

        SampleVO svo1 = new SampleVO();
        svo1.setAge("24");
        svo1.setName("고길동");
        list.add(svo1);

        SampleVO svo2 = new SampleVO();
        svo2.setAge("21");
        svo2.setName("홍길동");
        list.add(svo2);

        SampleVO svo3 = new SampleVO();
        svo3.setAge("33");
        svo3.setName("노길동");
        list.add(svo3);


        return list;
    }
    
    // 반환형이 Object 일 때 - List
    @GetMapping("/hello5")
    public DataVO getDataVO(String index) {
        
        List<SampleVO> list = new ArrayList<>();
        SampleVO svo1 = new SampleVO("고길동","24");
        list.add(svo1);
        
        SampleVO svo2 = new SampleVO("홍길동", "21");
        list.add(svo2);
        
        SampleVO svo3 = new SampleVO("노길동", "33");
        list.add(svo3);

        DataVO dataVO = new DataVO<>();

        if(index.equals("1")){
            // dataVO.setResultCode(1);
            // dataVO.setMessage("성공");
            // dataVO.setData(list);
            return DataVO.success(1, "성공", list);
        }else{
            // dataVO.setResultCode(0);
            // dataVO.setMessage("실패");
            // dataVO.setData(null);
            return DataVO.fail(0, "실패");
        }
        // return dataVO;
    }

    @PostMapping("/hi")
    public String getHi() {
        return "hi, 안녕";
    }
    
    @PostMapping("/hi2")
    public String[] getHi2(@RequestParam("idx") String idx) {
        return new String[]{"Hello", "World", idx};
    }
    
    @PostMapping("/hi3")
    public String[] getHi3(@RequestBody Map<String, String> params) {
        return new String[]{"Hello", "World", params.get("idx")};
    }

    @PostMapping("/hi4")
    public SampleVO getHi4(@RequestBody Map<String, String> params) {
        SampleVO svo = new SampleVO("홍길동", params.get("age"));
        return svo;
    }
    
    @PostMapping("/hi5")
    public List<SampleVO> getHi5(@RequestBody Map<String, String> params) {
        List<SampleVO> list = new ArrayList<>();

        SampleVO svo1 = new SampleVO("고길동",params.get("age1"));
        list.add(svo1);
        
        SampleVO svo2 = new SampleVO("홍길동", params.get("age2"));
        list.add(svo2);
        
        SampleVO svo3 = new SampleVO("노길동", "33");
        list.add(svo3);

        return list;
        
    }
    
}
