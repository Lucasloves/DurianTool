package com.github.Lucasloves.collection.array;

/**
 * @autohr: Cynaith
 **/
public class Arrays implements ArrayCommand{

    @Override
    public String[] ByteToString(byte[][] bytes) {
        String[] result = new String[bytes.length];
        int i = 0;
        for(byte[] value:bytes){
            result[i++] = new String(value);
        }
        return result;
    }
}
