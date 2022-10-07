package com.study.mvc20220927ms.controller;

import com.study.mvc20220927ms.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;

@Controller
//필수!!
public class pageController {
//디스페처서블릿이 중앙제어해줘서 하나의 서블릿이 각각의 메소드를 호출할 수 있다. 하나의 컨트롤러안에 여러개의 메소드를 실행할 수 있다.
    @GetMapping("/test1")
    public String test1(Model model){
        model.addAttribute("name","유민성");
        return "test_page1";

    }    @GetMapping("/test2")
    public ModelAndView test2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("test1data", "tes213123t");
        modelAndView.getModel().put("test2data", "tes2121asdsad3t");
        modelAndView.getModel().put("test3data", "t2313asddsadsaddas3t");
        modelAndView.getModel().put("test4data", "tes21123asdsadasddsa!@3123t");
        modelAndView.setViewName("test/test_page2");
        return modelAndView;
    }
    @GetMapping("/test3")
    public String test3(Model model,@RequestParam String strData,@RequestParam String name){
        System.out.println(strData);
        System.out.println(name);
        model.addAttribute("data",strData );
        model.addAttribute("name",name);
        return "test/test_page3";
    }

    @GetMapping("/test4")
    public String test4(Model model, TestReqDto testReqDto){
//        System.out.println(testReqDto.getStrData());
//        System.out.println(testReqDto.getName());
//        System.out.println(testReqDto.getNumber());
        //상위의 것들을 하나로 나타낼 수 있다.
        System.out.println(testReqDto);

        model.addAttribute("data",testReqDto.getStrData() );
        model.addAttribute("name",testReqDto.getName());
        model.addAttribute("number",testReqDto.getNumber());

        return "test/test_page4";
    }
}
