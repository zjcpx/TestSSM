package com.zjcpx.cms.pojo;

import java.util.List;

/**
 * PackageName:com.zjcpx.cms.pojo
 * PROJECT_NAME:TestSSM
 * ClassName: BootStrapTableResult
 * Package: com.zjcpx.cms.pojo
 *
 * @Author zjcxp.com
 * @Create 2024/4/17 11:38
 * @Version 1.0
 * Description:
 */
public class BootStrapTableResult {
    private String code;
    private String msg;
    private int page;
    private int rows;
    private long count;
    private List<TDechead> resultList;
    private long totalPage;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<TDechead> getResultList() {
        return resultList;
    }

    public void setResultList(List<TDechead> resultList) {
        this.resultList = resultList;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public BootStrapTableResult(String code, String msg, int page, int rows, long count, List<TDechead> resultList,
                                long totalPage) {
        this.code = code;
        this.msg = msg;
        this.page = page;
        this.rows = rows;
        this.count = count;
        this.resultList = resultList;
        this.totalPage = totalPage;
    }

    public BootStrapTableResult() {
    }

    @Override
    public String toString() {
        return "BootStrapTableResult{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                ", count=" + count +
                ", resultList=" + resultList +
                ", totalPage=" + totalPage +
                '}';
    }
}
