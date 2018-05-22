package ch.springboot.demo.controller;

import ch.springboot.demo.bo.DemoBo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "测试controller", tags = {"测试操作controller"})
@Controller
public class DemoController {

    @GetMapping(value = {"/","/index"})
    @ApiOperation(value = "默认请求接口", notes = "默认请求接口详细描述")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/swagger")
    @ResponseBody
    @ApiOperation(value = "swagger接口", notes = "swagger接口详细描述")
    public DemoBo swagger(@ApiParam(name = "no", value = "号码", required = true) int no){
        DemoBo bo = new DemoBo();
        bo.setNo(no);
        return bo;
    }
}
