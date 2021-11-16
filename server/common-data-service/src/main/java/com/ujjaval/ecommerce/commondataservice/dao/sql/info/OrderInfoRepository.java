package com.tuhungkien.ecommerce.commondataservice.dao.sql.info;

import com.tuhungkien.ecommerce.commondataservice.entity.sql.info.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Integer> {
}
