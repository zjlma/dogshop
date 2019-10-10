package gmail.dogshop.user.service.impl;

import gmail.dogshop.user.bean.Ums;
import gmail.dogshop.user.mapper.UmsMapper;
import gmail.dogshop.user.service.UmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: dogshop-user
 * @description:
 * @author: Mr.Zjl
 * @create: 2019-10-08 14:05
 **/
@Service("UmsService")
public class UmsServiceImpl implements UmsService {
    private final UmsMapper umsMapper;
    @Autowired
    public UmsServiceImpl(UmsMapper umsMapper){
        this.umsMapper = umsMapper;
    }

    @Override
    public List<Ums> getAllUser() {
        return umsMapper.getAllUser();
    }
}
