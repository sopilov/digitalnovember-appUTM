package ru.digitalnovember.app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.digitalnovember.app.dao.TestDao;
import ru.digitalnovember.app.model.TestModel;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TestService {

    private final TestDao dao;

    public List<TestModel> getAll() {
        return dao.findAll();
    }

    public void add(TestModel testModel) {
        dao.saveAndFlush(testModel);
    }
}
