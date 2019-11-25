package spring.controller;


import modelbase.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import server.DataBaseServer;

@Controller
@RequestMapping(value = "/hello")
public class Hello {

    @Autowired
    private DataBaseServer server;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Employee gethello(@RequestParam("id") Integer id) {
        return server.findById(id);
    }

}
