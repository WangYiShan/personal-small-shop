package org.wangyishan.smallshopserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.wangyishan.smallshopserver.mapper")
public class SmallShopServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallShopServerApplication.class, args);
    }

}
