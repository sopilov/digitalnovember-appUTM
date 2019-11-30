package ru.digitalnovember.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.digitalnovember.app.model.TestModel;
import ru.digitalnovember.app.service.TestService;

@Component
public class TestData {

    @Autowired
    private TestService testService;

    void initData(){
        testService.add(new TestModel("blablabla1"));
        testService.add(new TestModel("blablabla2"));
        testService.add(new TestModel("blablabla3"));
    }
}
