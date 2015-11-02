/*
 * Generated code DO NOT EDIT
 * Generated file: BusinessDayDefinitionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BusinessDayDefinitionRequestMethod implements UdtMethod {
  private String method = null;
  private BusinessDayDefinitionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BusinessDayDefinitionCheck method */
  public static final BusinessDayDefinitionRequestMethod BUSINESS_DAY_DEFINITION_CHECK = new BusinessDayDefinitionRequestMethod("BusinessDayDefinitionCheck");
  /** Variable representing the BusinessDayDefinitionCreate method */
  public static final BusinessDayDefinitionRequestMethod BUSINESS_DAY_DEFINITION_CREATE = new BusinessDayDefinitionRequestMethod("BusinessDayDefinitionCreate");
  /** Variable representing the BusinessDayDefinitionDelete method */
  public static final BusinessDayDefinitionRequestMethod BUSINESS_DAY_DEFINITION_DELETE = new BusinessDayDefinitionRequestMethod("BusinessDayDefinitionDelete");
  /** Variable representing the BusinessDayDefinitionFind method */
  public static final BusinessDayDefinitionRequestMethod BUSINESS_DAY_DEFINITION_FIND = new BusinessDayDefinitionRequestMethod("BusinessDayDefinitionFind");
  /** Variable representing the BusinessDayDefinitionGet method */
  public static final BusinessDayDefinitionRequestMethod BUSINESS_DAY_DEFINITION_GET = new BusinessDayDefinitionRequestMethod("BusinessDayDefinitionGet");
  /** Variable representing the BusinessDayDefinitionUpdate method */
  public static final BusinessDayDefinitionRequestMethod BUSINESS_DAY_DEFINITION_UPDATE = new BusinessDayDefinitionRequestMethod("BusinessDayDefinitionUpdate");
}
