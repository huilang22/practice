/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointTransTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BonusPointTransTypeRequestMethod implements UdtMethod {
  private String method = null;
  private BonusPointTransTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BonusPointTransTypeCreate method */
  public static final BonusPointTransTypeRequestMethod BONUS_POINT_TRANS_TYPE_CREATE = new BonusPointTransTypeRequestMethod("BonusPointTransTypeCreate");
  /** Variable representing the BonusPointTransTypeDelete method */
  public static final BonusPointTransTypeRequestMethod BONUS_POINT_TRANS_TYPE_DELETE = new BonusPointTransTypeRequestMethod("BonusPointTransTypeDelete");
  /** Variable representing the BonusPointTransTypeFind method */
  public static final BonusPointTransTypeRequestMethod BONUS_POINT_TRANS_TYPE_FIND = new BonusPointTransTypeRequestMethod("BonusPointTransTypeFind");
  /** Variable representing the BonusPointTransTypeGet method */
  public static final BonusPointTransTypeRequestMethod BONUS_POINT_TRANS_TYPE_GET = new BonusPointTransTypeRequestMethod("BonusPointTransTypeGet");
  /** Variable representing the BonusPointTransTypeUpdate method */
  public static final BonusPointTransTypeRequestMethod BONUS_POINT_TRANS_TYPE_UPDATE = new BonusPointTransTypeRequestMethod("BonusPointTransTypeUpdate");
}
