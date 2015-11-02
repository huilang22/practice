/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobtypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsJobtypeRequestMethod implements UdtMethod {
  private String method = null;
  private InvsJobtypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsJobtypeFind method */
  public static final InvsJobtypeRequestMethod INVS_JOBTYPE_FIND = new InvsJobtypeRequestMethod("InvsJobtypeFind");
  /** Variable representing the InvsJobtypeGet method */
  public static final InvsJobtypeRequestMethod INVS_JOBTYPE_GET = new InvsJobtypeRequestMethod("InvsJobtypeGet");
  /** Variable representing the InvsJobtypeUpdate method */
  public static final InvsJobtypeRequestMethod INVS_JOBTYPE_UPDATE = new InvsJobtypeRequestMethod("InvsJobtypeUpdate");
}
