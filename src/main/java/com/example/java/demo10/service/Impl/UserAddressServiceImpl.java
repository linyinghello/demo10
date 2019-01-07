package com.example.java.demo10.service.Impl;

import com.example.java.demo10.mapper.UserAddressMapper;
import com.example.java.demo10.pojo.UserAddress;
import com.example.java.demo10.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAddressServiceImpl implements UserAddressService{
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserAddress> getUserAddressList() {
        return userAddressMapper.getUserAddressList();
    }
}
