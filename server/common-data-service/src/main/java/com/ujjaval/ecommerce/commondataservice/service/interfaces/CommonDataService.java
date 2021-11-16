package com.tuhungkien.ecommerce.commondataservice.service.interfaces;

import com.tuhungkien.ecommerce.commondataservice.dto.ProductInfoDTO;
import com.tuhungkien.ecommerce.commondataservice.entity.sql.info.ProductInfo;
import com.tuhungkien.ecommerce.commondataservice.model.FilterAttributesResponse;
import com.tuhungkien.ecommerce.commondataservice.model.HomeTabsDataResponse;
import com.tuhungkien.ecommerce.commondataservice.model.MainScreenResponse;
import com.tuhungkien.ecommerce.commondataservice.model.SearchSuggestionResponse;

import java.util.HashMap;
import java.util.List;

public interface CommonDataService {

    MainScreenResponse getHomeScreenData(String apiName);

    FilterAttributesResponse getFilterAttributesByProducts(String queryParams);

    ProductInfoDTO getProductsByCategories(String queryParams);

    HashMap<Integer, ProductInfo> getProductsById(String queryParams);

    HomeTabsDataResponse getBrandsAndApparelsByGender(String apiName);

    SearchSuggestionResponse getSearchSuggestionList();
}

