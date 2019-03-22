package com.seaman;

import java.util.ArrayList;
import java.util.List;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-03-21 17:51
 * 功能描述:
 * 修改历史:
 */
public class FilterChain implements Filter {

    //链
    private List<Filter> filters = new ArrayList<Filter>();

    public String doFilter(String str) {

        for(Filter f : filters){
            str = f.doFilter(str);
        }

        return str;
    }

    //把函数的返回值设为FilterChain，返回this,就能方便链式编写代码
    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

}
