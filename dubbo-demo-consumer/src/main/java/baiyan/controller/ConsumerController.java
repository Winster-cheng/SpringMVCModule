package baiyan.controller;


import baiyan.service.impl.UserDubboConsumerService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: peilongcheng
 * @Date: 2019/3/3 19:00
 * @Description:
 */
@Controller
@RequestMapping("/save")
public class ConsumerController {
    @Reference
    UserDubboConsumerService userDubboConsumerService;

    @GetMapping("hello")
    public List<BIConversion.User> getList(){
        List a=userDubboConsumerService.getList();
        return a;
    }
}
