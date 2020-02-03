package com.quytb.service.impl;

import com.quytb.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public List<String> loadMenu() {
        List<String> menus = new ArrayList<>();
        menus.add("Home");
        menus.add("Service");
        menus.add("Contact");
        return menus;
    }
}
