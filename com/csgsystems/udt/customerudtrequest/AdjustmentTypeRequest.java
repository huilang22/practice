/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTypeRequest.java
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
public final class AdjustmentTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AdjustmentTypeRequest (String request, AdjustmentTypeRequestMethod method) {
    initialize(request, "AdjustmentType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AdjustmentTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAdjTransGroupForAdjustmentTypeByGroupFind(Integer data) {
    if (data != null) {
      addInput("AdjTransGroup", data);
    }
  }
  public void setLanguageCodeForAdjustmentTypeByGroupFind(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setBalanceLineItemForAdjustmentTypeEligibleFind(BalanceLineItemObjectData data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(data, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
  public void setBilledUsageForAdjustmentTypeEligibleFind(BilledUsageObjectData data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setInvoiceForAdjustmentTypeEligibleFind(InvoiceObjectData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setInvoiceDetailForAdjustmentTypeEligibleFind(InvoiceDetailObjectData data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(data, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
  public void setLanguageCodeForAdjustmentTypeEligibleFind(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setTransSignForAdjustmentTypeEligibleFind(Integer data) {
    if (data != null) {
      addInput("TransSign", data);
    }
  }
  public void setUnbilledUsageForAdjustmentTypeEligibleFind(UnbilledUsageObjectData data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setAdjustmentTypeForAdjustmentTypeFind(AdjustmentTypeObjectFilter data) {
    if (data != null) {
      addInput("AdjustmentType", AdjustmentTypeObjectHelper.toMap(data, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
  }
  public void setAdjustmentTypeForAdjustmentTypeGet(AdjustmentTypeObjectKeyData data) {
    if (data != null) {
      addInput("AdjustmentType", AdjustmentTypeObjectKeyHelper.toMap(data, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
  }
  public AdjustmentTypeObjectDataList getAdjustmentTypeObjectDataAdjustmentTypeFromAdjustmentTypeByGroupFind() {
    return AdjustmentTypeObjectHelper.fromMapList(outputMap, "AdjustmentTypeList");
  }
  public AdjustmentTypeObjectDataList getAdjustmentTypeObjectDataAdjustmentTypeFromAdjustmentTypeEligibleFind() {
    return AdjustmentTypeObjectHelper.fromMapList(outputMap, "AdjustmentTypeList");
  }
  public AdjustmentTypeObjectDataList getAdjustmentTypeObjectDataAdjustmentTypeFromAdjustmentTypeFind() {
    return AdjustmentTypeObjectHelper.fromMapList(outputMap, "AdjustmentTypeList");
  }
  public AdjustmentTypeObjectData getAdjustmentTypeObjectDataAdjustmentTypeFromAdjustmentTypeGet() {
    return AdjustmentTypeObjectHelper.fromMap(outputMap, "AdjustmentType");
  }
  /**
   @deprecated
   */
  public void setAdjTransGroup(Integer data) {
    if (data != null) {
      addInput("AdjTransGroup", data);
    }
  }
  /**
   @deprecated
   */
  public void setAdjustmentTypeObjectFilter(AdjustmentTypeObjectFilter data) {
    if (data != null) {
      addInput("AdjustmentType", AdjustmentTypeObjectHelper.toMap(data, new HashMap()).get("AdjustmentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAdjustmentTypeObjectKeyData(AdjustmentTypeObjectKeyData data) {
    if (data != null) {
      addInput("AdjustmentType", AdjustmentTypeObjectKeyHelper.toMap(data, new HashMap()).get("AdjustmentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public AdjustmentTypeObjectDataList getAdjustmentTypeObjectDataList() {
    return AdjustmentTypeObjectHelper.fromMapList(outputMap, "AdjustmentTypeList");
  }
  /**
   @deprecated
   */
  public AdjustmentTypeObjectData getAdjustmentTypeObjectData() {
    return AdjustmentTypeObjectHelper.fromMap(outputMap, "AdjustmentType");
  }
  /**
   @deprecated
   */
  public void setBalanceLineItemObjectData(BalanceLineItemObjectData data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(data, new HashMap()).get("BalanceLineItemObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBilledUsageObjectData(BilledUsageObjectData data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap()).get("BilledUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvoiceDetailObjectData(InvoiceDetailObjectData data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(data, new HashMap()).get("InvoiceDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvoiceObjectData(InvoiceObjectData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(data, new HashMap()).get("InvoiceObject"));
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
  public void setTransSign(Integer data) {
    if (data != null) {
      addInput("TransSign", data);
    }
  }
  /**
   @deprecated
   */
  public void setUnbilledUsageObjectData(UnbilledUsageObjectData data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap()).get("UnbilledUsageObject"));
    }
  }
}
