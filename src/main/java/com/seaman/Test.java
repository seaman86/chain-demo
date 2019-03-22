package com.seaman;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-03-21 17:55
 * 功能描述:
 * 修改历史:
 */
public class Test {


    public static void  main(String[] args){

        MsgProcessor processor = new MsgProcessor();

        String msg = "<html>敏感字眼</html>";
        processor.setMsg(msg);

        FilterChain fc1 = new FilterChain();
        fc1.addFilter(new HTMLFilter());

        FilterChain fc2 = new FilterChain();
        fc2.addFilter(new SensitiveFilter());

        FilterChain fc3 = new FilterChain();
        fc3.addFilter(new ThreeFilter());

        //由于FilterChain实现了Filter接口，所以FilterChain同时也是Filter,所以可以调用addFilter增加fc2
        fc1.addFilter(fc2);
        fc2.addFilter(fc3);

        processor.setFilterChain(fc1);

        String result = processor.process();
        System.out.println(result);

    }

}
