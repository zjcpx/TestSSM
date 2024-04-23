package com.zjcpx.cms.controller;

import com.zjcpx.cms.pojo.TaotaoResult;
import com.zjcpx.cms.service.ITQainfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * PackageName:com.zjcpx.cms.controller
 * PROJECT_NAME:TestSSM
 * ClassName: TQainfoController
 * Package: com.zjcpx.cms.controller
 *
 * @Author zjcxp.com
 * @Create 2024/4/23 17:00
 * @Version 1.0
 * Description:
 */
@Controller
@RequestMapping("/TQainfo")
public class TQainfoController {

    @Autowired
    private ITQainfoService service;

    @GetMapping("getTQainfo")
    @ResponseBody
    public TaotaoResult getTQainfoByFileName( String fieldName){
        TaotaoResult tQainfo = service.getTQainfo(fieldName);
        return tQainfo;
    }
}
