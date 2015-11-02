/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTransDescrRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NrcTransDescrRequestMethod implements UdtMethod {
  private String method = null;
  private NrcTransDescrRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NrcTransDescrCreate method */
  public static final NrcTransDescrRequestMethod NRC_TRANS_DESCR_CREATE = new NrcTransDescrRequestMethod("NrcTransDescrCreate");
  /** Variable representing the NrcTransDescrFind method */
  public static final NrcTransDescrRequestMethod NRC_TRANS_DESCR_FIND = new NrcTransDescrRequestMethod("NrcTransDescrFind");
  /** Variable representing the NrcTransDescrFindByAccount method */
  public static final NrcTransDescrRequestMethod NRC_TRANS_DESCR_FIND_BY_ACCOUNT = new NrcTransDescrRequestMethod("NrcTransDescrFindByAccount");
  /** Variable representing the NrcTransDescrFindByService method */
  public static final NrcTransDescrRequestMethod NRC_TRANS_DESCR_FIND_BY_SERVICE = new NrcTransDescrRequestMethod("NrcTransDescrFindByService");
  /** Variable representing the NrcTransDescrGet method */
  public static final NrcTransDescrRequestMethod NRC_TRANS_DESCR_GET = new NrcTransDescrRequestMethod("NrcTransDescrGet");
  /** Variable representing the NrcTransDescrQuote method */
  public static final NrcTransDescrRequestMethod NRC_TRANS_DESCR_QUOTE = new NrcTransDescrRequestMethod("NrcTransDescrQuote");
  /** Variable representing the NrcTransDescrUpdate method */
  public static final NrcTransDescrRequestMethod NRC_TRANS_DESCR_UPDATE = new NrcTransDescrRequestMethod("NrcTransDescrUpdate");
}
