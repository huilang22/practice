/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDisplayFormatRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ChargeDisplayFormatRequestMethod implements UdtMethod {
  private String method = null;
  private ChargeDisplayFormatRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ChargeDisplayFormatCreate method */
  public static final ChargeDisplayFormatRequestMethod CHARGE_DISPLAY_FORMAT_CREATE = new ChargeDisplayFormatRequestMethod("ChargeDisplayFormatCreate");
  /** Variable representing the ChargeDisplayFormatFind method */
  public static final ChargeDisplayFormatRequestMethod CHARGE_DISPLAY_FORMAT_FIND = new ChargeDisplayFormatRequestMethod("ChargeDisplayFormatFind");
  /** Variable representing the ChargeDisplayFormatGet method */
  public static final ChargeDisplayFormatRequestMethod CHARGE_DISPLAY_FORMAT_GET = new ChargeDisplayFormatRequestMethod("ChargeDisplayFormatGet");
  /** Variable representing the ChargeDisplayFormatUpdate method */
  public static final ChargeDisplayFormatRequestMethod CHARGE_DISPLAY_FORMAT_UPDATE = new ChargeDisplayFormatRequestMethod("ChargeDisplayFormatUpdate");
}
