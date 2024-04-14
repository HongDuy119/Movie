package com.kttkpm.movieservice.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.kttkpm.movieservice.until.Constants;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MOVIE")
@Getter
@Setter
public class MovieEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String director;

    private String genre;

    private String description;

    private String createUser;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.COMMON_DATE_FORMAT, locale = Constants.LOCALE_VN, timezone = Constants.TIMEZONE_VN)
    private Date createAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.COMMON_DATE_FORMAT, locale = Constants.LOCALE_VN, timezone = Constants.TIMEZONE_VN)
    private Date updateAt;

    private String urlImg;

    private Long status;
}
