package com.qingbo.ginkgo.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingbo.ginkgo.base.entity.CommonMap;
import com.qingbo.ginkgo.base.repository.CommonMapRepository;
import com.qingbo.ginkgo.base.service.CommonMapService;
import com.qingbo.ginkgo.common.result.Result;

@Service("commonMapService")
public class CommonMapServiceImpl implements CommonMapService {

	@Autowired CommonMapRepository commonMapRepository;
	
	@Override
	public Result<List<CommonMap>> listMaps() {
		List<CommonMap> maps = commonMapRepository.findAll();
		return Result.newSuccess(maps);
	}

}
