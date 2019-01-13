package com.practice.serialization;

/**
 * This Enum just to elaborate that enums are inherently serialized.
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 13-01-2019
 */
public enum EnumSerializable  {

    INSTANCE;

    public String get(){
        return EnumSerializable.values().toString();
    }
}
