package com.iu.notice;

import java.util.List;

import com.iu.board.BoardDTO;
import com.iu.board.BoardService;

public class NoticeService implements BoardService {
	
	private NoticeDAO noticeDAO;

	public void setNoticeDAO(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}

	@Override
	public List<BoardDTO> selectList() throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.selectList();
	}

	@Override
	public BoardDTO selectOne(int num) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.selectOne(num);
	}

	@Override
	public int insert(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.insert(boardDTO);
	}

	@Override
	public int update(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.update(boardDTO);
	}

	@Override
	public int delete(int num) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.delete(num);
	}

}
