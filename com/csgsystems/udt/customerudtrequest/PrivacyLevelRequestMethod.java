/*
 * Generated code DO NOT EDIT
 * Generated file: PrivacyLevelRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PrivacyLevelRequestMethod implements UdtMethod {
  private String method = null;
  private PrivacyLevelRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PrivacyLevelCreate method */
  public static final PrivacyLevelRequestMethod PRIVACY_LEVEL_CREATE = new PrivacyLevelRequestMethod("PrivacyLevelCreate");
  /** Variable representing the PrivacyLevelDelete method */
  public static final PrivacyLevelRequestMethod PRIVACY_LEVEL_DELETE = new PrivacyLevelRequestMethod("PrivacyLevelDelete");
  /** Variable representing the PrivacyLevelFind method */
  public static final PrivacyLevelRequestMethod PRIVACY_LEVEL_FIND = new PrivacyLevelRequestMethod("PrivacyLevelFind");
  /** Variable representing the PrivacyLevelGet method */
  public static final PrivacyLevelRequestMethod PRIVACY_LEVEL_GET = new PrivacyLevelRequestMethod("PrivacyLevelGet");
  /** Variable representing the PrivacyLevelUpdate method */
  public static final PrivacyLevelRequestMethod PRIVACY_LEVEL_UPDATE = new PrivacyLevelRequestMethod("PrivacyLevelUpdate");
}
