/*
 * Generated code DO NOT EDIT
 * Generated file: SystemParameterRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SystemParameterRequestMethod implements UdtMethod {
  private String method = null;
  private SystemParameterRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SystemParameterCreate method */
  public static final SystemParameterRequestMethod SYSTEM_PARAMETER_CREATE = new SystemParameterRequestMethod("SystemParameterCreate");
  /** Variable representing the SystemParameterDelete method */
  public static final SystemParameterRequestMethod SYSTEM_PARAMETER_DELETE = new SystemParameterRequestMethod("SystemParameterDelete");
  /** Variable representing the SystemParameterFind method */
  public static final SystemParameterRequestMethod SYSTEM_PARAMETER_FIND = new SystemParameterRequestMethod("SystemParameterFind");
  /** Variable representing the SystemParameterGet method */
  public static final SystemParameterRequestMethod SYSTEM_PARAMETER_GET = new SystemParameterRequestMethod("SystemParameterGet");
  /** Variable representing the SystemParameterUpdate method */
  public static final SystemParameterRequestMethod SYSTEM_PARAMETER_UPDATE = new SystemParameterRequestMethod("SystemParameterUpdate");
}
