package com.nhnacademy.edu.springframework.greeting.factorymethod.application;

import com.nhnacademy.edu.springframework.greeting.factorymethod.framework.Application;
import com.nhnacademy.edu.springframework.greeting.factorymethod.framework.Document;

public class CsvApplication extends Application {
    @Override
    protected Document createDocument() {
        return new CsvDocument();
    }
}
