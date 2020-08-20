package com.zaw.heraservice.bo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.swing.text.Position;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 项目属性文件
 *
 * @author zhangaiwen
 */
@Data
@Component
@ConfigurationProperties(prefix = "personal")
public class AppPropertiesBO {

    /** 字符 */
    private String str;

    /** 转义字符 */
    private String escapeStr;

    /** 特殊字符 */
    private String specialStr;

    /** 布尔值 */
    private Boolean bol;

    /** 整型 */
    private Integer intValue;

    /** 浮点型 */
    private Double dolValue;

    /** list集合 */
    private List<String> objList;

    /** set集合 */
    private Set<Integer> objSet;

    /** map */
    private Map<String, String> objMap;

}
