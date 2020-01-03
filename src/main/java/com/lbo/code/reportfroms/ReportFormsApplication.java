package com.lbo.code.reportfroms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan("com.lbo")
@EnableTransactionManagement
@SpringBootApplication
public class ReportFormsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportFormsApplication.class, args);
    }

}
