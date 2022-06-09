package top.sailliao.miao.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class BaseRequest {
    /**
     * 用户ID
     */
    private Long userId = 0L;
    /**
     * 页码
     */
    private Long pageNumber = 1L;
    /**
     * 每页数量
     */
    private Long pageSize = 20L;
}
