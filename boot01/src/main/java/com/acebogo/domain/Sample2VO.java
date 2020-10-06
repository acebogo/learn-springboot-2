package com.acebogo.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @Data을 이용하면 getter/setter를 생성하고 equals(), hashCode(), toString(),
 * 파라미터가 없는 기본 생성자까지 자동으로 만들어 주기 때문에 무척이나
 * 편리합니다.
 */
@Data
@ToString(exclude = {"val3"})
public class Sample2VO {

    private String val1;
    private String val2;
    private String val3;

}
