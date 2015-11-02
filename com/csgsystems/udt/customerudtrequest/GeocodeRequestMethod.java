/*
 * Generated code DO NOT EDIT
 * Generated file: GeocodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GeocodeRequestMethod implements UdtMethod {
  private String method = null;
  private GeocodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ConvertGeocode method */
  public static final GeocodeRequestMethod CONVERT_GEOCODE = new GeocodeRequestMethod("ConvertGeocode");
  /** Variable representing the GeocodeComponentsFind method */
  public static final GeocodeRequestMethod GEOCODE_COMPONENTS_FIND = new GeocodeRequestMethod("GeocodeComponentsFind");
  /** Variable representing the GeocodeFind method */
  public static final GeocodeRequestMethod GEOCODE_FIND = new GeocodeRequestMethod("GeocodeFind");
}
