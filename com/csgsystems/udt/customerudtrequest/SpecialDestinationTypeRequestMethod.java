/*
 * Generated code DO NOT EDIT
 * Generated file: SpecialDestinationTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SpecialDestinationTypeRequestMethod implements UdtMethod {
  private String method = null;
  private SpecialDestinationTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SpecialDestinationTypeCreate method */
  public static final SpecialDestinationTypeRequestMethod SPECIAL_DESTINATION_TYPE_CREATE = new SpecialDestinationTypeRequestMethod("SpecialDestinationTypeCreate");
  /** Variable representing the SpecialDestinationTypeFind method */
  public static final SpecialDestinationTypeRequestMethod SPECIAL_DESTINATION_TYPE_FIND = new SpecialDestinationTypeRequestMethod("SpecialDestinationTypeFind");
  /** Variable representing the SpecialDestinationTypeGet method */
  public static final SpecialDestinationTypeRequestMethod SPECIAL_DESTINATION_TYPE_GET = new SpecialDestinationTypeRequestMethod("SpecialDestinationTypeGet");
  /** Variable representing the SpecialDestinationTypeUpdate method */
  public static final SpecialDestinationTypeRequestMethod SPECIAL_DESTINATION_TYPE_UPDATE = new SpecialDestinationTypeRequestMethod("SpecialDestinationTypeUpdate");
}
