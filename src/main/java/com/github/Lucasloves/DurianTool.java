package com.github.Lucasloves;
import cn.hutool.extra.mail.Mail;
import com.github.Lucasloves.collection.array.Arrays;
import com.github.Lucasloves.collection.list.Lists;
import com.github.Lucasloves.collection.map.Maps;
import com.github.Lucasloves.collection.set.Sets;

/**
 * @autohr: Cynaith
 **/
public class DurianTool {


    private DurianTool(){
    };

    /**
     *
     * @return 返回List工具类实例
     */
    public static Lists Lists(){
        return new Lists();
    }

    /**
     *
     * @return 返回Map工具类实例
     */
    public static Maps Maps(){
        return new Maps();
    }

    /**
     *
     * @return 返回Set工具类实例
     */
    public static Sets Sets(){
        return new Sets();
    }

    /**
     *
     * @return 返回Array工具类实例
     */
    public static Arrays Arrays(){
        return new Arrays();
    }
}
