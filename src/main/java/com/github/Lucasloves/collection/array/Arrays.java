package com.github.Lucasloves.collection.array;

import com.github.Lucasloves.exception.EmptyException;
import com.github.Lucasloves.exception.SerializeException;
import com.github.Lucasloves.serialize.SerializeObject;
import com.sun.istack.internal.NotNull;

import java.io.Serializable;
import java.util.Collections;

/**
 * @author: Cynaith
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

    /**
     * Object转换byte[]
     * @param object 序列化的对象
     * @return
     */
    @Override
    public byte[] ObjectToByte(Object object) {
        if (object instanceof Serializable){
            return SerializeObject.ObjectToByte(object);
        }
        else {
            throw new SerializeException("object should implement Serializable");
        }
    }
}
