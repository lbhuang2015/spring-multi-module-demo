package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
@Api(tags="tests")
public class TestController {

    @Autowired
    TestService testService;

    @Value("${controller.property}")
    private String property1;


    @ApiOperation(value="get test info",notes="a example for get Info by get")
    @RequestMapping(value = "/getinfo",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> getInfo(@RequestParam String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", property1 +", " + testService.testService(name));
        return map;
    }
}