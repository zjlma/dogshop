package gmail.dogshop.user.mapper;

import gmail.dogshop.user.bean.Ums;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: dogshop-user
 * @description:
 * @author: Mr.Zjl
 * @create: 2019-10-08 13:25
 **/
@Mapper
public interface UmsMapper {
    List<Ums> getAllUser();
}
