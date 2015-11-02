/*
 * Generated code DO NOT EDIT
 * Generated file: BsdLocaleRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdLocaleRequestMethod implements UdtMethod {
  private String method = null;
  private BsdLocaleRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdLocaleCreate method */
  public static final BsdLocaleRequestMethod BSD_LOCALE_CREATE = new BsdLocaleRequestMethod("BsdLocaleCreate");
  /** Variable representing the BsdLocaleDelete method */
  public static final BsdLocaleRequestMethod BSD_LOCALE_DELETE = new BsdLocaleRequestMethod("BsdLocaleDelete");
  /** Variable representing the BsdLocaleDeleteAll method */
  public static final BsdLocaleRequestMethod BSD_LOCALE_DELETE_ALL = new BsdLocaleRequestMethod("BsdLocaleDeleteAll");
  /** Variable representing the BsdLocaleFind method */
  public static final BsdLocaleRequestMethod BSD_LOCALE_FIND = new BsdLocaleRequestMethod("BsdLocaleFind");
  /** Variable representing the BsdLocaleGet method */
  public static final BsdLocaleRequestMethod BSD_LOCALE_GET = new BsdLocaleRequestMethod("BsdLocaleGet");
  /** Variable representing the BsdLocaleSequenceGet method */
  public static final BsdLocaleRequestMethod BSD_LOCALE_SEQUENCE_GET = new BsdLocaleRequestMethod("BsdLocaleSequenceGet");
  /** Variable representing the BsdLocaleUpdate method */
  public static final BsdLocaleRequestMethod BSD_LOCALE_UPDATE = new BsdLocaleRequestMethod("BsdLocaleUpdate");
}
