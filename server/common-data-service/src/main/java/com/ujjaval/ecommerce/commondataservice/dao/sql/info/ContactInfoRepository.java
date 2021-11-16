package com.tuhungkien.ecommerce.commondataservice.dao.sql.info;

import com.tuhungkien.ecommerce.commondataservice.entity.sql.info.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactInfoRepository extends JpaRepository<ContactInfo, Integer> {
}
