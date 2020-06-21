package com.github.Lucasloves;
import cn.hutool.extra.mail.Mail;
import com.github.Lucasloves.collection.array.Arrays;
import com.github.Lucasloves.collection.list.Lists;
import com.github.Lucasloves.collection.map.Maps;
import com.github.Lucasloves.collection.set.Sets;
import com.github.Lucasloves.file.FileUtil;
import com.github.Lucasloves.time.Times;

/**
 * @author: Cynaith
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

    /**
     *
     * @return 返回Time工具类实例
     */
    public static Times Times(){
        return new Times();
    }

    /**
     *
     * @return 返回File工具类实例
     */
    public static FileUtil Files(){
        return new FileUtil();
    }
}
