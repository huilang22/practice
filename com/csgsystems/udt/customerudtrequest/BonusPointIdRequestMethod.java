/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointIdRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BonusPointIdRequestMethod implements UdtMethod {
  private String method = null;
  private BonusPointIdRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BonusPointIdCreate method */
  public static final BonusPointIdRequestMethod BONUS_POINT_ID_CREATE = new BonusPointIdRequestMethod("BonusPointIdCreate");
  /** Variable representing the BonusPointIdDelete method */
  public static final BonusPointIdRequestMethod BONUS_POINT_ID_DELETE = new BonusPointIdRequestMethod("BonusPointIdDelete");
  /** Variable representing the BonusPointIdFind method */
  public static final BonusPointIdRequestMethod BONUS_POINT_ID_FIND = new BonusPointIdRequestMethod("BonusPointIdFind");
  /** Variable representing the BonusPointIdGet method */
  public static final BonusPointIdRequestMethod BONUS_POINT_ID_GET = new BonusPointIdRequestMethod("BonusPointIdGet");
  /** Variable representing the BonusPointIdUpdate method */
  public static final BonusPointIdRequestMethod BONUS_POINT_ID_UPDATE = new BonusPointIdRequestMethod("BonusPointIdUpdate");
}
