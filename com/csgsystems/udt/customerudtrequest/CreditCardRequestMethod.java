/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CreditCardRequestMethod implements UdtMethod {
  private String method = null;
  private CreditCardRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CreditCardCreate method */
  public static final CreditCardRequestMethod CREDIT_CARD_CREATE = new CreditCardRequestMethod("CreditCardCreate");
  /** Variable representing the CreditCardFind method */
  public static final CreditCardRequestMethod CREDIT_CARD_FIND = new CreditCardRequestMethod("CreditCardFind");
  /** Variable representing the CreditCardGet method */
  public static final CreditCardRequestMethod CREDIT_CARD_GET = new CreditCardRequestMethod("CreditCardGet");
  /** Variable representing the CreditCardUpdate method */
  public static final CreditCardRequestMethod CREDIT_CARD_UPDATE = new CreditCardRequestMethod("CreditCardUpdate");
  /** Variable representing the CreditCardValidate method */
  public static final CreditCardRequestMethod CREDIT_CARD_VALIDATE = new CreditCardRequestMethod("CreditCardValidate");
}
