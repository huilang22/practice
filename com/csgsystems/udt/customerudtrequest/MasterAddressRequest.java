/*
 * Generated code DO NOT EDIT
 * Generated file: MasterAddressRequest.java
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
public final class MasterAddressRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public MasterAddressRequest (String request, MasterAddressRequestMethod method) {
    initialize(request, "MasterAddress", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (MasterAddressRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setMasterAddressForMasterAddressCreate(MasterAddressObjectData data) {
    if (data != null) {
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(data, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }
  public void setMasterAddressForMasterAddressExtendedDataFind(MasterAddressObjectKeyData data) {
    if (data != null) {
      addInput("MasterAddress", MasterAddressObjectKeyHelper.toMap(data, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }
  public void setMasterAddressForMasterAddressFind(MasterAddressObjectFilter data) {
    if (data != null) {
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(data, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }
  public void setMasterAddressForMasterAddressFindWithExtendedData(MasterAddressObjectFilter data) {
    if (data != null) {
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(data, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }
  public void setMasterAddressForMasterAddressGet(MasterAddressObjectKeyData data) {
    if (data != null) {
      addInput("MasterAddress", MasterAddressObjectKeyHelper.toMap(data, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }
  public void setMasterAddressForMasterAddressUpdate(MasterAddressObjectData data) {
    if (data != null) {
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(data, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }
  public MasterAddressObjectData getMasterAddressObjectDataMasterAddressFromMasterAddressCreate() {
    return MasterAddressObjectHelper.fromMap(outputMap, "MasterAddress");
  }
  public MasterAddressEDObjectDataList getMasterAddressEDObjectDataMasterAddressExtendedDataFromMasterAddressExtendedDataFind() {
    return MasterAddressEDObjectHelper.fromMapList(outputMap, "MasterAddressExtendedDataList");
  }
  public MasterAddressObjectDataList getMasterAddressObjectDataMasterAddressFromMasterAddressFind() {
    return MasterAddressObjectHelper.fromMapList(outputMap, "MasterAddressList");
  }
  public MasterAddressObjectDataList getMasterAddressObjectDataMasterAddressFromMasterAddressFindWithExtendedData() {
    return MasterAddressObjectHelper.fromMapList(outputMap, "MasterAddressList");
  }
  public MasterAddressObjectData getMasterAddressObjectDataMasterAddressFromMasterAddressGet() {
    return MasterAddressObjectHelper.fromMap(outputMap, "MasterAddress");
  }
  public MasterAddressObjectData getMasterAddressObjectDataMasterAddressFromMasterAddressUpdate() {
    return MasterAddressObjectHelper.fromMap(outputMap, "MasterAddress");
  }
  /**
   @deprecated
   */
  public MasterAddressEDObjectDataList getMasterAddressEDObjectDataList() {
    return MasterAddressEDObjectHelper.fromMapList(outputMap, "MasterAddressList");
  }
  /**
   @deprecated
   */
  public void setMasterAddressObjectFilter(MasterAddressObjectFilter data) {
    if (data != null) {
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(data, new HashMap()).get("MasterAddressObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMasterAddressObjectData(MasterAddressObjectData data) {
    if (data != null) {
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(data, new HashMap()).get("MasterAddressObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMasterAddressObjectKeyData(MasterAddressObjectKeyData data) {
    if (data != null) {
      addInput("MasterAddress", MasterAddressObjectKeyHelper.toMap(data, new HashMap()).get("MasterAddressObject"));
    }
  }
  /**
   @deprecated
   */
  public MasterAddressObjectDataList getMasterAddressObjectDataList() {
    return MasterAddressObjectHelper.fromMapList(outputMap, "MasterAddressList");
  }
  /**
   @deprecated
   */
  public Map  getMasterAddressObjectExtendedData() {
    return MasterAddressObjectHelper.fromMap(outputMap, "MasterAddress").extendedData;
  }
  
  /**
   @deprecated
   */
  public MasterAddressObjectData getMasterAddressObjectData() {
    return MasterAddressObjectHelper.fromMap(outputMap, "MasterAddress");
  }
}
