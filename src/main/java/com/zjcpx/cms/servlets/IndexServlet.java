package com.zjcpx.cms.servlets;

import com.zjcpx.cms.pojo.TDechead;
import com.zjcpx.cms.service.ITdecheadService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * PackageName:com.zjcpx.cms.servlets
 * PROJECT_NAME:TestSSM
 * ClassName: IndexServlet
 * Package: com.zjcpx.cms.servlets
 *
 * @Author zjcxp.com
 * @Create 2024/4/17 11:03
 * @Version 1.0
 * Description:
 */

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    @Autowired
    private ITdecheadService service;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<TDechead> decheads = service.getAllTDecheads();
        HttpSession session = req.getSession();
        session.setAttribute("Decheads",decheads);

    }
}
