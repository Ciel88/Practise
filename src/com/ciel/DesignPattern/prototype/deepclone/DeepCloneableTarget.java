package com.ciel.DesignPattern.prototype.deepclone;

import java.io.Serializable;

/**
 * @author 韦康 date 2021/11/22
 */
public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneCLass;

    public DeepCloneableTarget(String cloneName, String cloneCLass) {
        this.cloneName = cloneName;
        this.cloneCLass = cloneCLass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
