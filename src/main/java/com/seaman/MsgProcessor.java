package com.seaman;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-03-21 17:55
 * 功能描述:
 * 修改历史:
 */
public class MsgProcessor {
    //private List<Filter> filters = new ArrayList<Filter>();
    FilterChain filterChain;
    private String msg;

    public FilterChain getFilterChain() {
        return filterChain;
    }

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process() {
        return filterChain.doFilter(msg);
    }
}
