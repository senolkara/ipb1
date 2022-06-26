package com.karakurt.homework1.Business.Product;

import com.karakurt.homework1.DataAccess.Product.IProductDal;
import com.karakurt.homework1.Entities.Product;
import com.karakurt.homework1.Entities.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManager implements IProductService {

    private final IProductDal iProductDal;
    @Override
    public List<ProductComment> getCommentForProduct(Long id) {
        return this.iProductDal.getCommentForProduct(id);
    }

    @Override
    public List<Product> getExpiredDateProduct(Date date) {
        return this.iProductDal.getExpiredDateProduct(date);
    }

    @Override
    public List<Product> getNotExpiredDateProduct(Date date) {
        return this.iProductDal.getNotExpiredDateProduct(date);
    }

    @Override
    public List<ProductComment> getProductCommentInDateRange(Long id, Date startDate, Date finishDate) {
        return this.iProductDal.getProductCommentInDateRange(id, startDate, finishDate);
    }
}
