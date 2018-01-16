package com.iu.s5;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iu.board.BoardDTO;
import com.iu.notice.NoticeService;

@Controller
@RequestMapping(value="/notice/**")
public class NoticeController {
	@Inject
	private NoticeService noticeService;
	
	@RequestMapping(value="noticeList")
	public ModelAndView selectList() throws Exception{
		ModelAndView mv=new ModelAndView();
		List<BoardDTO> ar=noticeService.selectList();
		mv.addObject("list", ar);
		mv.addObject("board", "notice");
		mv.setViewName("board/boardList");
		return mv;
	}
	
}
