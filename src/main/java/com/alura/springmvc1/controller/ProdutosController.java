package com.alura.springmvc1.controller;

import com.alura.springmvc1.dao.ProdutoDAO;
import com.alura.springmvc1.model.Produto;
import com.alura.springmvc1.model.TipoPreco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by MarcosNami on 7/16/2017.
 */
@Controller
public class ProdutosController {

    @Autowired
    private ProdutoDAO produtoDAO;

    @RequestMapping("/produtos/form")
    public ModelAndView form() {
        System.out.println("Entrando no Formulario de Produtos");
        ModelAndView mv = new ModelAndView("produtos/form");
        mv.addObject("types", TipoPreco.values());
        return mv;
    }

    @RequestMapping("/produtos")
    public String gravar(Produto produto) {
        System.out.println(produto);
        produtoDAO.gravar(produto);
        return "produtos/ok";
    }

}
