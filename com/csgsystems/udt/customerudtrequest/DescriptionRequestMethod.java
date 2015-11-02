/*
 * Generated code DO NOT EDIT
 * Generated file: DescriptionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DescriptionRequestMethod implements UdtMethod {
  private String method = null;
  private DescriptionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DescriptionCreate method */
  public static final DescriptionRequestMethod DESCRIPTION_CREATE = new DescriptionRequestMethod("DescriptionCreate");
  /** Variable representing the DescriptionFind method */
  public static final DescriptionRequestMethod DESCRIPTION_FIND = new DescriptionRequestMethod("DescriptionFind");
  /** Variable representing the DescriptionGet method */
  public static final DescriptionRequestMethod DESCRIPTION_GET = new DescriptionRequestMethod("DescriptionGet");
  /** Variable representing the DescriptionUpdate method */
  public static final DescriptionRequestMethod DESCRIPTION_UPDATE = new DescriptionRequestMethod("DescriptionUpdate");
}
