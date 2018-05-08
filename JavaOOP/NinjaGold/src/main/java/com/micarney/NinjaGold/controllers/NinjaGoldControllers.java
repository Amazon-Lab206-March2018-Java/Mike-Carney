package com.micarney.NinjaGold.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NinjaGoldControllers {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("gold") == null) {
			ArrayList<String> activitylist = new ArrayList<String>();
			session.setAttribute("gold", 0);
			session.setAttribute("activity", activitylist);
		}
		else {
			ArrayList<String> activitylist = (ArrayList<String>) session.getAttribute("activity");
			int gold = (int)session.getAttribute("gold");
			session.setAttribute("gold", gold);
			session.setAttribute("activity", activitylist);
		}
		return "index.jsp";
	}
	
	@RequestMapping(path="/farm", method=RequestMethod.POST)
	public String farm(HttpSession session) {
		Random random = new Random();
		int collect = random.nextInt(10)+10;
		int gold = (int)session.getAttribute("gold");
		gold = collect + gold;
		session.setAttribute("gold", gold);
		ArrayList<String> activitylist = (ArrayList<String>) session.getAttribute("activity");
		SimpleDateFormat date = new SimpleDateFormat("MMMM dd yyyy, hh:mm a");
		activitylist.add("Earned " + collect + " gold from the farm!  " + date.format(new Date()));
		session.setAttribute("activity", activitylist);
		return "redirect:/";
	}
	@RequestMapping(path="/cave", method=RequestMethod.POST)
	public String cave(HttpSession session) {
		Random random = new Random();
		int collect = random.nextInt(5)+5;
		int gold = (int)session.getAttribute("gold");
		gold = collect + gold;
		session.setAttribute("gold", gold);
		ArrayList<String> activitylist = (ArrayList<String>) session.getAttribute("activity");
		SimpleDateFormat date = new SimpleDateFormat("MMMM dd yyyy, hh:mm a");
		activitylist.add("Earned " + collect + " gold from the cave!  " + date.format(new Date()));
		session.setAttribute("activity", activitylist);
		return "redirect:/";
	}
	@RequestMapping(path="/house", method=RequestMethod.POST)
	public String house(HttpSession session) {
		Random random = new Random();
		int collect = random.nextInt(2)+3;
		int gold = (int)session.getAttribute("gold");
		gold = collect + gold;
		session.setAttribute("gold", gold);
		ArrayList<String> activitylist = (ArrayList<String>) session.getAttribute("activity");
		SimpleDateFormat date = new SimpleDateFormat("MMMM dd yyyy, hh:mm a");
		activitylist.add("Earned " + collect + " gold from the house!  " + date.format(new Date()));
		session.setAttribute("activity", activitylist);
		return "redirect:/";
	}
	@RequestMapping(path="/casino", method=RequestMethod.POST)
	public String casino(HttpSession session){
			Random random = new Random();
			int money = random.nextInt(101)-50;
			int gold = (int)session.getAttribute("gold");
			if (money>0) {
				session.setAttribute("gold", gold+=money);
				ArrayList<String> activity_list = (ArrayList<String>) session.getAttribute("activity");
				SimpleDateFormat date = new SimpleDateFormat("MMMM dd yyyy, hh:mm a");
				activity_list.add("Earned " + money + " golds from the casino!  " + date.format(new Date()));
				session.setAttribute("activity", activity_list);
				return "redirect:/";
			}
			else {
				session.setAttribute("gold", gold+=money);
				ArrayList<String> activity_list = (ArrayList<String>) session.getAttribute("activity");
				SimpleDateFormat date = new SimpleDateFormat("MMMM dd yyyy, hh:mm a");
				activity_list.add("Lost " + (-money) + " gold from the casino!  " + date.format(new Date()));
				session.setAttribute("activity", activity_list);
				return "redirect:/";
			}
		}
}
