package com.zaw.heraservice.service;

import com.zaw.heraservice.controller.resp.OneArrResp;

/**
 * 算法接口
 *
 * @author zhangaiwen
 */
public interface IAlgorithmService {

    /**
     * 一维数组动态和:
     * eg: 输入:nums = [3,1,2,10,1]   输出:[3,4,6,16,17]
     *
     * @param intArr 一维数组
     * @return 动态和
     */
    OneArrResp getSum(Integer[] intArr);
}
