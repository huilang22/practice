/*
 * Generated code DO NOT EDIT
 * Generated file: GenderTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GenderTypeRequestMethod implements UdtMethod {
  private String method = null;
  private GenderTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GenderTypeCreate method */
  public static final GenderTypeRequestMethod GENDER_TYPE_CREATE = new GenderTypeRequestMethod("GenderTypeCreate");
  /** Variable representing the GenderTypeDelete method */
  public static final GenderTypeRequestMethod GENDER_TYPE_DELETE = new GenderTypeRequestMethod("GenderTypeDelete");
  /** Variable representing the GenderTypeFind method */
  public static final GenderTypeRequestMethod GENDER_TYPE_FIND = new GenderTypeRequestMethod("GenderTypeFind");
  /** Variable representing the GenderTypeGet method */
  public static final GenderTypeRequestMethod GENDER_TYPE_GET = new GenderTypeRequestMethod("GenderTypeGet");
  /** Variable representing the GenderTypeUpdate method */
  public static final GenderTypeRequestMethod GENDER_TYPE_UPDATE = new GenderTypeRequestMethod("GenderTypeUpdate");
}
