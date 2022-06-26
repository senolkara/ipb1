package com.karakurt.homework1.DataAccess.ProductComment;

import com.karakurt.homework1.Entities.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface IProductCommentRepository extends JpaRepository<ProductComment,Long> {
    List<ProductComment> findProductCommentByUser_Id(Long id);
    List<ProductComment> findProductCommentByProduct_Id(Long id);
    List<ProductComment> findProductCommentByProduct_IdAndCommentDateBetween(Long id, Date startDate, Date finishDate);
    List<ProductComment> findProductCommentByUser_IdAndCommentDateBetween(Long id, Date startDate, Date finishDate);
}
