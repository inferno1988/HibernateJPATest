package HibernateJPATest.controller;

import HibernateJPATest.dao.MenusDao;
import HibernateJPATest.model.MenuEntry;
import HibernateJPATest.model.Menus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: atom
 * Date: 22.10.12
 * Time: 18:01
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/uiBuilder/menu")
public class MenuController {
    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);

    @Autowired
    private MenusDao menusDao;

    @RequestMapping("/topMenu")
    public String generateTopMenu(Model model) {
        logger.info("Building top menu");
        Menus menuContainer = menusDao.getMenuByName("topMenu");
        model.addAttribute("menuItems", menuContainer.getMenuEntries());
        return "top_menu";
    }
}
