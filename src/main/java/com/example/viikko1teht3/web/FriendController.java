package com.example.viikko1teht3.web;
import com.example.viikko1teht3.domain.Friend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FriendController {
	List<Friend> kaverilista = new ArrayList<>();
	
	@GetMapping("/index")
	public String friendAdded( Friend friend, Model model) {
		if(friend.getName()!=null) {
			if(friend.getName().length()!=0) {
				kaverilista.add(friend);
			}			
		};		
		model.addAttribute("friends",kaverilista);
		model.addAttribute("friend",new Friend());
		return "index";
	}
}
