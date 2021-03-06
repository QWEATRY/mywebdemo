package com.xxx.controller;

import com.xxx.domain.Favorite;
import com.xxx.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/favorite")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @RequestMapping("/showAllFar")
    public ModelAndView showAllFar(HttpServletRequest request)
    {
        Integer id=(Integer)request.getSession().getAttribute("userId");
        List<Favorite> list=favoriteService.selectAllByUserId(id);
        ModelAndView mv=new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("showAllFar");
        return mv;
    }

    @RequestMapping("/toAddFar")
    public String toAddFar()
    {
        return "addFar";
    }

    @RequestMapping("/addFar")
    public String addFar(Favorite favorite)
    {
        favoriteService.insertFavorite(favorite);

        List<Favorite> favorites=favoriteService.selectAll();
        System.out.println(favorites);

        return "redirect:/favorite/showAllFar";
    }

}
