/*
 * Generated code DO NOT EDIT
 * Generated file: OccConeFxEntityMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OccConeFxEntityMapRequestMethod implements UdtMethod {
  private String method = null;
  private OccConeFxEntityMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OccConeFxEntityMapFind method */
  public static final OccConeFxEntityMapRequestMethod OCC_CONE_FX_ENTITY_MAP_FIND = new OccConeFxEntityMapRequestMethod("OccConeFxEntityMapFind");
}
