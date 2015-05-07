package com.qingbo.ginkgo.base.repository;

import java.util.List;
import java.util.Map;

public interface TongjiRepository {
	int count(String sql);
	List<?> list(String sql);
	Object[] sums(String sql);
	int count(String sql, Map<String, Object> params);
}
