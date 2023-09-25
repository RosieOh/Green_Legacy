package kr.green.legacy.repository;

import kr.green.legacy.domain.TestVO;

import java.util.List;

public interface TestRepository {
    public List<TestVO> testList() throws Exception;
}
