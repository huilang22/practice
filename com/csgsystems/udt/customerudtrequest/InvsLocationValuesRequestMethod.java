/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationValuesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsLocationValuesRequestMethod implements UdtMethod {
  private String method = null;
  private InvsLocationValuesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsLocationValuesCreate method */
  public static final InvsLocationValuesRequestMethod INVS_LOCATION_VALUES_CREATE = new InvsLocationValuesRequestMethod("InvsLocationValuesCreate");
  /** Variable representing the InvsLocationValuesFind method */
  public static final InvsLocationValuesRequestMethod INVS_LOCATION_VALUES_FIND = new InvsLocationValuesRequestMethod("InvsLocationValuesFind");
  /** Variable representing the InvsLocationValuesGet method */
  public static final InvsLocationValuesRequestMethod INVS_LOCATION_VALUES_GET = new InvsLocationValuesRequestMethod("InvsLocationValuesGet");
  /** Variable representing the InvsLocationValuesUpdate method */
  public static final InvsLocationValuesRequestMethod INVS_LOCATION_VALUES_UPDATE = new InvsLocationValuesRequestMethod("InvsLocationValuesUpdate");
}
