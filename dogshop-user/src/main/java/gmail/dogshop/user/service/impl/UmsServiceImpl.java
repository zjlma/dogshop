package gmail.dogshop.user.service.impl;

import gmail.dogshop.user.service.UmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: dogshop-user
 * @description:
 * @author: Mr.Zjl
 * @create: 2019-10-08 14:05
 **/
@Service("UmsService")
public class UmsServiceImpl implements UmsService {
    @Autowired
    UmsService umsService;
}
