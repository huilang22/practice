/*
 * Generated code DO NOT EDIT
 * Generated file: InvsFieldMasterRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsFieldMasterRequestMethod implements UdtMethod {
  private String method = null;
  private InvsFieldMasterRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsFieldMasterCreate method */
  public static final InvsFieldMasterRequestMethod INVS_FIELD_MASTER_CREATE = new InvsFieldMasterRequestMethod("InvsFieldMasterCreate");
  /** Variable representing the InvsFieldMasterDelete method */
  public static final InvsFieldMasterRequestMethod INVS_FIELD_MASTER_DELETE = new InvsFieldMasterRequestMethod("InvsFieldMasterDelete");
  /** Variable representing the InvsFieldMasterFind method */
  public static final InvsFieldMasterRequestMethod INVS_FIELD_MASTER_FIND = new InvsFieldMasterRequestMethod("InvsFieldMasterFind");
  /** Variable representing the InvsFieldMasterGet method */
  public static final InvsFieldMasterRequestMethod INVS_FIELD_MASTER_GET = new InvsFieldMasterRequestMethod("InvsFieldMasterGet");
  /** Variable representing the InvsFieldMasterUpdate method */
  public static final InvsFieldMasterRequestMethod INVS_FIELD_MASTER_UPDATE = new InvsFieldMasterRequestMethod("InvsFieldMasterUpdate");
}
