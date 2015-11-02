/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountDefinitionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DiscountDefinitionRequestMethod implements UdtMethod {
  private String method = null;
  private DiscountDefinitionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DiscountDefinitionCreate method */
  public static final DiscountDefinitionRequestMethod DISCOUNT_DEFINITION_CREATE = new DiscountDefinitionRequestMethod("DiscountDefinitionCreate");
  /** Variable representing the DiscountDefinitionFind method */
  public static final DiscountDefinitionRequestMethod DISCOUNT_DEFINITION_FIND = new DiscountDefinitionRequestMethod("DiscountDefinitionFind");
  /** Variable representing the DiscountDefinitionFindByPlan method */
  public static final DiscountDefinitionRequestMethod DISCOUNT_DEFINITION_FIND_BY_PLAN = new DiscountDefinitionRequestMethod("DiscountDefinitionFindByPlan");
  /** Variable representing the DiscountDefinitionGet method */
  public static final DiscountDefinitionRequestMethod DISCOUNT_DEFINITION_GET = new DiscountDefinitionRequestMethod("DiscountDefinitionGet");
  /** Variable representing the DiscountDefinitionUpdate method */
  public static final DiscountDefinitionRequestMethod DISCOUNT_DEFINITION_UPDATE = new DiscountDefinitionRequestMethod("DiscountDefinitionUpdate");
}
