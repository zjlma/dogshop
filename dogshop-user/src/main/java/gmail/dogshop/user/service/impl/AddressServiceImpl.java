package gmail.dogshop.user.service.impl;

import gmail.dogshop.user.bean.UmsReceiveAddress;
import gmail.dogshop.user.mapper.AddressMapper;
import gmail.dogshop.user.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: dogshop-user
 * @description:
 * @author: Mr.Zjl
 * @create: 2019-10-10 22:19
 **/
@Service("AddressService")
public class AddressServiceImpl implements AddressService {
    private final AddressMapper addressMapper;
    @Autowired
    AddressServiceImpl(AddressMapper addressMapper){
        this.addressMapper = addressMapper;
    }

    @Override
    public List<UmsReceiveAddress> getAllAddress() {
        return addressMapper.getAllAddress();
    }

    @Override
    public int delAddress(int id) {
        return addressMapper.delAddress(id);
    }

    @Override
    public UmsReceiveAddress findAddress(int id) {
        return addressMapper.findAddress(id);
    }

    @Override
    public int insertAddress(UmsReceiveAddress umsReceiveAddress) {
        return addressMapper.insertAddress(umsReceiveAddress);
    }

    @Override
    public int updateAddress(UmsReceiveAddress umsReceiveAddress) {
        return addressMapper.updateAddress(umsReceiveAddress);
    }
}
