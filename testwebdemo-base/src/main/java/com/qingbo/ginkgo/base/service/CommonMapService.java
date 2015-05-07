package com.qingbo.ginkgo.base.service;

import java.util.List;

import com.qingbo.ginkgo.base.entity.CommonMap;
import com.qingbo.ginkgo.common.result.Result;

public interface CommonMapService {
	
	/**
	 *	获取所有Map
	 */
	public Result<List<CommonMap>> listMaps();
	
}
