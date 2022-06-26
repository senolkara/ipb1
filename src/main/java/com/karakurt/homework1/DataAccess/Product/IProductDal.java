package com.karakurt.homework1.DataAccess.Product;

import com.karakurt.homework1.Entities.Product;
import com.karakurt.homework1.Entities.ProductComment;

import java.sql.Date;
import java.util.List;

public interface IProductDal {
    List<ProductComment> getCommentForProduct(Long id);
    List<Product> getExpiredDateProduct(Date date);
    List<Product> getNotExpiredDateProduct(Date date);
    List<ProductComment> getProductCommentInDateRange(Long id, Date startDate, Date finishDate);
}
