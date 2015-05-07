package com.qingbo.ginkgo.base.repository;

import java.util.List;

import com.qingbo.ginkgo.base.entity.CommonRegion;

public interface CommonRegionRepository extends BaseRepository<CommonRegion> {
	List<CommonRegion> findByParentCode(Integer parentCode);
	CommonRegion findByCode(Integer code);
}
