package com.quytb.dao;

import com.quytb.model.NewModel;

import java.util.List;

public interface INewDAO extends GenericDAO<NewModel> {
    List<NewModel> findAll();
}
