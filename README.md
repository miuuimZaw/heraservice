# heraservice
基础业务

TODO
* [ ] 完成SpringBoot2.3.3官方文档
* [ ] leetcode算法题
* [ ] 微服务网关架构:负载均衡、路由、鉴权、转发
* [ ] 集成jetcache
* [ ] 集成RocketMQ
* [ ] 集成Kafka
* [ ] 集成EasyExcel
* [ ] 扩充文件上传功能
* [ ] 连接数据库,并选择ORM框架,尝试配置多数据源以及分库分表
* [ ] redis以及memcache
* [ ] 接口权限控制

****
### 算法题解思路
+ 一维数组动态和
<p>
较优解:原地求和
</p>

```
    for(int i=1 ; i<nums.size(); ++i){
        nums[i] +=nums[i-1];
    }
    return nums;
```

+
