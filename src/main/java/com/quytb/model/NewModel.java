package com.quytb.model;

import com.quytb.dao.impl.AbstractDAO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NewModel extends AbstractModel<NewModel> {
    private String title;
    private String thumbnail;
    private String shortDescription;
    private String content;
    private Long categoryId;
    private String categoryCode;
}
