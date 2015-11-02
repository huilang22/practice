/*
 * Generated code DO NOT EDIT
 * Generated file: LogRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class LogRequestMethod implements UdtMethod {
  private String method = null;
  private LogRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the LogFileFind method */
  public static final LogRequestMethod LOG_FILE_FIND = new LogRequestMethod("LogFileFind");
  /** Variable representing the LogFind method */
  public static final LogRequestMethod LOG_FIND = new LogRequestMethod("LogFind");
  /** Variable representing the LogGenerate method */
  public static final LogRequestMethod LOG_GENERATE = new LogRequestMethod("LogGenerate");
}
