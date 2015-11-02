/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigIdRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EmfConfigIdRequestMethod implements UdtMethod {
  private String method = null;
  private EmfConfigIdRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EmfConfigIdCreate method */
  public static final EmfConfigIdRequestMethod EMF_CONFIG_ID_CREATE = new EmfConfigIdRequestMethod("EmfConfigIdCreate");
  /** Variable representing the EmfConfigIdDelete method */
  public static final EmfConfigIdRequestMethod EMF_CONFIG_ID_DELETE = new EmfConfigIdRequestMethod("EmfConfigIdDelete");
  /** Variable representing the EmfConfigIdFind method */
  public static final EmfConfigIdRequestMethod EMF_CONFIG_ID_FIND = new EmfConfigIdRequestMethod("EmfConfigIdFind");
  /** Variable representing the EmfConfigIdGet method */
  public static final EmfConfigIdRequestMethod EMF_CONFIG_ID_GET = new EmfConfigIdRequestMethod("EmfConfigIdGet");
  /** Variable representing the EmfConfigIdUpdate method */
  public static final EmfConfigIdRequestMethod EMF_CONFIG_ID_UPDATE = new EmfConfigIdRequestMethod("EmfConfigIdUpdate");
}
