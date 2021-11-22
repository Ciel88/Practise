package com.ciel.DesignPattern.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 韦康 date 2021/11/22
 */
public class DeepProtoType implements Serializable,Cloneable {

    public String name;

    public DeepCloneableTarget deepCloneableTarget;//引用类型

    //深拷贝方式一 ，重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepProtoType deepProtoType = null;
        deepProtoType =(DeepProtoType) super.clone();
        deepProtoType.deepCloneableTarget =(DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    //深拷贝方式二，序列化
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//把当前对象以流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType deepProtoType =(DeepProtoType) ois.readObject();
            return deepProtoType;
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }finally {
            if (bos != null) {
                try{ bos.close();} catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try{ oos.close();} catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try{ bis.close();} catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try{ ois.close();} catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
