/*
 * Generated code DO NOT EDIT
 * Generated file: MasterAddressRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class MasterAddressRequestMethod implements UdtMethod {
  private String method = null;
  private MasterAddressRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the MasterAddressCreate method */
  public static final MasterAddressRequestMethod MASTER_ADDRESS_CREATE = new MasterAddressRequestMethod("MasterAddressCreate");
  /** Variable representing the MasterAddressExtendedDataFind method */
  public static final MasterAddressRequestMethod MASTER_ADDRESS_EXTENDED_DATA_FIND = new MasterAddressRequestMethod("MasterAddressExtendedDataFind");
  /** Variable representing the MasterAddressFind method */
  public static final MasterAddressRequestMethod MASTER_ADDRESS_FIND = new MasterAddressRequestMethod("MasterAddressFind");
  /** Variable representing the MasterAddressFindWithExtendedData method */
  public static final MasterAddressRequestMethod MASTER_ADDRESS_FIND_WITH_EXTENDED_DATA = new MasterAddressRequestMethod("MasterAddressFindWithExtendedData");
  /** Variable representing the MasterAddressGet method */
  public static final MasterAddressRequestMethod MASTER_ADDRESS_GET = new MasterAddressRequestMethod("MasterAddressGet");
  /** Variable representing the MasterAddressUpdate method */
  public static final MasterAddressRequestMethod MASTER_ADDRESS_UPDATE = new MasterAddressRequestMethod("MasterAddressUpdate");
}
