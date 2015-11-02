/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTransDescrValidateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NrcTransDescrValidateRequestMethod implements UdtMethod {
  private String method = null;
  private NrcTransDescrValidateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NrcTransDescrValidateCreate method */
  public static final NrcTransDescrValidateRequestMethod NRC_TRANS_DESCR_VALIDATE_CREATE = new NrcTransDescrValidateRequestMethod("NrcTransDescrValidateCreate");
}
