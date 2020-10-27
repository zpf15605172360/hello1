package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Zpf
 * @create 2020-10-21 12:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Integer id;
    private String userName;
}
