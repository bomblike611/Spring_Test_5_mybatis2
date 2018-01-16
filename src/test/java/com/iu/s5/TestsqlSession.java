package com.iu.s5;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.iu.notice.NoticeDAO;
import com.iu.notice.NoticeService;
import com.iu.qna.QnaDAO;
import com.iu.qna.QnaService;

public class TestsqlSession extends AbstractTest {
	
	@Inject
	private NoticeDAO NoticeDAO;
	@Inject
	private QnaDAO QnaDAO;
	@Inject
	private QnaService QnaService;
	@Inject
	private NoticeService NoticeService;
	
	@Test
	public void test() {
		assertNotNull(QnaService);
		assertNotNull(NoticeDAO);
		assertNotNull(QnaDAO);
		assertNotNull(NoticeService);
	}

}
