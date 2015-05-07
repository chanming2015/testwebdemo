package com.qingbo.ginkgo.base.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingbo.ginkgo.base.repository.TongjiRepository;
import com.qingbo.ginkgo.base.service.TongjiService;
import com.qingbo.ginkgo.common.result.Result;
import com.qingbo.ginkgo.common.util.SqlBuilder;

@Service("tongjiService")
@SuppressWarnings("rawtypes")
public class TongjiServiceImpl implements TongjiService {
	@Autowired private TongjiRepository tongjiRepository;

	@Override
	public Result<Integer> count(SqlBuilder sqlBuilder) {
		try {
			int count = tongjiRepository.count(sqlBuilder.sql());
			return Result.newSuccess(count);
		}catch (Exception e) {
			return Result.newFailure(1, e.getMessage());
		}
	}

	@Override
	public Result<List> list(SqlBuilder sqlBuilder) {
		try {
			List list = tongjiRepository.list(sqlBuilder.sql());
			return Result.newSuccess(list);
		}catch (Exception e) {
			return Result.newFailure(1, e.getMessage());
		}
	}

	@Override
	public Result<Object[]> sums(SqlBuilder sqlBuilder) {
		try {
			Object[] sums = tongjiRepository.sums(sqlBuilder.sql());
			return Result.newSuccess(sums);
		}catch (Exception e) {
			return Result.newFailure(1, e.getMessage());
		}
	}

	@Override
	public Result<Integer> count(SqlBuilder sqlBuilder, Map<String, Object> params) {
		try {
			int count = tongjiRepository.count(sqlBuilder.sql(), params);
			return Result.newSuccess(count);
		}catch (Exception e) {
			return Result.newFailure(1, e.getMessage());
		}
	}

}
