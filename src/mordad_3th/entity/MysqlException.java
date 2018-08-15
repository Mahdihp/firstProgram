package com.mahdi.service.model;

import java.sql.SQLException;

public class MysqlException extends SQLException {
    private String className;
    private String methodName;

    public MysqlException(Throwable cause, String className, String methodName) {
        super(cause);
        this.className = className;
        this.methodName = methodName;
    }

    public MysqlException() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
