package com.quytb.dao.impl;

import com.quytb.dao.INewDAO;
import com.quytb.mapper.NewMapper;
import com.quytb.model.NewModel;

import java.util.List;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
    @Override
    public List<NewModel> findAll() {
        String sql = "SELECT * FROM news";
        return query(sql, new NewMapper());
    }
}
