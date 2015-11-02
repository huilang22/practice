/*
 * Generated code DO NOT EDIT
 * Generated file: ParentCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ParentCodeRequestMethod implements UdtMethod {
  private String method = null;
  private ParentCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ParentCodeCreate method */
  public static final ParentCodeRequestMethod PARENT_CODE_CREATE = new ParentCodeRequestMethod("ParentCodeCreate");
  /** Variable representing the ParentCodeDelete method */
  public static final ParentCodeRequestMethod PARENT_CODE_DELETE = new ParentCodeRequestMethod("ParentCodeDelete");
  /** Variable representing the ParentCodeFind method */
  public static final ParentCodeRequestMethod PARENT_CODE_FIND = new ParentCodeRequestMethod("ParentCodeFind");
  /** Variable representing the ParentCodeGet method */
  public static final ParentCodeRequestMethod PARENT_CODE_GET = new ParentCodeRequestMethod("ParentCodeGet");
  /** Variable representing the ParentCodeUpdate method */
  public static final ParentCodeRequestMethod PARENT_CODE_UPDATE = new ParentCodeRequestMethod("ParentCodeUpdate");
}
