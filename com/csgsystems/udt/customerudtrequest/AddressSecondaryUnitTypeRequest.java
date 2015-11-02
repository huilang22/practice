/*
 * Generated code DO NOT EDIT
 * Generated file: AddressSecondaryUnitTypeRequest.java
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

import com.csgsystems.cf.data.*;
public final class AddressSecondaryUnitTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AddressSecondaryUnitTypeRequest (String request, AddressSecondaryUnitTypeRequestMethod method) {
    initialize(request, "AddressSecondaryUnitType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AddressSecondaryUnitTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressSecondaryUnitTypeForAddressSecondaryUnitTypeCreate(AddressSecondaryUnitTypeObjectData data) {
    if (data != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(data, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }
  public void setAddressSecondaryUnitTypeForAddressSecondaryUnitTypeDelete(AddressSecondaryUnitTypeObjectData data) {
    if (data != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(data, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }
  public void setAddressSecondaryUnitTypeForAddressSecondaryUnitTypeFind(AddressSecondaryUnitTypeObjectFilter data) {
    if (data != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(data, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }
  public void setAddressSecondaryUnitTypeForAddressSecondaryUnitTypeGet(AddressSecondaryUnitTypeObjectKeyData data) {
    if (data != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectKeyHelper.toMap(data, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }
  public void setAddressSecondaryUnitTypeForAddressSecondaryUnitTypeUpdate(AddressSecondaryUnitTypeObjectData data) {
    if (data != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(data, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }
  public AddressSecondaryUnitTypeObjectData getAddressSecondaryUnitTypeObjectDataAddressSecondaryUnitTypeFromAddressSecondaryUnitTypeCreate() {
    return AddressSecondaryUnitTypeObjectHelper.fromMap(outputMap, "AddressSecondaryUnitType");
  }
  public AddressSecondaryUnitTypeObjectDataList getAddressSecondaryUnitTypeObjectDataAddressSecondaryUnitTypeFromAddressSecondaryUnitTypeFind() {
    return AddressSecondaryUnitTypeObjectHelper.fromMapList(outputMap, "AddressSecondaryUnitTypeList");
  }
  public AddressSecondaryUnitTypeObjectData getAddressSecondaryUnitTypeObjectDataAddressSecondaryUnitTypeFromAddressSecondaryUnitTypeGet() {
    return AddressSecondaryUnitTypeObjectHelper.fromMap(outputMap, "AddressSecondaryUnitType");
  }
  public AddressSecondaryUnitTypeObjectData getAddressSecondaryUnitTypeObjectDataAddressSecondaryUnitTypeFromAddressSecondaryUnitTypeUpdate() {
    return AddressSecondaryUnitTypeObjectHelper.fromMap(outputMap, "AddressSecondaryUnitType");
  }
  /**
   @deprecated
   */
  public void setAddressSecondaryUnitTypeObjectFilter(AddressSecondaryUnitTypeObjectFilter data) {
    if (data != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(data, new HashMap()).get("AddressSecondaryUnitTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAddressSecondaryUnitTypeObjectData(AddressSecondaryUnitTypeObjectData data) {
    if (data != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(data, new HashMap()).get("AddressSecondaryUnitTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAddressSecondaryUnitTypeObjectKeyData(AddressSecondaryUnitTypeObjectKeyData data) {
    if (data != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectKeyHelper.toMap(data, new HashMap()).get("AddressSecondaryUnitTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public AddressSecondaryUnitTypeObjectDataList getAddressSecondaryUnitTypeObjectDataList() {
    return AddressSecondaryUnitTypeObjectHelper.fromMapList(outputMap, "AddressSecondaryUnitTypeList");
  }
  /**
   @deprecated
   */
  public AddressSecondaryUnitTypeObjectData getAddressSecondaryUnitTypeObjectData() {
    return AddressSecondaryUnitTypeObjectHelper.fromMap(outputMap, "AddressSecondaryUnitType");
  }
}
