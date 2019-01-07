package com.example.java.demo10.Controller;

import com.example.java.demo10.mapper.UserAddressMapper;
import com.example.java.demo10.pojo.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class myHandler {

    @Autowired
    private UserAddressMapper userAddressMapper;
    @RequestMapping("getUserAddress")
    public List<UserAddress> getUserAddress(){
        return userAddressMapper.getUserAddressList();
    }
}
