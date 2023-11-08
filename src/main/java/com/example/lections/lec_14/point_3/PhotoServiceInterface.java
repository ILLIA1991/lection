package com.example.lections.lec_14.point_3;

import com.example.lections.lec_14.point_1.PingwitCheckedException;

public interface PhotoServiceInterface {

    byte[] loadPhoto(String string) throws PingwitCheckedException;
}
