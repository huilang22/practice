/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigAddressCategoryMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EmfConfigAddressCategoryMapRequestMethod implements UdtMethod {
  private String method = null;
  private EmfConfigAddressCategoryMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EmfConfigAddressCategoryMapCreate method */
  public static final EmfConfigAddressCategoryMapRequestMethod EMF_CONFIG_ADDRESS_CATEGORY_MAP_CREATE = new EmfConfigAddressCategoryMapRequestMethod("EmfConfigAddressCategoryMapCreate");
  /** Variable representing the EmfConfigAddressCategoryMapDelete method */
  public static final EmfConfigAddressCategoryMapRequestMethod EMF_CONFIG_ADDRESS_CATEGORY_MAP_DELETE = new EmfConfigAddressCategoryMapRequestMethod("EmfConfigAddressCategoryMapDelete");
  /** Variable representing the EmfConfigAddressCategoryMapFind method */
  public static final EmfConfigAddressCategoryMapRequestMethod EMF_CONFIG_ADDRESS_CATEGORY_MAP_FIND = new EmfConfigAddressCategoryMapRequestMethod("EmfConfigAddressCategoryMapFind");
  /** Variable representing the EmfConfigAddressCategoryMapGet method */
  public static final EmfConfigAddressCategoryMapRequestMethod EMF_CONFIG_ADDRESS_CATEGORY_MAP_GET = new EmfConfigAddressCategoryMapRequestMethod("EmfConfigAddressCategoryMapGet");
  /** Variable representing the EmfConfigAddressCategoryMapUpdate method */
  public static final EmfConfigAddressCategoryMapRequestMethod EMF_CONFIG_ADDRESS_CATEGORY_MAP_UPDATE = new EmfConfigAddressCategoryMapRequestMethod("EmfConfigAddressCategoryMapUpdate");
}
