package br.com.dankicommerce.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;

@Controller
@Path("produto")
public class ProdutoController {

    @Get("")
    public void produto() {

    }

    @Get("form")
    public void formproduto() {

    }
}
