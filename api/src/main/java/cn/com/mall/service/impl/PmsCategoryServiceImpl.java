package cn.com.mall.service.impl;

import cn.com.mall.mapper.PmsCategoryMapper;
import cn.com.mall.service.PmsCategoryService;
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
