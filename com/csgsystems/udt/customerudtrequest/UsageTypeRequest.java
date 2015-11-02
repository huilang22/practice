/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeRequest.java
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
public final class UsageTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsageTypeRequest (String request, UsageTypeRequestMethod method) {
    initialize(request, "UsageType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsageTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillRefNoForUsageTypeBilledFindByInvoice(Integer data) {
    if (data != null) {
      addInput("BillRefNo", data);
    }
  }
  public void setBillRefResetsForUsageTypeBilledFindByInvoice(Integer data) {
    if (data != null) {
      addInput("BillRefResets", data);
    }
  }
  public void setLanguageCodeForUsageTypeBilledFindByInvoice(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setUsageTypeForUsageTypeCreate(UsageTypeObjectData data) {
    if (data != null) {
      addInput("UsageType", UsageTypeObjectHelper.toMap(data, new HashMap(), "UsageType").get("UsageType"));
    }
  }
  public void setUsageTypeForUsageTypeDelete(UsageTypeObjectKeyData data) {
    if (data != null) {
      addInput("UsageType", UsageTypeObjectKeyHelper.toMap(data, new HashMap(), "UsageType").get("UsageType"));
    }
  }
  public void setUsageTypeForUsageTypeFind(UsageTypeObjectFilter data) {
    if (data != null) {
      addInput("UsageType", UsageTypeObjectHelper.toMap(data, new HashMap(), "UsageType").get("UsageType"));
    }
  }
  public void setUsageTypeForUsageTypeGet(UsageTypeObjectKeyData data) {
    if (data != null) {
      addInput("UsageType", UsageTypeObjectKeyHelper.toMap(data, new HashMap(), "UsageType").get("UsageType"));
    }
  }
  public void setAccountInternalIdForUsageTypeUnbilledFindByAccount(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setLanguageCodeForUsageTypeUnbilledFindByAccount(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setUsageTypeForUsageTypeUpdate(UsageTypeObjectData data) {
    if (data != null) {
      addInput("UsageType", UsageTypeObjectHelper.toMap(data, new HashMap(), "UsageType").get("UsageType"));
    }
  }
  public UsageTypeObjectDataList getUsageTypeObjectDataUsageTypeFromUsageTypeBilledFindByInvoice() {
    return UsageTypeObjectHelper.fromMapList(outputMap, "UsageTypeList");
  }
  public UsageTypeObjectData getUsageTypeObjectDataUsageTypeFromUsageTypeCreate() {
    return UsageTypeObjectHelper.fromMap(outputMap, "UsageType");
  }
  public UsageTypeObjectData getUsageTypeObjectDataUsageTypeFromUsageTypeDelete() {
    return UsageTypeObjectHelper.fromMap(outputMap, "UsageType");
  }
  public UsageTypeObjectDataList getUsageTypeObjectDataUsageTypeFromUsageTypeFind() {
    return UsageTypeObjectHelper.fromMapList(outputMap, "UsageTypeList");
  }
  public UsageTypeObjectData getUsageTypeObjectDataUsageTypeFromUsageTypeGet() {
    return UsageTypeObjectHelper.fromMap(outputMap, "UsageType");
  }
  public UsageTypeObjectDataList getUsageTypeObjectDataUsageTypeFromUsageTypeUnbilledFindByAccount() {
    return UsageTypeObjectHelper.fromMapList(outputMap, "UsageTypeList");
  }
  public UsageTypeObjectData getUsageTypeObjectDataUsageTypeFromUsageTypeUpdate() {
    return UsageTypeObjectHelper.fromMap(outputMap, "UsageType");
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
  public void setBillRefNo(Integer data) {
    if (data != null) {
      addInput("BillRefNo", data);
    }
  }
  /**
   @deprecated
   */
  public void setBillRefResets(Integer data) {
    if (data != null) {
      addInput("BillRefResets", data);
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
  /**
   @deprecated
   */
  public void setUsageTypeObjectFilter(UsageTypeObjectFilter data) {
    if (data != null) {
      addInput("UsageType", UsageTypeObjectHelper.toMap(data, new HashMap()).get("UsageTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageTypeObjectData(UsageTypeObjectData data) {
    if (data != null) {
      addInput("UsageType", UsageTypeObjectHelper.toMap(data, new HashMap()).get("UsageTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageTypeObjectKeyData(UsageTypeObjectKeyData data) {
    if (data != null) {
      addInput("UsageType", UsageTypeObjectKeyHelper.toMap(data, new HashMap()).get("UsageTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public UsageTypeObjectDataList getUsageTypeObjectDataList() {
    return UsageTypeObjectHelper.fromMapList(outputMap, "UsageTypeList");
  }
  /**
   @deprecated
   */
  public UsageTypeObjectData getUsageTypeObjectData() {
    return UsageTypeObjectHelper.fromMap(outputMap, "UsageType");
  }
}
