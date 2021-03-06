package com.iu.s5;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.ls.LSException;

import com.iu.board.BoardDTO;
import com.iu.notice.NoticeDTO;
import com.iu.notice.NoticeService;
import com.iu.util.ListData;

@Controller
@RequestMapping(value="/notice/**")
public class NoticeController {
	@Inject
	private NoticeService noticeService;
	
	@RequestMapping(value="noticeList")
	public ModelAndView selectList(ListData listData) throws Exception{
		/*System.out.println("search:"+listData.getSearch());
		System.out.println("kind :"+listData.getKind());
		System.out.println("curPage :"+listData.getCurPage());*/
		ModelAndView mv=new ModelAndView();
		List<BoardDTO> ar=noticeService.selectList(listData);
		mv.addObject("page", listData);
		mv.addObject("list", ar);
		mv.addObject("board", "notice");
		mv.setViewName("board/boardList");
		return mv;
	}
	
	@RequestMapping(value="noticeWrite", method=RequestMethod.POST)
	public ModelAndView noticeWrite(NoticeDTO noticeDTO) throws Exception{
		ModelAndView mv=new ModelAndView();
		int result=noticeService.insert(noticeDTO);
		if(result>0){
		mv.addObject("message", "Success");
		}else{
		mv.addObject("message", "fail");
		}
		mv.addObject("path", "noticeList");
		mv.setViewName("common/result");
		return mv;
	}
	
	@RequestMapping(value="noticeWrite",method=RequestMethod.GET)
	public String noticeWrite(Model model) throws Exception{
		model.addAttribute("board", "notice");
		return "board/boardWrite";
	}
	
}
