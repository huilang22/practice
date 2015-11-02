/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGenreRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcGenreRequestMethod implements UdtMethod {
  private String method = null;
  private CtcGenreRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcGenreCreate method */
  public static final CtcGenreRequestMethod CTC_GENRE_CREATE = new CtcGenreRequestMethod("CtcGenreCreate");
  /** Variable representing the CtcGenreDelete method */
  public static final CtcGenreRequestMethod CTC_GENRE_DELETE = new CtcGenreRequestMethod("CtcGenreDelete");
  /** Variable representing the CtcGenreFind method */
  public static final CtcGenreRequestMethod CTC_GENRE_FIND = new CtcGenreRequestMethod("CtcGenreFind");
  /** Variable representing the CtcGenreGet method */
  public static final CtcGenreRequestMethod CTC_GENRE_GET = new CtcGenreRequestMethod("CtcGenreGet");
  /** Variable representing the CtcGenreUpdate method */
  public static final CtcGenreRequestMethod CTC_GENRE_UPDATE = new CtcGenreRequestMethod("CtcGenreUpdate");
}
