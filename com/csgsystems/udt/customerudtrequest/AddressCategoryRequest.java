/*
 * Generated code DO NOT EDIT
 * Generated file: AddressCategoryRequest.java
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
public final class AddressCategoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AddressCategoryRequest (String request, AddressCategoryRequestMethod method) {
    initialize(request, "AddressCategory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AddressCategoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressCategoryForAddressCategoryCreate(AddressCategoryObjectData data) {
    if (data != null) {
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(data, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }
  public void setAddressCategoryForAddressCategoryFind(AddressCategoryObjectFilter data) {
    if (data != null) {
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(data, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }
  public void setAddressCategoryForAddressCategoryGet(AddressCategoryObjectKeyData data) {
    if (data != null) {
      addInput("AddressCategory", AddressCategoryObjectKeyHelper.toMap(data, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }
  public void setAddressCategoryForAddressCategoryUpdate(AddressCategoryObjectData data) {
    if (data != null) {
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(data, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }
  public AddressCategoryObjectData getAddressCategoryObjectDataAddressCategoryFromAddressCategoryCreate() {
    return AddressCategoryObjectHelper.fromMap(outputMap, "AddressCategory");
  }
  public AddressCategoryObjectDataList getAddressCategoryObjectDataAddressCategoryFromAddressCategoryFind() {
    return AddressCategoryObjectHelper.fromMapList(outputMap, "AddressCategoryList");
  }
  public AddressCategoryObjectData getAddressCategoryObjectDataAddressCategoryFromAddressCategoryGet() {
    return AddressCategoryObjectHelper.fromMap(outputMap, "AddressCategory");
  }
  public AddressCategoryObjectData getAddressCategoryObjectDataAddressCategoryFromAddressCategoryUpdate() {
    return AddressCategoryObjectHelper.fromMap(outputMap, "AddressCategory");
  }
  /**
   @deprecated
   */
  public void setAddressCategoryObjectFilter(AddressCategoryObjectFilter data) {
    if (data != null) {
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(data, new HashMap()).get("AddressCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAddressCategoryObjectData(AddressCategoryObjectData data) {
    if (data != null) {
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(data, new HashMap()).get("AddressCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAddressCategoryObjectKeyData(AddressCategoryObjectKeyData data) {
    if (data != null) {
      addInput("AddressCategory", AddressCategoryObjectKeyHelper.toMap(data, new HashMap()).get("AddressCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public AddressCategoryObjectDataList getAddressCategoryObjectDataList() {
    return AddressCategoryObjectHelper.fromMapList(outputMap, "AddressCategoryList");
  }
  /**
   @deprecated
   */
  public AddressCategoryObjectData getAddressCategoryObjectData() {
    return AddressCategoryObjectHelper.fromMap(outputMap, "AddressCategory");
  }
}
