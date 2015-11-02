/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAddressRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AdrAddressRequestMethod implements UdtMethod {
  private String method = null;
  private AdrAddressRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AdrAddressCreate method */
  public static final AdrAddressRequestMethod ADR_ADDRESS_CREATE = new AdrAddressRequestMethod("AdrAddressCreate");
  /** Variable representing the AdrAddressCreateInternal method */
  public static final AdrAddressRequestMethod ADR_ADDRESS_CREATE_INTERNAL = new AdrAddressRequestMethod("AdrAddressCreateInternal");
  /** Variable representing the AdrAddressExtendedDataFind method */
  public static final AdrAddressRequestMethod ADR_ADDRESS_EXTENDED_DATA_FIND = new AdrAddressRequestMethod("AdrAddressExtendedDataFind");
  /** Variable representing the AdrAddressFind method */
  public static final AdrAddressRequestMethod ADR_ADDRESS_FIND = new AdrAddressRequestMethod("AdrAddressFind");
  /** Variable representing the AdrAddressFindByAccount method */
  public static final AdrAddressRequestMethod ADR_ADDRESS_FIND_BY_ACCOUNT = new AdrAddressRequestMethod("AdrAddressFindByAccount");
  /** Variable representing the AdrAddressFindWithExtendedData method */
  public static final AdrAddressRequestMethod ADR_ADDRESS_FIND_WITH_EXTENDED_DATA = new AdrAddressRequestMethod("AdrAddressFindWithExtendedData");
  /** Variable representing the AdrAddressGet method */
  public static final AdrAddressRequestMethod ADR_ADDRESS_GET = new AdrAddressRequestMethod("AdrAddressGet");
  /** Variable representing the AdrAddressUpdate method */
  public static final AdrAddressRequestMethod ADR_ADDRESS_UPDATE = new AdrAddressRequestMethod("AdrAddressUpdate");
  /** Variable representing the AdrAddressUpdateInternal method */
  public static final AdrAddressRequestMethod ADR_ADDRESS_UPDATE_INTERNAL = new AdrAddressRequestMethod("AdrAddressUpdateInternal");
}
