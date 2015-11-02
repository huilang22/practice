/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAutoAssocRequest.java
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
public final class AdrAutoAssocRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AdrAutoAssocRequest (String request, AdrAutoAssocRequestMethod method) {
    initialize(request, "AdrAutoAssoc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AdrAutoAssocRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdForGeoAreaAddressAutoAssociate(BigInteger data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setBoundaryIdForGeoAreaAddressAutoAssociate(Integer data) {
    if (data != null) {
      addInput("BoundaryId", data);
    }
  }
  public void setEmailForGeoAreaAddressAutoAssociate(String data) {
    if (data != null) {
      addInput("Email", data);
    }
  }
  public void setEnableAsyncForGeoAreaAddressAutoAssociate(Integer data) {
    if (data != null) {
      addInput("EnableAsync", data);
    }
  }
  public GeoAreaAddressAutoAssociateOutputData getGeoAreaAddressAutoAssociateOutputDataGeoAreaAddressAutoAssociateOutputDataFromGeoAreaAddressAutoAssociate() {
    return GeoAreaAddressAutoAssociateOutputHelper.fromMap(outputMap);
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
  public void setBoundaryId(Integer data) {
    if (data != null) {
      addInput("BoundaryId", data);
    }
  }
  /**
   @deprecated
   */
  public void setEmail(String data) {
    if (data != null) {
      addInput("Email", data);
    }
  }
  /**
   @deprecated
   */
  public void setEnableAsync(Integer data) {
    if (data != null) {
      addInput("EnableAsync", data);
    }
  }
  /**
   @deprecated
   */
  public GeoAreaAddressAutoAssociateOutputData getGeoAreaAddressAutoAssociateOutputData() {
    return GeoAreaAddressAutoAssociateOutputHelper.fromMap(outputMap);
  }
}
