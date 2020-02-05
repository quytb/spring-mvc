package com.quytb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AbstractModel<T> {
    private Long id;
    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private String createdBy;
    private String modifiedBy;
    private long[] ids;
    private List<T> listResult = new ArrayList<>();
    private Integer page;
    private Integer maxPageItem;
    private Integer totalPage;
    private Integer totalItem;
    private String sortName;
    private String sortBy;
    private String alert;
    private String message;
    private String type;
}
