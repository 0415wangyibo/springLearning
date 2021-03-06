package com.wangyb.springlearning.vueserver.pojo;

import lombok.Data;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/8 16:35
 * Modified By:
 * Description:
 */

@Data
public class HttpResult {

    // 响应码
    private Integer code;
    // 响应体
    private String body;

    public HttpResult() {
        super();
    }

    public HttpResult(Integer code, String body) {
        super();
        this.code = code;
        this.body = body;
    }
}