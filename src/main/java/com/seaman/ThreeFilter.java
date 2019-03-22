package com.seaman;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-03-21 18:06
 * 功能描述:
 * 修改历史:
 */
public class ThreeFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return "33-" + str + "-33";
    }
}
