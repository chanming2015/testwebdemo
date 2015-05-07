package com.qingbo.ginkgo.base.service;

import java.util.List;

import com.qingbo.ginkgo.base.entity.CommonRegion;
import com.qingbo.ginkgo.common.result.Result;
import com.qingbo.ginkgo.common.result.SpecParam;

public interface CommonRegionService {
	
	/**
	 *	获取所有下级地区
	 */
	public Result<List<CommonRegion>> listRegionChildren(Integer code);

	public Result<List<CommonRegion>> listCommonRegion(
			SpecParam<CommonRegion> specs);
	
}
