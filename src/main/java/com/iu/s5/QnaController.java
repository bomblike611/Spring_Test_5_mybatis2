package com.iu.s5;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iu.board.BoardDTO;
import com.iu.qna.QnaDTO;
import com.iu.qna.QnaService;
import com.iu.util.ListData;

@Controller
@RequestMapping(value="/qna/**")
public class QnaController {
	
	@Inject
	private QnaService qnaService;
	
	@RequestMapping(value="qnaList")
	public ModelAndView selectList(ListData listData) throws Exception{
		ModelAndView mv=new ModelAndView();
		List<BoardDTO> ar=qnaService.selectList(listData);
		mv.addObject("page", listData);
		mv.addObject("board", "qna");
		mv.addObject("list", ar);
		mv.setViewName("board/boardList");
		return mv;	
	}
	
	
}
