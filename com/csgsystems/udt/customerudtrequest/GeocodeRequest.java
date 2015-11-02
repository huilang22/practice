/*
 * Generated code DO NOT EDIT
 * Generated file: GeocodeRequest.java
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

import com.csgsystems.bp.data.*;
public final class GeocodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GeocodeRequest (String request, GeocodeRequestMethod method) {
    initialize(request, "Geocode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GeocodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCountryCodeForConvertGeocode(Integer data) {
    if (data != null) {
      addInput("CountryCode", data);
    }
  }
  public void setFranchiseCodeForConvertGeocode(Integer data) {
    if (data != null) {
      addInput("FranchiseCode", data);
    }
  }
  public void setVertexGeocodeForConvertGeocode(String data) {
    if (data != null) {
      addInput("VertexGeocode", data);
    }
  }
  public void setCityForGeocodeComponentsFind(String data) {
    if (data != null) {
      addInput("City", data);
    }
  }
  public void setCountyForGeocodeComponentsFind(String data) {
    if (data != null) {
      addInput("County", data);
    }
  }
  public void setStateForGeocodeComponentsFind(String data) {
    if (data != null) {
      addInput("State", data);
    }
  }
  public void setGeocodeAddressForGeocodeFind(GeocodeAddressObjectData data) {
    if (data != null) {
      addInput("GeocodeAddress", GeocodeAddressObjectHelper.toMap(data, new HashMap(), "GeocodeAddress").get("GeocodeAddress"));
    }
  }
  public String getStringFXgeocodeFromConvertGeocode() {
    return (String)outputMap.get("FXgeocode");
  }
  public GeocodeComponentsObjectDataList getGeocodeComponentsObjectDataGeocodeComponentsFromGeocodeComponentsFind() {
    return GeocodeComponentsObjectHelper.fromMapList(outputMap, "GeocodeComponentsList");
  }
  public GeocodeObjectDataList getGeocodeObjectDataGeocodeFromGeocodeFind() {
    return GeocodeObjectHelper.fromMapList(outputMap, "GeocodeList");
  }
  /**
   @deprecated
   */
  public void setCity(String data) {
    if (data != null) {
      addInput("City", data);
    }
  }
  /**
   @deprecated
   */
  public void setCountryCode(Integer data) {
    if (data != null) {
      addInput("CountryCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setCounty(String data) {
    if (data != null) {
      addInput("County", data);
    }
  }
  /**
   @deprecated
   */
  public String getFXgeocode() {
    return (String)outputMap.get("FXgeocode");
  }
  /**
   @deprecated
   */
  public void setFranchiseCode(Integer data) {
    if (data != null) {
      addInput("FranchiseCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setGeocodeAddressObjectData(GeocodeAddressObjectData data) {
    if (data != null) {
      addInput("GeocodeAddress", GeocodeAddressObjectHelper.toMap(data, new HashMap()).get("GeocodeAddressObject"));
    }
  }
  /**
   @deprecated
   */
  public GeocodeComponentsObjectDataList getGeocodeComponentsObjectDataList() {
    return GeocodeComponentsObjectHelper.fromMapList(outputMap, "GeocodeList");
  }
  /**
   @deprecated
   */
  public GeocodeObjectDataList getGeocodeObjectDataList() {
    return GeocodeObjectHelper.fromMapList(outputMap, "GeocodeList");
  }
  /**
   @deprecated
   */
  public void setState(String data) {
    if (data != null) {
      addInput("State", data);
    }
  }
  /**
   @deprecated
   */
  public void setVertexGeocode(String data) {
    if (data != null) {
      addInput("VertexGeocode", data);
    }
  }
}
