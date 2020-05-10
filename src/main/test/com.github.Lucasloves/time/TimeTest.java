package com.github.Lucasloves.time;

import com.github.Lucasloves.DurianTool;
import org.junit.Test;

/**
 * @author: Cynaith
 **/
public class TimeTest {
    @Test
    public void CutTime(){
        DurianTool.Times().cutTimeStart(1);

        System.out.println(DurianTool.Times().cutTimeEnd(1));
    }
}
