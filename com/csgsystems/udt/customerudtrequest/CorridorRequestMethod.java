/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CorridorRequestMethod implements UdtMethod {
  private String method = null;
  private CorridorRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CorridorConvert method */
  public static final CorridorRequestMethod CORRIDOR_CONVERT = new CorridorRequestMethod("CorridorConvert");
  /** Variable representing the CorridorCreate method */
  public static final CorridorRequestMethod CORRIDOR_CREATE = new CorridorRequestMethod("CorridorCreate");
  /** Variable representing the CorridorDelete method */
  public static final CorridorRequestMethod CORRIDOR_DELETE = new CorridorRequestMethod("CorridorDelete");
  /** Variable representing the CorridorDeleteList method */
  public static final CorridorRequestMethod CORRIDOR_DELETE_LIST = new CorridorRequestMethod("CorridorDeleteList");
  /** Variable representing the CorridorFind method */
  public static final CorridorRequestMethod CORRIDOR_FIND = new CorridorRequestMethod("CorridorFind");
  /** Variable representing the CorridorGet method */
  public static final CorridorRequestMethod CORRIDOR_GET = new CorridorRequestMethod("CorridorGet");
  /** Variable representing the CorridorUpdate method */
  public static final CorridorRequestMethod CORRIDOR_UPDATE = new CorridorRequestMethod("CorridorUpdate");
}
