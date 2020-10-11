package com.cloud.feigncus.dto;

import lombok.Data;

/**
 * Created By YaoMing.
 * Time: 2020/10/08.
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String addr;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
