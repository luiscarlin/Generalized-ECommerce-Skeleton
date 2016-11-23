package com.devopsbuddy.exceptions;

/**
 * Created by andrewburns on 11/22/16.
 */
public class S3Exception extends RuntimeException {

    public S3Exception(Throwable e){
        super(e);
    }

    public S3Exception(String s) {
        super(s);
    }
}
