package xujun.tifa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xujun.tifa.bean.Lover;
import xujun.tifa.dao.LoverRepository;

@RestController("/violet")
public class LoverController {

	@Autowired
	private LoverRepository lover;
	
	@RequestMapping("/myLovers")
	private String test() {
		List<Lover> lovers = lover.getUsers();
		String all = "";
		for(Lover lover : lovers) {
			all += lover.getName();
		}
		return all;
	}
}
