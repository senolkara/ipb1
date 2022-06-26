package com.karakurt.homework1.RestAPI;

import com.karakurt.homework1.Business.Product.IProductService;
import com.karakurt.homework1.Business.User.IUserService;
import com.karakurt.homework1.Entities.Product;
import com.karakurt.homework1.Entities.ProductComment;
import com.karakurt.homework1.Needs.Needs;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {
    private final Date currentDate = Needs.getCurrentDate();
    private final IUserService iUserService;
    private final IProductService iProductService;

    @GetMapping("/user/{id}/comments")
    public List<ProductComment> getProductCommentForUser(@PathVariable Long id){
        return iUserService.getProductCommentForUser(id);
    }

    @GetMapping("/user/{id}/comments/in-date-range/{startDate}/{finishDate}")
    public List<ProductComment> getUserCommentInDateRange(@PathVariable Long id,
                                                          @PathVariable Date startDate,
                                                          @PathVariable Date finishDate){
        return this.iUserService.getUserCommentInDateRange(id, startDate, finishDate);
    }

    @GetMapping("/product/{id}/comments")
    public List<ProductComment> getCommentForProduct(@PathVariable Long id){
        return iProductService.getCommentForProduct(id);
    }

    @GetMapping("/product/{id}/comments/in-date-range/{startDate}/{finishDate}")
    public List<ProductComment> getProductCommentInDateRange(@PathVariable Long id,
                                                             @PathVariable Date startDate,
                                                             @PathVariable Date finishDate){
        return this.iProductService.getProductCommentInDateRange(id, startDate, finishDate);
    }

    @GetMapping("/products/expired-date")
    public List<Product> getExpiredDateProduct(){
        return this.iProductService.getExpiredDateProduct(this.currentDate);
    }

    @GetMapping("/products/not-expired-date-or-null")
    public List<Product> getNotExpiredDateProduct(){
        return this.iProductService.getNotExpiredDateProduct(this.currentDate);
    }
}
