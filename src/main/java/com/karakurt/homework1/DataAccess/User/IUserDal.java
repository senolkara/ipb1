package com.karakurt.homework1.DataAccess.User;

import com.karakurt.homework1.Entities.ProductComment;

import java.sql.Date;
import java.util.List;

public interface IUserDal {
    List<ProductComment> getProductCommentForUser(Long id);
    List<ProductComment> getUserCommentInDateRange(Long id, Date startDate, Date finishDate);
}
