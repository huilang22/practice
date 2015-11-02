/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardTypeCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CreditCardTypeCodeRequestMethod implements UdtMethod {
  private String method = null;
  private CreditCardTypeCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CreditCardTypeCodeFind method */
  public static final CreditCardTypeCodeRequestMethod CREDIT_CARD_TYPE_CODE_FIND = new CreditCardTypeCodeRequestMethod("CreditCardTypeCodeFind");
  /** Variable representing the CreditCardTypeCodeGet method */
  public static final CreditCardTypeCodeRequestMethod CREDIT_CARD_TYPE_CODE_GET = new CreditCardTypeCodeRequestMethod("CreditCardTypeCodeGet");
}
