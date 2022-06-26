package com.karakurt.homework1.DataAccess.Product;

import com.karakurt.homework1.DataAccess.ProductComment.IProductCommentRepository;
import com.karakurt.homework1.Entities.Product;
import com.karakurt.homework1.Entities.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDal implements IProductDal {

    private final IProductCommentRepository iProductCommentRepository;
    private final IProductRepository iProductRepository;

    @Override
    public List<ProductComment> getCommentForProduct(Long id) {
        return this.iProductCommentRepository.findProductCommentByProduct_Id(id);
    }

    @Override
    public List<Product> getExpiredDateProduct(Date date) {
        return this.iProductRepository.findAllByLastDateBefore(date);
    }

    @Override
    public List<Product> getNotExpiredDateProduct(Date date) {
        return this.iProductRepository.findAllByLastDateAfterOrLastDateNull(date);
    }

    @Override
    public List<ProductComment> getProductCommentInDateRange(Long id, Date startDate, Date finishDate) {
        return this.iProductCommentRepository.findProductCommentByProduct_IdAndCommentDateBetween(id, startDate, finishDate);
    }
}
