package org.example.operation.restcontroller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/operations")
public class OperationAPI {

    @Value("${operator.property}")
    private String property1;

    @RequestMapping("/operation1")
    @ResponseBody
    public String operation1(@RequestParam String operator){
        return operator+": operation done with "+property1;
    }
}
