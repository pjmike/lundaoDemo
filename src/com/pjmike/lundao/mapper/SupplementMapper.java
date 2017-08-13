package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Supplement;

public interface SupplementMapper {
	/**
	 * 提交完善版本
	 * @param supplement
	 * @return
	 */
	int insertsupplement(Supplement supplement);
}
