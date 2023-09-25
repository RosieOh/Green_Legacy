package kr.green.legacy.service;

import kr.green.legacy.domain.TestVO;
import kr.green.legacy.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository2;

    @Override
    public List<TestVO> testList() throws Exception {
        return testRepository2.testList();
    }
}
