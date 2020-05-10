package com.github.Lucasloves.collection.array;

import com.github.Lucasloves.exception.EmptyException;
import com.github.Lucasloves.serialize.SerializeObject;
import com.sun.istack.internal.NotNull;

/**
 * @autohr: Cynaith
 **/
public class Arrays implements ArrayCommand{

    /**
     * byte数组转换String数组
     * @param bytes 二维byte数组
     * @return String数组
     */
    @Override
    public String[] BytesToStrings(byte[][] bytes) {
        if (bytes == null||bytes.length==0){
            throw new EmptyException("byte[][] can't empty");
        }
        String[] result = new String[bytes.length];
        int i = 0;
        for(byte[] value:bytes){
            result[i++] = new String(value);
        }
        return result;
    }

    /**
     * byte数组转换Object
     * @param bytes byte数组
     * @return Object
     */
    @Override
    public Object ByteToObject(byte[] bytes) {
        if (bytes == null||bytes.length==0){
            throw new EmptyException("byte[] can't empty");
        }
        return SerializeObject.ByteToObject(bytes);
    }


}
