package com.qingbo.ginkgo.base.service;

import java.util.List;
import java.util.Map;

import com.qingbo.ginkgo.common.result.Result;
import com.qingbo.ginkgo.common.util.SqlBuilder;

@SuppressWarnings("rawtypes")
public interface TongjiService {
	Result<Integer> count(SqlBuilder sqlBuilder);
	Result<Integer> count(SqlBuilder sqlBuilder, Map<String, Object> params);
	Result<List> list(SqlBuilder sqlBuilder);
	Result<Object[]> sums(SqlBuilder sqlBuilder);
}
