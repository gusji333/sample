package multi.com.f.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import multi.com.f.dto.MemberDTO;

@RestController
public class HelloController {
	
	@RequestMapping(value = "/")
	public String hello() {
		System.out.println("HelloController hello()" + new Date());
		
		return "헬로";
	}
	
	@RequestMapping(value = "/member")
	public MemberDTO getMember() {
		System.out.println("HelloController getMember() " + new Date());
		
		MemberDTO dto = new MemberDTO("aaa", "111", "AAA", "aaa@naver.com", 3);
		
		return dto;
	}
	
	@RequestMapping(value = "/memberlist")
	public List<MemberDTO> memberlist(){
		System.out.println("HelloController memberlist() " + new Date());
		
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(new MemberDTO("aaa", "111", "AAA", "aaa@naver.com", 3));
		list.add(new MemberDTO("bbb", "222", "BBB", "bbb@naver.com", 3));
		list.add(new MemberDTO("ccc", "333", "CCC", "ccc@naver.com", 3));
		
		return list;
	}
}
