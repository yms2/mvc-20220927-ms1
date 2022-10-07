package com.study.mvc20220927ms.controller.api;
import com.study.mvc20220927ms.dto.UserTestDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;


@Controller
public class UserTestApi {

//    @ResponseBody
//    @PostMapping("/api/test/user/dto")
//    public String addTestDto(
//            @RequestParam String username,
//            @RequestParam String password,
//            @RequestParam String name,
//            @RequestParam String email){
//
//        Map<String,String> map = new HashMap<String, String>();
//                map.put("username",username);
//                map.put("password",password);
//                map.put("name",name);
//                map.put("email",email);
//
//        System.out.println("map :" + map.toString());
//
//        return map.toString();
//    public String addUserDto(UserTestDto userTestDto) {
//
//        return userTestDto.toString();
//        }
        @ResponseBody
        @PostMapping("/api/test/user/json")
        public Object addUserJSON(@RequestBody UserTestDto userTestDto){
            List<Map<Integer, UserTestDto>> list = new ArrayList<Map<Integer, UserTestDto>>();

            Map<Integer, UserTestDto> map = null;

            for(int i = 0; i< 100; i++){
                if(i == 0 || i % 10 == 0){
                    map = new TreeMap<Integer, UserTestDto>();
                }
                map.put(i + 1,userTestDto);

                if((i-9) % 10 == 0){
                    list.add(map);
                }
            }
            return list;
    }

}
