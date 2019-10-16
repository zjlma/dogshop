package gmail.dogshop.user.service;

import gmail.dogshop.user.bean.Ums;

import java.util.List;

/**
 * @program: dogshop-user
 * @description:
 * @author: Mr.Zjl
 * @create: 2019-10-08 13:25
 **/
public interface UmsService  {
    /*
    获取所有地址
     */
    public List<Ums> getAllUser();

    /*
    删除地址
     */
    public int delUser(int id);

    /*
    查询指定地址
     */
    public Ums findUser(int id);

    /*
    添加地址
     */
    public int insertUser(Ums ums);

    /*
    更新所有地址
     */
    public int updateUser(Ums ums);

}
