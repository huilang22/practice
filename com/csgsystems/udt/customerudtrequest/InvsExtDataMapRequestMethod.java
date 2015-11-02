/*
 * Generated code DO NOT EDIT
 * Generated file: InvsExtDataMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsExtDataMapRequestMethod implements UdtMethod {
  private String method = null;
  private InvsExtDataMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsExtDataMapCreate method */
  public static final InvsExtDataMapRequestMethod INVS_EXT_DATA_MAP_CREATE = new InvsExtDataMapRequestMethod("InvsExtDataMapCreate");
  /** Variable representing the InvsExtDataMapDelete method */
  public static final InvsExtDataMapRequestMethod INVS_EXT_DATA_MAP_DELETE = new InvsExtDataMapRequestMethod("InvsExtDataMapDelete");
  /** Variable representing the InvsExtDataMapFind method */
  public static final InvsExtDataMapRequestMethod INVS_EXT_DATA_MAP_FIND = new InvsExtDataMapRequestMethod("InvsExtDataMapFind");
  /** Variable representing the InvsExtDataMapGet method */
  public static final InvsExtDataMapRequestMethod INVS_EXT_DATA_MAP_GET = new InvsExtDataMapRequestMethod("InvsExtDataMapGet");
  /** Variable representing the InvsExtDataMapUpdate method */
  public static final InvsExtDataMapRequestMethod INVS_EXT_DATA_MAP_UPDATE = new InvsExtDataMapRequestMethod("InvsExtDataMapUpdate");
}
