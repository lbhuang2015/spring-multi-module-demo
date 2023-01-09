package org.example.scheduler;

import org.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class TestScheduler {

    @Autowired
    TestService testService;

    @Value("${scheduler.property}")
    private String property1;

    @RequestMapping("/info")
    @ResponseBody
    public Map<String, String> getInfo(@RequestParam String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", property1 + testService.testService(name));
        return map;
    }
}