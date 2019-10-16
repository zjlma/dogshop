package gmail.dogshop.user.mapper;

import gmail.dogshop.user.bean.UmsReceiveAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {
    List<UmsReceiveAddress> getAllAddress();

    int delAddress(int id);

    UmsReceiveAddress findAddress(int id);

    int insertAddress(UmsReceiveAddress umsReceiveAddress);

    int updateAddress(UmsReceiveAddress umsReceiveAddress);
}
