/*
 * Generated code DO NOT EDIT
 * Generated file: ClassOfServiceCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ClassOfServiceCodeRequestMethod implements UdtMethod {
  private String method = null;
  private ClassOfServiceCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ClassOfServiceCodeCreate method */
  public static final ClassOfServiceCodeRequestMethod CLASS_OF_SERVICE_CODE_CREATE = new ClassOfServiceCodeRequestMethod("ClassOfServiceCodeCreate");
  /** Variable representing the ClassOfServiceCodeDelete method */
  public static final ClassOfServiceCodeRequestMethod CLASS_OF_SERVICE_CODE_DELETE = new ClassOfServiceCodeRequestMethod("ClassOfServiceCodeDelete");
  /** Variable representing the ClassOfServiceCodeFind method */
  public static final ClassOfServiceCodeRequestMethod CLASS_OF_SERVICE_CODE_FIND = new ClassOfServiceCodeRequestMethod("ClassOfServiceCodeFind");
  /** Variable representing the ClassOfServiceCodeGet method */
  public static final ClassOfServiceCodeRequestMethod CLASS_OF_SERVICE_CODE_GET = new ClassOfServiceCodeRequestMethod("ClassOfServiceCodeGet");
  /** Variable representing the ClassOfServiceCodeUpdate method */
  public static final ClassOfServiceCodeRequestMethod CLASS_OF_SERVICE_CODE_UPDATE = new ClassOfServiceCodeRequestMethod("ClassOfServiceCodeUpdate");
}
