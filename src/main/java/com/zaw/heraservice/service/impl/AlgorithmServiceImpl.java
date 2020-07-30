package com.zaw.heraservice.service.impl;

import com.zaw.heraservice.controller.resp.OneArrResp;
import com.zaw.heraservice.service.IAlgorithmService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 算法实现类
 *
 * @author zhangaiwen
 */
@Service("algorithmService")
public class AlgorithmServiceImpl implements IAlgorithmService {

    /**
     * 一维数组动态和:
     * eg: 输入:nums = [3,1,2,10,1]   输出:[3,4,6,16,17]
     *
     * @param intArr 一维数组
     * @return 动态和
     */
    @Override
    public OneArrResp getSum(int[] intArr) {
        intArr = new int[]{3, 1, 2, 10, 1};
        List<Integer> sunList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
            sunList.add(sum);
        }

        OneArrResp resp = new OneArrResp();
        resp.setIntArr(sunList.toArray(new Integer[0]));

        return resp;
    }

}
