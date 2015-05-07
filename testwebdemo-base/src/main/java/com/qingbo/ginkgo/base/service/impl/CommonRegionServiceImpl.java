package com.qingbo.ginkgo.base.service.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qingbo.ginkgo.base.entity.CommonRegion;
import com.qingbo.ginkgo.base.repository.CommonRegionRepository;
import com.qingbo.ginkgo.base.service.CommonRegionService;
import com.qingbo.ginkgo.base.util.SpecUtil;
import com.qingbo.ginkgo.common.result.Result;
import com.qingbo.ginkgo.common.result.SpecParam;
import com.qingbo.ginkgo.common.util.SimpleLogFormater;

@Service("commonRegionService")
public class CommonRegionServiceImpl implements CommonRegionService {

	@Autowired CommonRegionRepository commonRegionRepository;
	private static Log log = LogFactory.getLog(CommonRegionServiceImpl.class);

	@Override
	public Result<List<CommonRegion>> listRegionChildren(Integer code) {
		List<CommonRegion> regions = commonRegionRepository.findByParentCode(code);
		return Result.newSuccess(regions);
	}

	@Override
	public Result<List<CommonRegion>> listCommonRegion(
			SpecParam<CommonRegion> specs) {
		log.info(SimpleLogFormater.formatParams());
		Result<List<CommonRegion>> result;
		// 准备条件
		specs.eq("deleted", false);
		List<CommonRegion> commonRegion;
		try{
			commonRegion = commonRegionRepository.findAll(SpecUtil.spec(specs));
		}catch(Exception e){
			result = Result.newFailure("数据错误", "在获取地区列表时发生数据操作错误。");
			log.error(SimpleLogFormater.formatException(result.getMessage(), e));
			log.info(SimpleLogFormater.formatResult(result));
			return result;
		}
		// 返回结果
		result = Result.newSuccess(commonRegion);
		log.info(SimpleLogFormater.formatResult(result));
		return result;
	}
	


}
