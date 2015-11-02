/*
 * Generated code DO NOT EDIT
 * Generated file: IndustryTypeRequest.java
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
public final class IndustryTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public IndustryTypeRequest (String request, IndustryTypeRequestMethod method) {
    initialize(request, "IndustryType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (IndustryTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountInternalIdForIndustryTypeFindByAccount(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setLanguageCodeForIndustryTypeFindByAccount(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setAddressIdForIndustryTypeFindByAddress(Integer data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setLanguageCodeForIndustryTypeFindByAddress(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setIndustryTypeForIndustryTypeFindCount(IndustryTypeObjectFilter data) {
    if (data != null) {
      addInput("IndustryType", IndustryTypeObjectHelper.toMap(data, new HashMap(), "IndustryType").get("IndustryType"));
    }
  }
  public void setIndustryTypeForIndustryTypeFind(IndustryTypeObjectFilter data) {
    if (data != null) {
      addInput("IndustryType", IndustryTypeObjectHelper.toMap(data, new HashMap(), "IndustryType").get("IndustryType"));
    }
  }
  public void setIndustryTypeForIndustryTypeGet(IndustryTypeObjectKeyData data) {
    if (data != null) {
      addInput("IndustryType", IndustryTypeObjectKeyHelper.toMap(data, new HashMap(), "IndustryType").get("IndustryType"));
    }
  }
  public IndustryTypeObjectDataList getIndustryTypeObjectDataIndustryTypeFromIndustryTypeFindByAccount() {
    return IndustryTypeObjectHelper.fromMapList(outputMap, "IndustryTypeList");
  }
  public IndustryTypeObjectDataList getIndustryTypeObjectDataIndustryTypeFromIndustryTypeFindByAddress() {
    return IndustryTypeObjectHelper.fromMapList(outputMap, "IndustryTypeList");
  }
  public Integer getIntegerTotalCountFromIndustryTypeFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public IndustryTypeObjectDataList getIndustryTypeObjectDataIndustryTypeFromIndustryTypeFind() {
    return IndustryTypeObjectHelper.fromMapList(outputMap, "IndustryTypeList");
  }
  public IndustryTypeObjectData getIndustryTypeObjectDataIndustryTypeFromIndustryTypeGet() {
    return IndustryTypeObjectHelper.fromMap(outputMap, "IndustryType");
  }
  /**
   @deprecated
   */
  public void setAccountInternalId(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
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
  public void setIndustryTypeObjectFilter(IndustryTypeObjectFilter data) {
    if (data != null) {
      addInput("IndustryType", IndustryTypeObjectHelper.toMap(data, new HashMap()).get("IndustryTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setIndustryTypeObjectKeyData(IndustryTypeObjectKeyData data) {
    if (data != null) {
      addInput("IndustryType", IndustryTypeObjectKeyHelper.toMap(data, new HashMap()).get("IndustryTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public IndustryTypeObjectDataList getIndustryTypeObjectDataList() {
    return IndustryTypeObjectHelper.fromMapList(outputMap, "IndustryTypeList");
  }
  /**
   @deprecated
   */
  public IndustryTypeObjectData getIndustryTypeObjectData() {
    return IndustryTypeObjectHelper.fromMap(outputMap, "IndustryType");
  }
  /**
   @deprecated
   */
  public void setLanguageCode(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getTotalCount() {
    return (Integer)outputMap.get("TotalCount");
  }
}
