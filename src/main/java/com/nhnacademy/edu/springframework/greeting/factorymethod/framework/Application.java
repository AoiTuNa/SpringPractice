package com.nhnacademy.edu.springframework.greeting.factorymethod.framework;

public abstract class Application {
    public void openDocument() {
        Document document = createDocument();
        document.open();
    }

    protected abstract Document createDocument();
}
