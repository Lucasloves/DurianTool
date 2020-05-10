package com.github.Lucasloves.collection.array;

/**
 * @author: Cynaith
 **/
public interface ArrayCommand {

    /**
     * 字节数组转为String数组
     * @param bytes 二维字节数组
     * @return String数组
     */
    String[] BytesToStrings(byte[][] bytes);

    /**
     * byte数组转换Object
     * @param bytes byte数组
     * @return Object
     */
    Object ByteToObject(byte[] bytes);

    /**
     * Object转换byte[]
     * @param object 序列化的对象
     * @return
     */
    byte[] ObjectToByte(Object object);


}
