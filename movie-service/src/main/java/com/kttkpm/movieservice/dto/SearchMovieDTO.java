package com.kttkpm.movieservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchMovieDTO {
    private Long id;

    private String title;

    private String director;

    private Date fromDate;

    private Date toDate;

    private Long status;

    @JsonIgnore
    Integer startRecord = 0;

    @JsonIgnore
    Integer pageSize = 10;
}
