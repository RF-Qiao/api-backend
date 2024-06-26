package com.qarar.apibackend.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.qarar.apibackend.model.entity.ProductInfo;



public interface ProductInfoService extends IService<ProductInfo> {
    /**
     * 有效产品信息
     * 校验
     *
     * @param add         是否为创建校验
     * @param productInfo 产品信息
     */
    void validProductInfo(ProductInfo productInfo, boolean add);
}
