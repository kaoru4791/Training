package com.ws.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by thiennt on 5/21/14.
 */
@Controller
@RequestMapping("/emp")
public class RestController {
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String getEmployeeById(@PathVariable int id, ModelMap modelMap){
        Employee emp = new Employee();
        emp.setEmpId(id);
        emp.setfName("Thien");
        emp.setlName("Ngo");
        emp.setAge(24);

        modelMap.addAttribute("emp",emp);

        return "list";
    }

    @RequestMapping(value = "/json/{id}",method = RequestMethod.GET)
    public @ResponseBody Employee getJsonData(@PathVariable int id) {
        Employee emp = new Employee();
        emp.setEmpId(id);
        emp.setfName("Thienjson");
        emp.setlName("Ngo");
        emp.setAge(24);

        return emp;
    }

}
