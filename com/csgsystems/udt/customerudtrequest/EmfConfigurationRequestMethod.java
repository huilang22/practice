/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigurationRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EmfConfigurationRequestMethod implements UdtMethod {
  private String method = null;
  private EmfConfigurationRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EmfConfigurationFind method */
  public static final EmfConfigurationRequestMethod EMF_CONFIGURATION_FIND = new EmfConfigurationRequestMethod("EmfConfigurationFind");
  /** Variable representing the EmfConfigurationGet method */
  public static final EmfConfigurationRequestMethod EMF_CONFIGURATION_GET = new EmfConfigurationRequestMethod("EmfConfigurationGet");
}
