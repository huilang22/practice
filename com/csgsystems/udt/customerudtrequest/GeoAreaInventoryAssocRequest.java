/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaInventoryAssocRequest.java
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
public final class GeoAreaInventoryAssocRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GeoAreaInventoryAssocRequest (String request, GeoAreaInventoryAssocRequestMethod method) {
    initialize(request, "GeoAreaInventoryAssoc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GeoAreaInventoryAssocRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGeoAreaInventoryAssocForGeoAreaInventoryAssocCreate(GeoAreaInventoryAssocObjectData data) {
    if (data != null) {
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(data, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }
  public void setGeoAreaInventoryAssocForGeoAreaInventoryAssocFind(GeoAreaInventoryAssocObjectFilter data) {
    if (data != null) {
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(data, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }
  public void setGeoAreaInventoryAssocForGeoAreaInventoryAssocGet(GeoAreaInventoryAssocObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectKeyHelper.toMap(data, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }
  public void setInventoryIdForGeoAreaInventoryAssocResetAuto(Integer data) {
    if (data != null) {
      addInput("InventoryId", data);
    }
  }
  public void setInventoryIdResetsForGeoAreaInventoryAssocResetAuto(Integer data) {
    if (data != null) {
      addInput("InventoryIdResets", data);
    }
  }
  public void setGeoAreaInventoryAssocForGeoAreaInventoryAssocUpdate(GeoAreaInventoryAssocObjectData data) {
    if (data != null) {
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(data, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }
  public GeoAreaInventoryAssocObjectData getGeoAreaInventoryAssocObjectDataGeoAreaInventoryAssocFromGeoAreaInventoryAssocCreate() {
    return GeoAreaInventoryAssocObjectHelper.fromMap(outputMap, "GeoAreaInventoryAssoc");
  }
  public GeoAreaInventoryAssocObjectDataList getGeoAreaInventoryAssocObjectDataGeoAreaInventoryAssocFromGeoAreaInventoryAssocFind() {
    return GeoAreaInventoryAssocObjectHelper.fromMapList(outputMap, "GeoAreaInventoryAssocList");
  }
  public GeoAreaInventoryAssocObjectData getGeoAreaInventoryAssocObjectDataGeoAreaInventoryAssocFromGeoAreaInventoryAssocGet() {
    return GeoAreaInventoryAssocObjectHelper.fromMap(outputMap, "GeoAreaInventoryAssoc");
  }
  public GeoAreaInventoryAssocObjectData getGeoAreaInventoryAssocObjectDataGeoAreaInventoryAssocFromGeoAreaInventoryAssocUpdate() {
    return GeoAreaInventoryAssocObjectHelper.fromMap(outputMap, "GeoAreaInventoryAssoc");
  }
  /**
   @deprecated
   */
  public void setGeoAreaInventoryAssocObjectFilter(GeoAreaInventoryAssocObjectFilter data) {
    if (data != null) {
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(data, new HashMap()).get("GeoAreaInventoryAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaInventoryAssocObjectData(GeoAreaInventoryAssocObjectData data) {
    if (data != null) {
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(data, new HashMap()).get("GeoAreaInventoryAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaInventoryAssocObjectKeyData(GeoAreaInventoryAssocObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectKeyHelper.toMap(data, new HashMap()).get("GeoAreaInventoryAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public GeoAreaInventoryAssocObjectDataList getGeoAreaInventoryAssocObjectDataList() {
    return GeoAreaInventoryAssocObjectHelper.fromMapList(outputMap, "GeoAreaInventoryAssocList");
  }
  /**
   @deprecated
   */
  public GeoAreaInventoryAssocObjectData getGeoAreaInventoryAssocObjectData() {
    return GeoAreaInventoryAssocObjectHelper.fromMap(outputMap, "GeoAreaInventoryAssoc");
  }
  /**
   @deprecated
   */
  public void setInventoryId(Integer data) {
    if (data != null) {
      addInput("InventoryId", data);
    }
  }
  /**
   @deprecated
   */
  public void setInventoryIdResets(Integer data) {
    if (data != null) {
      addInput("InventoryIdResets", data);
    }
  }
}
