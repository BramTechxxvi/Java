package com.example;

import com.example.config.ProjectConfig;
import com.example.controller.AccountController;
import com.example.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        AccountService acctService = appContext.getBean(AccountService.class);
        System.out.println(appContext);
        System.out.println("accountService 1: " + acctService);

        AccountService acctService2 = appContext.getBean(AccountService.class);
        System.out.println("accountService 2: " + acctService2);

        AccountController acctController = appContext.getBean(AccountController.class);
        System.out.println("accountController: " + acctController);

    }
}