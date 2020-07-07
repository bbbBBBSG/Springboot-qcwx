package com.dahai.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * @author denwgen
 */
@SuppressWarnings("unused")
public class DateUtils {

	/** 年月日 */
	private static final String YMD = "yyyy-MM-dd";
	
	/** 年月日时分秒 */
	private static final String YMDHMS = "yyyy-MM-dd HH:mm:ss";

	/** 私有构造函数 */
	private DateUtils() {
	}
	
	/** 获取当前时间格式为(yyyy-MM-dd HH:mm:ss) */
	public static String getLocalDate(){
		return format("yyyy-MM-dd HH:mm:ss", new Date()) ;
	}
	
	/** 获取当前时间格式为(yyyy-MM-dd) */
	public static String getLocalYmdDate(){
		return format("yyyy-MM-dd", new Date()) ;
	}

	/** 格式化时间 */
	public static String format(String pattern, Date date) {
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		return sf.format(date);
	}

	/**
	 * 获取当前系统时间
	 * @author denwgen
	 * @param pattern 日期格式(yyyy-MM-dd HH:mm:ss:SSS)
	 */
	public static String getLocalDate(String pattern) {
		return format(pattern, new Date());
	}

	/**
	 * 字符串转换为日期格式
	 * @param pattern 日期格式(yyyy-MM-dd HH:mm:ss:SSS)
	 * @param date 日期
	 */
	public static Date toDate(String pattern, String date) throws Exception {
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		return sf.parse(date);
	}

	/**
	 * 获取前年或者后年
	 * @param time -1或者1
	 * @param pattern 日期格式(yyyy-MM-dd HH:mm:ss:SSS)
	 */
	public static String getYear(String pattern,int time) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, time);
		return format(pattern, c.getTime());
	}

	/**
	 * 获取前月或者后月
	 * @param time -1或者1
	 * @param pattern 日期格式(yyyy-MM-dd HH:mm:ss:SSS)
	 */
	public static String getMonth(String pattern,int time) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, time);
		return format(pattern, c.getTime());
	}

	/**
	 * 获取前天或者后天
	 * @param time -1或者1
	 * @param pattern 日期格式(yyyy-MM-dd HH:mm:ss:SSS)
	 */
	public static String getDate(String pattern,int time) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, time);
		return format(pattern, c.getTime());
	}

	/**
	 * 获取前小时或者后小时
	 * @param time -1或者1
	 * @param pattern 日期格式(yyyy-MM-dd HH:mm:ss:SSS)
	 */
	public static String getHour(String pattern,int time) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.HOUR, time);
		return format(pattern, c.getTime());
	}
	
	/**
	 * 获取前分钟或者后分钟
	 * @param time -1或者1
	 * @param pattern 日期格式(yyyy-MM-dd HH:mm:ss:SSS)
	 */
	public static String getMinute(String pattern,int time) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MINUTE, time);
		return format(pattern, c.getTime());
	}

	/**
	 * 验证时间是否有效
	 * @author dengwen 
	 * 2017-4-17下午5:42:11
	 */
	public static Boolean verifCodeDate(Date codeDate) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		c.setTime(codeDate);
		c.add(Calendar.MINUTE, 5);
		/*System.out.println(sf.format(c.getTime()));
		System.out.println(sf.format(new Date()));*/
		return sf.format(c.getTime()).compareTo(sf.format(new Date())) >= 0;
	}
	
	/**
	 * 验证两个日期相差天数
	 * @author dengwen 
	 * 2017-4-17下午5:49:45
	 */
	public static int daysBetween(String smdate,String bdate) {    
        long between_days = 0;
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
			Calendar cal = Calendar.getInstance();    
			cal.setTime(sdf.parse(smdate));    
			long time1 = cal.getTimeInMillis();                 
			cal.setTime(sdf.parse(bdate));    
			long time2 = cal.getTimeInMillis();         
			between_days = (time1-time2)/(1000*3600*24);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
       return Integer.parseInt(String.valueOf(between_days));           
    }    
	
	/**
	 * 计算时间差， 例如返回 2天1小时4分20秒 
	 *@author wubingguang,
	 * 2017-8-11 上午10:12:27
	 * @param endDate
	 * @param startDate
	 * @return
	 */
	public static String daysBetween(Date endDate, Date startDate) {
		float d = endDate.getTime() - startDate.getTime();
		float dd = d / 86400000f;
		int ddd = (int) dd;

		float hh = (dd - ddd) * 24;
		int hhh = (int) hh;

		float mm = (hh - hhh) * 60;
		int mmm = (int) mm;

		float ss = (mm - mmm) * 60;
		int sss = (int) ss;
		return ddd + "天" + hhh + "小时" + mmm + "分" + sss + "秒";
	}

	/**
	 * 返回两个时间差 用结束时间减开始时间
	 * @param startDate 开始时间
	 * @param endDate 结束时间
	 * @return 返回多少毫秒
	 */
	public static long secBetween(String startDate,String endDate) {
		SimpleDateFormat format = new SimpleDateFormat(YMDHMS);
		long diff = 0;
		try {
			Date dateStart = format.parse(startDate);
			Date datEnd = format.parse(endDate);
			diff = Math.abs(datEnd.getTime() - dateStart.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return diff;
	}

	/**
	 * 时间格式 0-1小时：返回多少分钟前，否则返回指定格式时间字符串
	 *@author wubingguang,
	 * 2017-8-29 上午10:48:04
	 * @param date
	 * @param pattern yyyy-MM-dd HH:mm
	 * @return
	 */
	public static String formatMinute(Date date,String pattern) {
		long delta = (new Date().getTime() - date.getTime())/1000L;
		if(delta<3600){
			return delta/60L+"分钟前";
		}
		return format(pattern,date);
	}


	public static void main(String[] args) {
		String formatStr;
		try {
			formatStr = DateUtils.formatMinute(DateUtils.toDate("yyyy-MM-dd HH:mm:ss","2017-08-29 10:04:00"),"yyyy-MM-dd HH:mm");
			System.out.println(formatStr);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*String str = "{\"appid\":1253426458,\"channel_id\":\"8259_mfs32\",\"duration\":268,\"end_time\":1494493172,\"event_type\":100,"+
			"\"file_format\":\"flv\",\"file_id\":\"9031868222932978164\",\"file_size\":13905207,\"record_file_id\":\"9031868222932978164\"," +
					"\"sign\":\"5d627ee140d97d9dd037512d336bc794\",\"start_time\":1494492836,\"stream_id\":\"8259_mfs32\"," +
					"\"stream_param\":\"bizid=8259&txSecret=dc823261371a503395cc40bc78a0e44f&txTime=59172D7F\",\"t\":1494493777," +
					"\"video_id\":\"200057967_e8a53f889fad45dab5f0454b6719be0e\"," +
					"\"video_url\":\"http://1253426458.vod2.myqcloud.com/2de33f07vodgzp1253426458/5c42d46f9031868222932978164/f0.flv\"}";
		JSONObject jsonObject = (JSONObject) JSONObject.parse(str);
		System.out.println(jsonObject.get("event_type"));*/
		/*try { 
			System.out.println(DateUtils.getDate("yyyy-MM-dd 00", -1));;
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
	}

}
