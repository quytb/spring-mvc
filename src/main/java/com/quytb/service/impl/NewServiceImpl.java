package com.quytb.service.impl;

import com.quytb.dao.INewDAO;
import com.quytb.model.NewModel;
import com.quytb.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewServiceImpl implements INewService {
    @Autowired
    private INewDAO newDAO;

    @Override
    public List<NewModel> findAll() {
        return newDAO.findAll();
    }
}
