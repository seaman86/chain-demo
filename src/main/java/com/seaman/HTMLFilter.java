package com.seaman;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-03-21 17:53
 * 功能描述:
 * 修改历史:
 */

public class HTMLFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace('<', '[').replace(">", "]");
    }
}
