package com.github.Lucasloves.serialize;

import com.github.Lucasloves.exception.SerializeException;

import java.io.*;

/**
 * @author: Cynaith
 **/
public class SerializeObject {
    //序列化
    public static byte[] ObjectToByte(Object obj) {
        if (!(obj instanceof Serializable)){
            throw new SerializeException("object should implements Serializable");
        }
        ObjectOutputStream obi = null;
        ByteArrayOutputStream bai = null;
        try {
            bai = new ByteArrayOutputStream();
            try {
                obi = new ObjectOutputStream(bai);
            } catch (IOException e) {
                e.printStackTrace();
            }
            obi.writeObject(obj);
            byte[] byt = bai.toByteArray();
            return byt;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 反序列化
    public static Object ByteToObject(byte[] byt) {
        ObjectInputStream oii = null;
        ByteArrayInputStream bis = null;
        bis = new ByteArrayInputStream(byt);
        try {
            oii = new ObjectInputStream(bis);
            Object obj = oii.readObject();
            return obj;
        } catch (Exception e) {
            throw new SerializeException("byte[] Can't unserialize to object");
        }
    }
}
