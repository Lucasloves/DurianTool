package com.github.Lucasloves.time;

/**
 * @author: Cynaith
 **/
public interface TimeCommand {

    /**
     * 获取今天是一周内的第几天
     * @return 星期几
     */
    int todayInWeek();

    /**
     * 获取今天是一月内的第几天
     * @return 某个月的第几日
     */
    int todayInMonth();

    /**
     * 获取今天是一年内的第几天
     * @return 某一年的第几日
     */
    int todayInYear();

    /**
     * 获取当前月数
     * @return 某一年的第几月
     */
    int month();

    /**
     * 获取当前年数
     * @return 哪一年
     */
    int year();

    /**
     *
     * @param task 任务id
     */
    void cutTimeStart(int task);

    /**
     *
     * @param task 任务id
     * @return 当前任务经历的时间
     */
    Long cutTimeEnd(int task);
}
