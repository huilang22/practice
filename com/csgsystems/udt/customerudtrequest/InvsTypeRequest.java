/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeRequest.java
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
public final class InvsTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsTypeRequest (String request, InvsTypeRequestMethod method) {
    initialize(request, "InvsType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsTypeForInvsTypeCreate(InvsTypeObjectData data) {
    if (data != null) {
      addInput("InvsType", InvsTypeObjectHelper.toMap(data, new HashMap(), "InvsType").get("InvsType"));
    }
  }
  public void setInvsTypeForInvsTypeFind(InvsTypeObjectFilter data) {
    if (data != null) {
      addInput("InvsType", InvsTypeObjectHelper.toMap(data, new HashMap(), "InvsType").get("InvsType"));
    }
  }
  public void setInvsTypeForInvsTypeGet(InvsTypeObjectKeyData data) {
    if (data != null) {
      addInput("InvsType", InvsTypeObjectKeyHelper.toMap(data, new HashMap(), "InvsType").get("InvsType"));
    }
  }
  public void setBillPeriodForInvsTypeRate(String data) {
    if (data != null) {
      addInput("BillPeriod", data);
    }
  }
  public void setBillingFrequencyForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("BillingFrequency", data);
    }
  }
  public void setComponentIdForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("ComponentId", data);
    }
  }
  public void setCurrencyCodeForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("CurrencyCode", data);
    }
  }
  public void setEffectiveDateForInvsTypeRate(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEquipClassForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("EquipClass", data);
    }
  }
  public void setEquipCosForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("EquipCos", data);
    }
  }
  public void setEquipTypeForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("EquipType", data);
    }
  }
  public void setInventoryTypeIdForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("InventoryTypeId", data);
    }
  }
  public void setJurisdictionForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("Jurisdiction", data);
    }
  }
  public void setPopUnitsForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("PopUnits", data);
    }
  }
  public void setRateClassForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("RateClass", data);
    }
  }
  public void setUnitsForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("Units", data);
    }
  }
  public void setUnitsTypeForInvsTypeRate(Integer data) {
    if (data != null) {
      addInput("UnitsType", data);
    }
  }
  public void setInvsTypeForInvsTypeUpdate(InvsTypeObjectData data) {
    if (data != null) {
      addInput("InvsType", InvsTypeObjectHelper.toMap(data, new HashMap(), "InvsType").get("InvsType"));
    }
  }
  public InvsTypeObjectData getInvsTypeObjectDataInvsTypeFromInvsTypeCreate() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsType");
  }
  public InvsTypeObjectDataList getInvsTypeObjectDataInvsTypeFromInvsTypeFind() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
  public InvsTypeObjectData getInvsTypeObjectDataInvsTypeFromInvsTypeGet() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsType");
  }
  public BigInteger getBigIntegerRateFromInvsTypeRate() {
    return (BigInteger)outputMap.get("Rate");
  }
  public InvsTypeObjectData getInvsTypeObjectDataInvsTypeFromInvsTypeUpdate() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsType");
  }
  /**
   @deprecated
   */
  public void setBillPeriod(String data) {
    if (data != null) {
      addInput("BillPeriod", data);
    }
  }
  /**
   @deprecated
   */
  public void setBillingFrequency(Integer data) {
    if (data != null) {
      addInput("BillingFrequency", data);
    }
  }
  /**
   @deprecated
   */
  public void setComponentId(Integer data) {
    if (data != null) {
      addInput("ComponentId", data);
    }
  }
  /**
   @deprecated
   */
  public void setCurrencyCode(Integer data) {
    if (data != null) {
      addInput("CurrencyCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setEffectiveDate(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setEquipClass(Integer data) {
    if (data != null) {
      addInput("EquipClass", data);
    }
  }
  /**
   @deprecated
   */
  public void setEquipCos(Integer data) {
    if (data != null) {
      addInput("EquipCos", data);
    }
  }
  /**
   @deprecated
   */
  public void setEquipType(Integer data) {
    if (data != null) {
      addInput("EquipType", data);
    }
  }
  /**
   @deprecated
   */
  public void setInventoryTypeId(Integer data) {
    if (data != null) {
      addInput("InventoryTypeId", data);
    }
  }
  /**
   @deprecated
   */
  public void setInvsTypeObjectFilter(InvsTypeObjectFilter data) {
    if (data != null) {
      addInput("InvsType", InvsTypeObjectHelper.toMap(data, new HashMap()).get("InvsTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsTypeObjectData(InvsTypeObjectData data) {
    if (data != null) {
      addInput("InvsType", InvsTypeObjectHelper.toMap(data, new HashMap()).get("InvsTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsTypeObjectKeyData(InvsTypeObjectKeyData data) {
    if (data != null) {
      addInput("InvsType", InvsTypeObjectKeyHelper.toMap(data, new HashMap()).get("InvsTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsTypeObjectDataList getInvsTypeObjectDataList() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
  /**
   @deprecated
   */
  public InvsTypeObjectData getInvsTypeObjectData() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsType");
  }
  /**
   @deprecated
   */
  public void setJurisdiction(Integer data) {
    if (data != null) {
      addInput("Jurisdiction", data);
    }
  }
  /**
   @deprecated
   */
  public void setPopUnits(Integer data) {
    if (data != null) {
      addInput("PopUnits", data);
    }
  }
  /**
   @deprecated
   */
  public BigInteger getRate() {
    return (BigInteger)outputMap.get("Rate");
  }
  /**
   @deprecated
   */
  public void setRateClass(Integer data) {
    if (data != null) {
      addInput("RateClass", data);
    }
  }
  /**
   @deprecated
   */
  public void setUnits(Integer data) {
    if (data != null) {
      addInput("Units", data);
    }
  }
  /**
   @deprecated
   */
  public void setUnitsType(Integer data) {
    if (data != null) {
      addInput("UnitsType", data);
    }
  }
}
