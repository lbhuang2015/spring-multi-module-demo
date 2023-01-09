package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags="admins")
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value="/user", method = RequestMethod.GET)
    @ApiOperation(value="get for user",notes="a example for get user info")
    @ResponseBody
    public String getUserInfo(@RequestParam String nameId){
        return "name: User"+nameId;
    }

    @RequestMapping(value="/user", method = RequestMethod.POST)
    @ApiOperation(value="post for user",notes="a post example for get user info")
    @ResponseBody
    public String getUserInfo(@RequestParam String nameId,
                              @RequestBody String data){
        return "name: User"+nameId+data;
    }
}
