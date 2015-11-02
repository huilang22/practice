/*
 * Generated code DO NOT EDIT
 * Generated file: InvsNetworkDeviceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsNetworkDeviceRequestMethod implements UdtMethod {
  private String method = null;
  private InvsNetworkDeviceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsNetworkDeviceCreate method */
  public static final InvsNetworkDeviceRequestMethod INVS_NETWORK_DEVICE_CREATE = new InvsNetworkDeviceRequestMethod("InvsNetworkDeviceCreate");
  /** Variable representing the InvsNetworkDeviceFind method */
  public static final InvsNetworkDeviceRequestMethod INVS_NETWORK_DEVICE_FIND = new InvsNetworkDeviceRequestMethod("InvsNetworkDeviceFind");
  /** Variable representing the InvsNetworkDeviceGet method */
  public static final InvsNetworkDeviceRequestMethod INVS_NETWORK_DEVICE_GET = new InvsNetworkDeviceRequestMethod("InvsNetworkDeviceGet");
  /** Variable representing the InvsNetworkDeviceUpdate method */
  public static final InvsNetworkDeviceRequestMethod INVS_NETWORK_DEVICE_UPDATE = new InvsNetworkDeviceRequestMethod("InvsNetworkDeviceUpdate");
}
