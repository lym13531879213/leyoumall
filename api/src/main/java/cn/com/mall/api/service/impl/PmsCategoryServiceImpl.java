package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.PmsCategoryService;
import cn.com.mall.api.mapper.PmsCategoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liaoyuming
 * @date 2022/1/2 16:10
 */
@Service
public class PmsCategoryServiceImpl implements PmsCategoryService {

    @Resource
    private PmsCategoryMapper pmsCategoryMapper;



}
