/*
 * Generated code DO NOT EDIT
 * Generated file: SvcAddrServiceabilityRequest.java
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

import com.csgsystems.om.data.*;
public final class SvcAddrServiceabilityRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SvcAddrServiceabilityRequest (String request, SvcAddrServiceabilityRequestMethod method) {
    initialize(request, "SvcAddrServiceability", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SvcAddrServiceabilityRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdForServiceAddressComponentServiceabilityValidate(BigInteger data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setServiceForServiceAddressComponentServiceabilityValidate(SvcAddrObjectData data) {
    if (data != null) {
      addInput("Service", SvcAddrObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setAddressIdForServiceAddressProductServiceabilityValidate(BigInteger data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setServiceForServiceAddressProductServiceabilityValidate(SvcAddrObjectData data) {
    if (data != null) {
      addInput("Service", SvcAddrObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setAddressIdForServiceAddressServiceServiceabilityValidate(BigInteger data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setServiceForServiceAddressServiceServiceabilityValidate(SvcAddrObjectData data) {
    if (data != null) {
      addInput("Service", SvcAddrObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setAddressIdForServiceAddressServiceabilityValidate(Integer data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setServiceForServiceAddressServiceabilityValidate(ServiceObjectBaseData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public ComponentObjectDataList getComponentObjectDataComponentFromServiceAddressComponentServiceabilityValidate() {
    return ComponentObjectHelper.fromMapList(outputMap, "ComponentList");
  }
  public ProductObjectDataList getProductObjectDataProductFromServiceAddressProductServiceabilityValidate() {
    return ProductObjectHelper.fromMapList(outputMap, "ProductList");
  }
  public ServiceObjectDataList getServiceObjectDataServiceFromServiceAddressServiceServiceabilityValidate() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
  public SvcAddrObjectDataList getSvcAddrObjectDataSvcAddrServiceabilityFromServiceAddressServiceabilityValidate() {
    return SvcAddrObjectHelper.fromMapList(outputMap, "SvcAddrServiceabilityList");
  }
  /**
   @deprecated
   */
  public void setAddressId(Integer data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  /**
   @deprecated
   */
  public ComponentObjectDataList getComponentObjectDataList() {
    return ComponentObjectHelper.fromMapList(outputMap, "ComponentList");
  }
  /**
   @deprecated
   */
  public ProductObjectDataList getProductObjectDataList() {
    return ProductObjectHelper.fromMapList(outputMap, "ProductList");
  }
  /**
   @deprecated
   */
  public ServiceObjectDataList getServiceObjectDataList() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
  /**
   @deprecated
   */
  public void setServiceObjectBaseDataArray(ServiceObjectBaseData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = ServiceObjectBaseHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Service");
      }
      addInput("ServiceList", list);
    }
  }
  /**
   @deprecated
   */
  public void setSvcAddrObjectDataArray(SvcAddrObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = SvcAddrObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "SvcAddr");
      }
      addInput("SvcAddrList", list);
    }
  }
  /**
   @deprecated
   */
  public SvcAddrObjectDataList getSvcAddrObjectDataList() {
    return SvcAddrObjectHelper.fromMapList(outputMap, "SvcAddrList");
  }
}
