/*******************************************************************************
 * $Header$
 * $Revision$
 * $Date$
 *
 *==============================================================================
 *
 * Copyright (c) 2001-2012 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2016年7月22日
 *******************************************************************************/


package com.showmecoo.web.management.spi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.showmecoo.web.management.entity.OrderEntity;
import com.showmecoo.web.management.spi.dao.OrderInternalDao;

/**
 * 订单管理DAO类，提供基础的CRUD方法
 * 订单模块对外提供的接口
 *
 * @author weixin (mailto:weixin@showmecoo.com)
 */

public interface OrderRepsitory extends PagingAndSortingRepository<OrderEntity, String>, OrderInternalDao{

}

/*
 * 修改历史
 * $Log$ 
 */