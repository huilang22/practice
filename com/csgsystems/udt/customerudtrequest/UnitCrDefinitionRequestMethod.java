/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrDefinitionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UnitCrDefinitionRequestMethod implements UdtMethod {
  private String method = null;
  private UnitCrDefinitionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UnitCrDefinitionCreate method */
  public static final UnitCrDefinitionRequestMethod UNIT_CR_DEFINITION_CREATE = new UnitCrDefinitionRequestMethod("UnitCrDefinitionCreate");
  /** Variable representing the UnitCrDefinitionFind method */
  public static final UnitCrDefinitionRequestMethod UNIT_CR_DEFINITION_FIND = new UnitCrDefinitionRequestMethod("UnitCrDefinitionFind");
  /** Variable representing the UnitCrDefinitionFindByPlan method */
  public static final UnitCrDefinitionRequestMethod UNIT_CR_DEFINITION_FIND_BY_PLAN = new UnitCrDefinitionRequestMethod("UnitCrDefinitionFindByPlan");
  /** Variable representing the UnitCrDefinitionGet method */
  public static final UnitCrDefinitionRequestMethod UNIT_CR_DEFINITION_GET = new UnitCrDefinitionRequestMethod("UnitCrDefinitionGet");
  /** Variable representing the UnitCrDefinitionUpdate method */
  public static final UnitCrDefinitionRequestMethod UNIT_CR_DEFINITION_UPDATE = new UnitCrDefinitionRequestMethod("UnitCrDefinitionUpdate");
}
