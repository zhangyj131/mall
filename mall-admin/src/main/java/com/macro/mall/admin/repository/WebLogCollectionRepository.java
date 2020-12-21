package com.macro.mall.admin.repository;

import com.macro.mall.bo.WebLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 商品收藏Repository
 * Created by macro on 2018/8/2.
 */
public interface WebLogCollectionRepository extends MongoRepository<WebLog,String> {
    
}
