package com.alibaba.dubbo.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Controller
@Path("/server")
public class ServerController {

    @GET
    @Path("/sshInit")
    @Produces({MediaType.TEXT_HTML})
    public ModelAndView sshInit(@Context HttpServletRequest request, @Context HttpServletResponse response,
    		@QueryParam("ip_addr") String ipAddr,
    		@QueryParam("account") String account,
    		@QueryParam("password") String password,
    		@QueryParam("cmd_line") String cmdLine,
    		@QueryParam("code") String code
    		) {
		Map<String, Object> model = new HashMap<String, Object>();
		String result = "";
		String info = "";

		model.put("ip_addr", ipAddr);
		model.put("account", account);
		model.put("password", password);
		model.put("cmd_line", cmdLine);
		model.put("code", code);

        model.put("result", result);
        model.put("info", info);
        return new ModelAndView("/server/sshInit", model);
    }
}