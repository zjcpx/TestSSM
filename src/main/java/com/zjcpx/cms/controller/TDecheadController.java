package com.zjcpx.cms.controller;

import com.zjcpx.cms.pojo.BootStrapTableResult;
import com.zjcpx.cms.pojo.TDechead;
import com.zjcpx.cms.pojo.TaotaoResult;
import com.zjcpx.cms.service.ITdecheadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * PackageName:com.zjcpx.cms.controller
 * PROJECT_NAME:TestSSM
 * ClassName: TDecheadController
 * Package: com.zjcpx.cms.controller
 *
 * @Author zjcxp.com
 * @Create 2024/4/15 14:40
 * @Version 1.0
 * Description:
 */
@Controller
@RequestMapping("/TDhechead")
public class TDecheadController {

    @Autowired
    private ITdecheadService tdecheadService;

    @GetMapping("getTDechead")
    @ResponseBody
    public TaotaoResult getTDechead(int id){
        TDechead tDechead = tdecheadService.queryTDechead(id);
//        System.out.println(tDechead);
        return TaotaoResult.ok(tDechead);

    }


    @RequestMapping(value = "/addTDechead",method = RequestMethod.POST)

    public TaotaoResult addTDechead(TDechead tDechead){
        TaotaoResult result = tdecheadService.insertTDechead(tDechead);
        return result;
    }

    @GetMapping("/pagedQuery")
    @ResponseBody
    public BootStrapTableResult pagedQuery( int page, int rows, String sortName, String sortOrder){
        BootStrapTableResult result = tdecheadService.pagingQuery(page, rows, sortName, sortOrder);
        return result;

    }
}
