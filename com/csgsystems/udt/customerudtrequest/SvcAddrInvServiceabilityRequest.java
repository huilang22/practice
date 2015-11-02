/*
 * Generated code DO NOT EDIT
 * Generated file: SvcAddrInvServiceabilityRequest.java
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

import com.csgsystems.iv.data.*;
public final class SvcAddrInvServiceabilityRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SvcAddrInvServiceabilityRequest (String request, SvcAddrInvServiceabilityRequestMethod method) {
    initialize(request, "SvcAddrInvServiceability", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SvcAddrInvServiceabilityRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdForServiceAddressInventoryServiceabilityValidate(BigInteger data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setServiceForServiceAddressInventoryServiceabilityValidate(ServiceKeyOnlyObjData data) {
    if (data != null) {
      addInput("Service", ServiceKeyOnlyObjHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromServiceAddressInventoryServiceabilityValidate() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
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
  public InvElementObjDataList getInvElementObjDataList() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementObjList");
  }
  /**
   @deprecated
   */
  public void setServiceKeyOnlyObjDataArray(ServiceKeyOnlyObjData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = ServiceKeyOnlyObjHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceKeyOnlyObj");
      }
      addInput("ServiceKeyOnlyObjList", list);
    }
  }
}
