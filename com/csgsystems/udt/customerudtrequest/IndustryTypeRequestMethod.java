/*
 * Generated code DO NOT EDIT
 * Generated file: IndustryTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class IndustryTypeRequestMethod implements UdtMethod {
  private String method = null;
  private IndustryTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the IndustryTypeFind method */
  public static final IndustryTypeRequestMethod INDUSTRY_TYPE_FIND = new IndustryTypeRequestMethod("IndustryTypeFind");
  /** Variable representing the IndustryTypeFindByAccount method */
  public static final IndustryTypeRequestMethod INDUSTRY_TYPE_FIND_BY_ACCOUNT = new IndustryTypeRequestMethod("IndustryTypeFindByAccount");
  /** Variable representing the IndustryTypeFindByAddress method */
  public static final IndustryTypeRequestMethod INDUSTRY_TYPE_FIND_BY_ADDRESS = new IndustryTypeRequestMethod("IndustryTypeFindByAddress");
  /** Variable representing the IndustryTypeFindCount method */
  public static final IndustryTypeRequestMethod INDUSTRY_TYPE_FIND_COUNT = new IndustryTypeRequestMethod("IndustryTypeFindCount");
  /** Variable representing the IndustryTypeGet method */
  public static final IndustryTypeRequestMethod INDUSTRY_TYPE_GET = new IndustryTypeRequestMethod("IndustryTypeGet");
}
