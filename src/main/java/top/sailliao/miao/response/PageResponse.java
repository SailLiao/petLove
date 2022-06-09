package top.sailliao.miao.response;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class PageResponse<T> {
    /**
     * 返回的数据
     */
    private List<T> list;
    /**
     * 当前页
     */
    private Integer currentPage;
    /**
     * 每页数量
     */
    private Integer pageSize = 20;
    /**
     * 总数量
     */
    private Long totalCount;
    /**
     * 总页数
     */
    private Integer totalPage;

    public static <T> PageResponse<T> of() {
        PageResponse<T> response = new PageResponse<>();
        response.list = new ArrayList<>();
        return response;
    }

    public static <T> PageResponse<T> of(List<T> list) {
        PageResponse<T> response = new PageResponse<>();
        response.list = list;
        response.totalCount = (long) list.size();
        response.totalPage = (int)Math.ceil((double) (response.totalCount / response.pageSize));
        return response;
    }

    public static <T> PageResponse<T> of(List<T> list, Long pageSize) {
        long pages = list.size() / pageSize;
        if (list.size() % pageSize != 0L) {
            ++pages;
        }
        PageResponse<T> response = new PageResponse<>();
        response.list = list;
        response.totalCount = (long)list.size();
        response.totalPage = Math.toIntExact(pages);
        response.pageSize = Math.toIntExact(pageSize);
        return response;
    }

    public static <T> PageResponse<T> of(List<T> list, Long pageSize, Long totalCount) {
        long pages = totalCount / pageSize;
        if (totalCount % pageSize != 0L) {
            ++pages;
        }
        PageResponse<T> response = new PageResponse<>();
        response.list = list;
        response.totalCount = totalCount;
        response.totalPage = Math.toIntExact(pages);
        response.pageSize = Math.toIntExact(pageSize);
        return response;
    }

    public static <T> PageResponse<T> of(IPage<T> page, Long pageSize) {
        PageResponse<T> response = new PageResponse<>();
        response.list = page.getRecords();
        response.totalCount = page.getTotal();
        response.totalPage = Math.toIntExact(page.getPages());
        response.pageSize = Math.toIntExact(pageSize);
        response.currentPage = Math.toIntExact(page.getCurrent());
        return response;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
