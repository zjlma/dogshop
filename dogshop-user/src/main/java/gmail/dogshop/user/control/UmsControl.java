package gmail.dogshop.user.control;

import gmail.dogshop.user.bean.Ums;
import gmail.dogshop.user.service.UmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    private UmsService umsService;

    /*
     获取所有用户
     */
    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<Ums> getAllUser(){
        return umsService.getAllUser();
    }

    /*
    删除用户(id)
     */
    @RequestMapping("/delUser")
    public String delAddress(@RequestParam("id") int id){
        int count = umsService.delUser(id);
        if (count > 0){
            return "ok";
        }else{
            return "false";
        }
    }

    /*
    修改用户
     */
    @RequestMapping("updateUser")
    public String updateUser( Ums ums){
        int count = umsService.updateUser(ums);
        if (count>0){
            return "ok";
        }else {
            return "false";
        }
    }

    /*
    查找对应用户
     */
    @RequestMapping("findUser")
    @ResponseBody
    public Ums findUser(@RequestParam("id") int id){
        Ums ums = umsService.findUser(id);
        if(ums!=null){
            return ums;
        }else {
            return null;
        }
    }

    /*
    添加用户
     */
    @RequestMapping("insertUser")
    public String insertUser(Ums ums){
        int count = umsService.insertUser(ums);
        if (count>0){
            return "ok";
        }else {
            return "false";
        }
    }


    /*
    测试启动
     */
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello ums!";
    }

}
