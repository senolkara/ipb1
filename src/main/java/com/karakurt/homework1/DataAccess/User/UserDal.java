package com.karakurt.homework1.DataAccess.User;

import com.karakurt.homework1.DataAccess.ProductComment.IProductCommentRepository;
import com.karakurt.homework1.Entities.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDal implements IUserDal {

    private final IProductCommentRepository iProductCommentRepository;

    @Override
    public List<ProductComment> getProductCommentForUser(Long id) {
        return this.iProductCommentRepository.findProductCommentByUser_Id(id);
    }

    @Override
    public List<ProductComment> getUserCommentInDateRange(Long id, Date startDate, Date finishDate) {
        return iProductCommentRepository.findProductCommentByUser_IdAndCommentDateBetween(id, startDate, finishDate);
    }
}
