/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdObjectRequestMethod implements UdtMethod {
  private String method = null;
  private BsdObjectRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdObjectCreate method */
  public static final BsdObjectRequestMethod BSD_OBJECT_CREATE = new BsdObjectRequestMethod("BsdObjectCreate");
  /** Variable representing the BsdObjectDelete method */
  public static final BsdObjectRequestMethod BSD_OBJECT_DELETE = new BsdObjectRequestMethod("BsdObjectDelete");
  /** Variable representing the BsdObjectDeleteAll method */
  public static final BsdObjectRequestMethod BSD_OBJECT_DELETE_ALL = new BsdObjectRequestMethod("BsdObjectDeleteAll");
  /** Variable representing the BsdObjectFind method */
  public static final BsdObjectRequestMethod BSD_OBJECT_FIND = new BsdObjectRequestMethod("BsdObjectFind");
  /** Variable representing the BsdObjectGet method */
  public static final BsdObjectRequestMethod BSD_OBJECT_GET = new BsdObjectRequestMethod("BsdObjectGet");
  /** Variable representing the BsdObjectSequenceGet method */
  public static final BsdObjectRequestMethod BSD_OBJECT_SEQUENCE_GET = new BsdObjectRequestMethod("BsdObjectSequenceGet");
  /** Variable representing the BsdObjectUpdate method */
  public static final BsdObjectRequestMethod BSD_OBJECT_UPDATE = new BsdObjectRequestMethod("BsdObjectUpdate");
}
