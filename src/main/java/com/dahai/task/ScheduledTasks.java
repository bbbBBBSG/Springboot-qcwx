package com.dahai.task;

import com.dahai.service.HomeService;
import com.dahai.service.JsoupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * 定时任务
 */
@Component
public class ScheduledTasks {

    // 1.最新资讯 2.维修案例 3.汽车问题 4.技术标准 5.电路图 6.故障码 7.维修图书 8.维修手册 9.工具使用
    private static final String zuixinzixun = "http://www.qcwxjs.com/";
    private static final String zuixinzixun_type = "1";
    private static final String zuixinzixun_type_name = "最新资讯";

    private static final String weixiuanli = "http://www.qcwxjs.com/sort/weixiuanli/page/1";
    private static final String weixiuanli_type = "2";
    private static final String weixiuanli_type_name = "维修案例";

    private static final String qcwtjd = "http://www.qcwxjs.com/sort/qcwtjd/page/1";
    private static final String qcwtjd_type = "3";
    private static final String qcwtjd_type_name = "汽车问题";

    private static final String qcxljsbj = "http://www.qcwxjs.com/sort/qcxljsbj/page/1";
    private static final String qcxljsbj_type = "4";
    private static final String qcxljsbj_type_name = "技术标准";

    private static final String qcdlt = "http://www.qcwxjs.com/sort/qcdlt/page/1";
    private static final String qcdlt_type = "5";
    private static final String qcdlt_type_name = "电路图";

    private static final String OBD = "http://www.qcwxjs.com/sort/OBD/page/1";
    private static final String OBD_type = "6";
    private static final String OBD_type_name = "故障码";

    private static final String su = "http://www.qcwxjs.com/sort/shu";
    private static final String su_type = "7";
    private static final String su_type_name = "维修图书";

    private static final String wxsc = "http://www.qcwxjs.com/sort/wxsc/page/1";
    private static final String wxsc_type = "8";
    private static final String wxsc_type_name = "维修手册";

    private static final String weixiugongju = "http://www.qcwxjs.com/sort/wxsc/page/1";
    private static final String weixiugongju_type = "9";
    private static final String weixiugongju_type_name = "工具使用";

    @Autowired
    private JsoupService service;

    @Autowired
    private HomeService homeService;

    /**
     * initialDelay 在第一次执行fixedRate（）或fixedDelay（）任务之前延迟
     * fixedRate 上一次开始执行时间点之后执行
     * fixedDelay 上一次执行完毕时间点之后执行
     * cron cron表达式
     * zone 表示解析cron表达式的时区
     */
    // 最新资讯
    @Scheduled(initialDelay = 8000, fixedRate = 30*60*1000)
    public void loadQxLatestNews(){
        try {
            service.loadQxNewsList(zuixinzixun,zuixinzixun_type,zuixinzixun_type_name,null,null);
            System.out.println("最新资讯加载完");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("定时加载最新资讯失败");
        }
        try {
            Thread.sleep(3000);

            service.loadQxNewsList(weixiuanli,weixiuanli_type,weixiuanli_type_name,null,null);
            System.out.println("维修案例加载完");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("定时加载维修案例失败");
        }

        try {
            Thread.sleep(3000);

            service.loadQxNewsList(qcwtjd,qcwtjd_type,qcwtjd_type_name,null,null);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("定时加载汽车问题失败");
        }

        try {
            Thread.sleep(3000);

            service.loadQxNewsList(qcxljsbj,qcxljsbj_type,qcxljsbj_type_name,null,null);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("定时加载技术标准失败");
        }

        try {
            Thread.sleep(3000);
            homeService.insertHome();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(3000);

            service.loadQxNewsList(qcdlt,qcdlt_type,qcdlt_type_name,null,null);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("定时加载电路图失败");
        }

        try {
            Thread.sleep(3000);

            service.loadQxNewsList(OBD,OBD_type,OBD_type_name,null,null);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("定时加载OBD失败");
        }

        try {
            Thread.sleep(3000);

            service.loadQxNewsList(su,su_type,su_type_name,null,null);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("定时加载维修图书失败");
        }

        try {
            Thread.sleep(3000);

            service.loadQxNewsList(wxsc,wxsc_type,wxsc_type_name,null,null);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("定时加载维修手册失败");
        }

        try {
            Thread.sleep(3000);

            service.loadQxNewsList(weixiugongju,weixiugongju_type,weixiugongju_type_name,null,null);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("定时加载维修工具失败");
        }

        try {
            Thread.sleep(3000);

            service.loadNavList();
            System.out.println("全部加载完");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("定时加载loadNavList失败");
        }
    }
}
