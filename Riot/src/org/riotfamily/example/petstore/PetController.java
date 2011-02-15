package org.riotfamily.example.petstore;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {

	private static final Logger LOGGER = Logger.getLogger(PetController.class);

	@PostConstruct
	public void init() {
		LOGGER.debug("#### PetController initialized.");
	}

	@RequestMapping(value = "/*/test4711/view.html")
	public String viewArticle(final Model model) {

		return "wide";
	}

}
