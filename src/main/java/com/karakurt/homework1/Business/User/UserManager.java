package com.karakurt.homework1.Business.User;

import com.karakurt.homework1.DataAccess.User.IUserDal;
import com.karakurt.homework1.Entities.ProductComment;
import com.karakurt.homework1.Entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserManager implements IUserService {

    private final IUserDal iUserDal;
    @Override
    public List<ProductComment> getProductCommentForUser(Long id) {
        return this.iUserDal.getProductCommentForUser(id);
    }
    @Override
    public List<ProductComment> getUserCommentInDateRange(Long id, Date startDate, Date finishDate) {
        return this.iUserDal.getUserCommentInDateRange(id, startDate, finishDate);
    }

}
