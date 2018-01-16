package com.iu.qna;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.board.BoardDTO;
import com.iu.board.BoardService;

@Service
public class QnaService implements BoardService {
	
	@Autowired
	private QnaDAO qnaDAO;

	@Override
	public List<BoardDTO> selectList() throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.selectList();
	}

	@Override
	public BoardDTO selectOne(int num) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.selectOne(num);
	}

	@Override
	public int insert(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.insert(boardDTO);
	}

	@Override
	public int update(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.update(boardDTO);
	}

	@Override
	public int delete(int num) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.delete(num);
	}
	
	public int reply(BoardDTO boardDTO) throws Exception{
		qnaDAO.replyUpdate(boardDTO);
		return qnaDAO.replyInsert(boardDTO, boardDTO);
	}

}
