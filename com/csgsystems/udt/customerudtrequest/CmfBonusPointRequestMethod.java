/*
 * Generated code DO NOT EDIT
 * Generated file: CmfBonusPointRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CmfBonusPointRequestMethod implements UdtMethod {
  private String method = null;
  private CmfBonusPointRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CmfBonusPointCreate method */
  public static final CmfBonusPointRequestMethod CMF_BONUS_POINT_CREATE = new CmfBonusPointRequestMethod("CmfBonusPointCreate");
  /** Variable representing the CmfBonusPointFind method */
  public static final CmfBonusPointRequestMethod CMF_BONUS_POINT_FIND = new CmfBonusPointRequestMethod("CmfBonusPointFind");
  /** Variable representing the CmfBonusPointGet method */
  public static final CmfBonusPointRequestMethod CMF_BONUS_POINT_GET = new CmfBonusPointRequestMethod("CmfBonusPointGet");
  /** Variable representing the CmfBonusPointUpdate method */
  public static final CmfBonusPointRequestMethod CMF_BONUS_POINT_UPDATE = new CmfBonusPointRequestMethod("CmfBonusPointUpdate");
}
