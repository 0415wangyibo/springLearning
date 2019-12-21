package com.wangyb.springlearning.vueserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class VueServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueServerApplication.class, args);
    }

}
