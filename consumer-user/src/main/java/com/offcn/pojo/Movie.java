package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Zpf
 * @create 2020-10-21 11:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Movie {
    private Integer id;
    private String movieName;
}
