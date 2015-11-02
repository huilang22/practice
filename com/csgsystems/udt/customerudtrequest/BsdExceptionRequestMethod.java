/*
 * Generated code DO NOT EDIT
 * Generated file: BsdExceptionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdExceptionRequestMethod implements UdtMethod {
  private String method = null;
  private BsdExceptionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdExceptionCreate method */
  public static final BsdExceptionRequestMethod BSD_EXCEPTION_CREATE = new BsdExceptionRequestMethod("BsdExceptionCreate");
  /** Variable representing the BsdExceptionDelete method */
  public static final BsdExceptionRequestMethod BSD_EXCEPTION_DELETE = new BsdExceptionRequestMethod("BsdExceptionDelete");
  /** Variable representing the BsdExceptionFind method */
  public static final BsdExceptionRequestMethod BSD_EXCEPTION_FIND = new BsdExceptionRequestMethod("BsdExceptionFind");
  /** Variable representing the BsdExceptionFindInternal method */
  public static final BsdExceptionRequestMethod BSD_EXCEPTION_FIND_INTERNAL = new BsdExceptionRequestMethod("BsdExceptionFindInternal");
  /** Variable representing the BsdExceptionGet method */
  public static final BsdExceptionRequestMethod BSD_EXCEPTION_GET = new BsdExceptionRequestMethod("BsdExceptionGet");
  /** Variable representing the BsdExceptionGetInternal method */
  public static final BsdExceptionRequestMethod BSD_EXCEPTION_GET_INTERNAL = new BsdExceptionRequestMethod("BsdExceptionGetInternal");
  /** Variable representing the BsdExceptionUpdate method */
  public static final BsdExceptionRequestMethod BSD_EXCEPTION_UPDATE = new BsdExceptionRequestMethod("BsdExceptionUpdate");
}
