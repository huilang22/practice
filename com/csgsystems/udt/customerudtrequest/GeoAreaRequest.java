/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaRequest.java
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
public final class GeoAreaRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GeoAreaRequest (String request, GeoAreaRequestMethod method) {
    initialize(request, "GeoArea", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GeoAreaRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGeoAreaForGeoAreaCreate(GAObjectData data) {
    if (data != null) {
      addInput("GeoArea", GAObjectHelper.toMap(data, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }
  public void setGeoAreaForGeoAreaDelete(GAObjectKeyData data) {
    if (data != null) {
      addInput("GeoArea", GAObjectKeyHelper.toMap(data, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }
  public void setAddressIdForGeoAreaFindByAddress(BigInteger data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setGeoAreaTypeIdForGeoAreaFindByAddress(Integer data) {
    if (data != null) {
      addInput("GeoAreaTypeId", data);
    }
  }
  public void setLanguageCodeForGeoAreaFindByAddress(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setGeoAreaForGeoAreaFind(GAObjectFilter data) {
    if (data != null) {
      addInput("GeoArea", GAObjectHelper.toMap(data, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }
  public void setGeoAreaForGeoAreaGet(GAObjectKeyData data) {
    if (data != null) {
      addInput("GeoArea", GAObjectKeyHelper.toMap(data, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }
  public void setGeoAreaForGeoAreaUpdate(GAObjectData data) {
    if (data != null) {
      addInput("GeoArea", GAObjectHelper.toMap(data, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }
  public GAObjectData getGAObjectDataGeoAreaFromGeoAreaCreate() {
    return GAObjectHelper.fromMap(outputMap, "GeoArea");
  }
  public GAObjectData getGAObjectDataGeoAreaFromGeoAreaDelete() {
    return GAObjectHelper.fromMap(outputMap, "GeoArea");
  }
  public GAObjectDataList getGAObjectDataGeoAreaFromGeoAreaFindByAddress() {
    return GAObjectHelper.fromMapList(outputMap, "GeoAreaList");
  }
  public GAObjectDataList getGAObjectDataGeoAreaFromGeoAreaFind() {
    return GAObjectHelper.fromMapList(outputMap, "GeoAreaList");
  }
  public GAObjectData getGAObjectDataGeoAreaFromGeoAreaGet() {
    return GAObjectHelper.fromMap(outputMap, "GeoArea");
  }
  public GAObjectData getGAObjectDataGeoAreaFromGeoAreaUpdate() {
    return GAObjectHelper.fromMap(outputMap, "GeoArea");
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
  public void setGAObjectFilter(GAObjectFilter data) {
    if (data != null) {
      addInput("GA", GAObjectHelper.toMap(data, new HashMap()).get("GAObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGAObjectData(GAObjectData data) {
    if (data != null) {
      addInput("GeoArea", GAObjectHelper.toMap(data, new HashMap()).get("GAObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGAObjectKeyData(GAObjectKeyData data) {
    if (data != null) {
      addInput("GeoArea", GAObjectKeyHelper.toMap(data, new HashMap()).get("GAObject"));
    }
  }
  /**
   @deprecated
   */
  public GAObjectDataList getGAObjectDataList() {
    return GAObjectHelper.fromMapList(outputMap, "GAList");
  }
  /**
   @deprecated
   */
  public GAObjectData getGAObjectData() {
    return GAObjectHelper.fromMap(outputMap, "GeoArea");
  }
  /**
   @deprecated
   */
  public void setGeoAreaTypeId(Integer data) {
    if (data != null) {
      addInput("GeoAreaTypeId", data);
    }
  }
  /**
   @deprecated
   */
  public void setLanguageCode(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
}
