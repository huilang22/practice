/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintDescriptionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdConstraintDescriptionRequestMethod implements UdtMethod {
  private String method = null;
  private BsdConstraintDescriptionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdConstraintDescriptionCreate method */
  public static final BsdConstraintDescriptionRequestMethod BSD_CONSTRAINT_DESCRIPTION_CREATE = new BsdConstraintDescriptionRequestMethod("BsdConstraintDescriptionCreate");
  /** Variable representing the BsdConstraintDescriptionDelete method */
  public static final BsdConstraintDescriptionRequestMethod BSD_CONSTRAINT_DESCRIPTION_DELETE = new BsdConstraintDescriptionRequestMethod("BsdConstraintDescriptionDelete");
  /** Variable representing the BsdConstraintDescriptionDeleteAll method */
  public static final BsdConstraintDescriptionRequestMethod BSD_CONSTRAINT_DESCRIPTION_DELETE_ALL = new BsdConstraintDescriptionRequestMethod("BsdConstraintDescriptionDeleteAll");
  /** Variable representing the BsdConstraintDescriptionFind method */
  public static final BsdConstraintDescriptionRequestMethod BSD_CONSTRAINT_DESCRIPTION_FIND = new BsdConstraintDescriptionRequestMethod("BsdConstraintDescriptionFind");
  /** Variable representing the BsdConstraintDescriptionGet method */
  public static final BsdConstraintDescriptionRequestMethod BSD_CONSTRAINT_DESCRIPTION_GET = new BsdConstraintDescriptionRequestMethod("BsdConstraintDescriptionGet");
  /** Variable representing the BsdConstraintDescriptionSequenceGet method */
  public static final BsdConstraintDescriptionRequestMethod BSD_CONSTRAINT_DESCRIPTION_SEQUENCE_GET = new BsdConstraintDescriptionRequestMethod("BsdConstraintDescriptionSequenceGet");
  /** Variable representing the BsdConstraintDescriptionUpdate method */
  public static final BsdConstraintDescriptionRequestMethod BSD_CONSTRAINT_DESCRIPTION_UPDATE = new BsdConstraintDescriptionRequestMethod("BsdConstraintDescriptionUpdate");
}
