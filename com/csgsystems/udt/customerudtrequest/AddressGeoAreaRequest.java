/*
 * Generated code DO NOT EDIT
 * Generated file: AddressGeoAreaRequest.java
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
public final class AddressGeoAreaRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AddressGeoAreaRequest (String request, AddressGeoAreaRequestMethod method) {
    initialize(request, "AddressGeoArea", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AddressGeoAreaRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressGeoAreaForAddressGeoAreaFind(AGAObjectFilter data) {
    if (data != null) {
      addInput("AddressGeoArea", AGAObjectHelper.toMap(data, new HashMap(), "AddressGeoArea").get("AddressGeoArea"));
    }
  }
  public AGAObjectDataList getAGAObjectDataAddressGeoAreaFromAddressGeoAreaFind() {
    return AGAObjectHelper.fromMapList(outputMap, "AddressGeoAreaList");
  }
  /**
   @deprecated
   */
  public void setAGAObjectFilter(AGAObjectFilter data) {
    if (data != null) {
      addInput("AGA", AGAObjectHelper.toMap(data, new HashMap()).get("AGAObject"));
    }
  }
  /**
   @deprecated
   */
  public AGAObjectDataList getAGAObjectDataList() {
    return AGAObjectHelper.fromMapList(outputMap, "AGAList");
  }
}
