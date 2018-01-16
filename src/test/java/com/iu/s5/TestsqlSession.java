package com.iu.s5;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestsqlSession extends AbstractTest {

	@Autowired
	private SqlSession SqlSession;
	
	@Test
	public void test() {
		assertNotNull(SqlSession);
	}

}
