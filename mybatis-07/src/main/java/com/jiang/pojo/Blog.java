package com.jiang.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    /*
    属性名和字段名不一致
    解决方法：
        在核心配置文件中
        <!--开启驼峰命名自动映射-->
        <setting name="mapUnderscoreToCamelCase" value="true"/>
        就
    * */
    private Date createTime;  //数据库原字段：create_time
    private int views;

}
