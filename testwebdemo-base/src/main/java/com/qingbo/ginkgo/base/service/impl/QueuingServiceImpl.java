package com.qingbo.ginkgo.base.service.impl;

import org.springframework.stereotype.Service;

import com.qingbo.ginkgo.base.service.QueuingService;
import com.qingbo.ginkgo.common.result.Result;
import com.qingbo.ginkgo.common.util.QueuingMake;

@Service("queuingService")
public class QueuingServiceImpl implements QueuingService {

	public Result<Long> next(String src) {
		Long queuing = QueuingMake.next(src);
		return Result.newSuccess(queuing);
	}

}
