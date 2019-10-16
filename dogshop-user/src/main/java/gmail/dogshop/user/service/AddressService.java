package gmail.dogshop.user.service;

import gmail.dogshop.user.bean.UmsReceiveAddress;

import java.util.List;

public interface AddressService {

    /*
  获取所有地址
   */
    public List<UmsReceiveAddress> getAllAddress();

    /*
    删除地址
     */
    public int delAddress(int id);

    /*
    查询指定地址
     */
    public UmsReceiveAddress findAddress(int id);

    /*
    添加地址
     */
    public int insertAddress(UmsReceiveAddress umsReceiveAddress);

    /*
    更新所有地址
     */
    public int updateAddress(UmsReceiveAddress umsReceiveAddress);
}
