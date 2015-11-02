/*
 * Generated code DO NOT EDIT
 * Generated file: LanguageCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class LanguageCodeRequestMethod implements UdtMethod {
  private String method = null;
  private LanguageCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the LanguageCodeCreate method */
  public static final LanguageCodeRequestMethod LANGUAGE_CODE_CREATE = new LanguageCodeRequestMethod("LanguageCodeCreate");
  /** Variable representing the LanguageCodeDelete method */
  public static final LanguageCodeRequestMethod LANGUAGE_CODE_DELETE = new LanguageCodeRequestMethod("LanguageCodeDelete");
  /** Variable representing the LanguageCodeFind method */
  public static final LanguageCodeRequestMethod LANGUAGE_CODE_FIND = new LanguageCodeRequestMethod("LanguageCodeFind");
  /** Variable representing the LanguageCodeGet method */
  public static final LanguageCodeRequestMethod LANGUAGE_CODE_GET = new LanguageCodeRequestMethod("LanguageCodeGet");
  /** Variable representing the LanguageCodeUpdate method */
  public static final LanguageCodeRequestMethod LANGUAGE_CODE_UPDATE = new LanguageCodeRequestMethod("LanguageCodeUpdate");
}
