/*
 * Generated code DO NOT EDIT
 * Generated file: NonWorkDaysRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NonWorkDaysRequestMethod implements UdtMethod {
  private String method = null;
  private NonWorkDaysRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NonWorkDaysCreate method */
  public static final NonWorkDaysRequestMethod NON_WORK_DAYS_CREATE = new NonWorkDaysRequestMethod("NonWorkDaysCreate");
  /** Variable representing the NonWorkDaysFind method */
  public static final NonWorkDaysRequestMethod NON_WORK_DAYS_FIND = new NonWorkDaysRequestMethod("NonWorkDaysFind");
  /** Variable representing the NonWorkDaysGet method */
  public static final NonWorkDaysRequestMethod NON_WORK_DAYS_GET = new NonWorkDaysRequestMethod("NonWorkDaysGet");
  /** Variable representing the NonWorkDaysUpdate method */
  public static final NonWorkDaysRequestMethod NON_WORK_DAYS_UPDATE = new NonWorkDaysRequestMethod("NonWorkDaysUpdate");
}
