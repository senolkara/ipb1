package com.karakurt.homework1.DataAccess.Product;

import com.karakurt.homework1.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Long> {
    List<Product> findAllByLastDateBefore(Date date);
    List<Product> findAllByLastDateAfterOrLastDateNull(Date date);
}
