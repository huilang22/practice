/*
 * Generated code DO NOT EDIT
 * Generated file: BusinessDayRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BusinessDayRequestMethod implements UdtMethod {
  private String method = null;
  private BusinessDayRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BusinessDayCreate method */
  public static final BusinessDayRequestMethod BUSINESS_DAY_CREATE = new BusinessDayRequestMethod("BusinessDayCreate");
  /** Variable representing the BusinessDayDelete method */
  public static final BusinessDayRequestMethod BUSINESS_DAY_DELETE = new BusinessDayRequestMethod("BusinessDayDelete");
  /** Variable representing the BusinessDayFind method */
  public static final BusinessDayRequestMethod BUSINESS_DAY_FIND = new BusinessDayRequestMethod("BusinessDayFind");
  /** Variable representing the BusinessDayGet method */
  public static final BusinessDayRequestMethod BUSINESS_DAY_GET = new BusinessDayRequestMethod("BusinessDayGet");
  /** Variable representing the BusinessDayUpdate method */
  public static final BusinessDayRequestMethod BUSINESS_DAY_UPDATE = new BusinessDayRequestMethod("BusinessDayUpdate");
}
