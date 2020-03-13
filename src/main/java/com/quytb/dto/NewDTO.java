package com.quytb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NewDTO extends AbstractDTO<NewDTO> {
    private String title;
    private String thumbnail;
    private String shortDescription;
    private String content;
    private Long categoryId;
    private String categoryCode;
}
