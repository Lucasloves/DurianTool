package com.github.Lucasloves.time;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Cynaith
 **/
public class Times implements TimeCommand {
    private static ConcurrentHashMap<Integer,Long> concurrentHashMap = new ConcurrentHashMap<>();

    /**
     * 获取今天是一周内的第几天
     * @return 星期几
     */
    @Override
    public int todayInWeek() {
        return 0;
    }

    /**
     * 获取今天是一月内的第几天
     * @return 某个月的第几日
     */
    @Override
    public int todayInMonth() {
        return 0;
    }

    /**
     * 获取今天是一年内的第几天
     * @return 某一年的第几日
     */
    @Override
    public int todayInYear() {
        return 0;
    }

    /**
     * 获取当前月数
     * @return 某一年的第几月
     */
    @Override
    public int month() {
        return 0;
    }

    /**
     * 获取当前年数
     * @return 哪一年
     */
    @Override
    public int year() {
        return 0;
    }

    /**
     *
     * @param task 任务id
     */
    @Override
    public synchronized void cutTimeStart(int task) {
        concurrentHashMap.put(task,System.currentTimeMillis());
    }

    /**
     *
     * @param task 任务id
     * @return 当前任务经历的时间
     */
    @Override
    public Long cutTimeEnd(int task) {
        Long startTime = concurrentHashMap.get(task);
        return System.currentTimeMillis() - startTime;
    }
}
