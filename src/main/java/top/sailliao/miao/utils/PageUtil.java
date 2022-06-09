package top.sailliao.miao.utils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Component;
import top.sailliao.miao.request.BaseRequest;

@Component
public class PageUtil {
	public <T> Page<T> of(BaseRequest request) {
		return new Page<>(request.getPageNumber(), request.getPageSize());
	}
}
