package gmail.dogshop.user.control;

import gmail.dogshop.user.service.UmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: dogshop-user
 * @description:
 * @author: Mr.Zjl
 * @create: 2019-10-08 13:24
 **/
@Controller
@RequestMapping("/ums")
public class UmsControl {
    @Autowired
    private UmsService  umsService;
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello ums!";
    }

}
