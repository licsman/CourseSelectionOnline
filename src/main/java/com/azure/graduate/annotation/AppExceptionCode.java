package com.azure.graduate.annotation;

import com.azure.graduate.exception.AppError;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AppExceptionCode {
    AppError appError();
}