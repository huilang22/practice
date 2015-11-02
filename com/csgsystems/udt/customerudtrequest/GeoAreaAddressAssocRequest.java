/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaAddressAssocRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.svbl.data.*;
public final class GeoAreaAddressAssocRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GeoAreaAddressAssocRequest (String request, GeoAreaAddressAssocRequestMethod method) {
    initialize(request, "GeoAreaAddressAssoc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GeoAreaAddressAssocRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGeoAreaAddressAssocForGeoAreaAddressAssocCreate(GeoAreaAddressAssocObjectData data) {
    if (data != null) {
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(data, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }
  public void setGeoAreaAddressAssocForGeoAreaAddressAssocFind(GeoAreaAddressAssocObjectFilter data) {
    if (data != null) {
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(data, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }
  public void setGeoAreaAddressAssocForGeoAreaAddressAssocGet(GeoAreaAddressAssocObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectKeyHelper.toMap(data, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }
  public void setAddressIdForGeoAreaAddressAssocResetAuto(BigInteger data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setGeoAreaAddressAssocForGeoAreaAddressAssocUpdate(GeoAreaAddressAssocObjectData data) {
    if (data != null) {
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(data, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }
  public GeoAreaAddressAssocObjectData getGeoAreaAddressAssocObjectDataGeoAreaAddressAssocFromGeoAreaAddressAssocCreate() {
    return GeoAreaAddressAssocObjectHelper.fromMap(outputMap, "GeoAreaAddressAssoc");
  }
  public GeoAreaAddressAssocObjectDataList getGeoAreaAddressAssocObjectDataGeoAreaAddressAssocFromGeoAreaAddressAssocFind() {
    return GeoAreaAddressAssocObjectHelper.fromMapList(outputMap, "GeoAreaAddressAssocList");
  }
  public GeoAreaAddressAssocObjectData getGeoAreaAddressAssocObjectDataGeoAreaAddressAssocFromGeoAreaAddressAssocGet() {
    return GeoAreaAddressAssocObjectHelper.fromMap(outputMap, "GeoAreaAddressAssoc");
  }
  public GeoAreaAddressAssocObjectData getGeoAreaAddressAssocObjectDataGeoAreaAddressAssocFromGeoAreaAddressAssocUpdate() {
    return GeoAreaAddressAssocObjectHelper.fromMap(outputMap, "GeoAreaAddressAssoc");
  }
  /**
   @deprecated
   */
  public void setAddressId(BigInteger data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaAddressAssocObjectFilter(GeoAreaAddressAssocObjectFilter data) {
    if (data != null) {
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(data, new HashMap()).get("GeoAreaAddressAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaAddressAssocObjectData(GeoAreaAddressAssocObjectData data) {
    if (data != null) {
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(data, new HashMap()).get("GeoAreaAddressAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaAddressAssocObjectKeyData(GeoAreaAddressAssocObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectKeyHelper.toMap(data, new HashMap()).get("GeoAreaAddressAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public GeoAreaAddressAssocObjectDataList getGeoAreaAddressAssocObjectDataList() {
    return GeoAreaAddressAssocObjectHelper.fromMapList(outputMap, "GeoAreaAddressAssocList");
  }
  /**
   @deprecated
   */
  public GeoAreaAddressAssocObjectData getGeoAreaAddressAssocObjectData() {
    return GeoAreaAddressAssocObjectHelper.fromMap(outputMap, "GeoAreaAddressAssoc");
  }
}
