/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementRequest.java
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
public final class ProductElementRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductElementRequest (String request, ProductElementRequestMethod method) {
    initialize(request, "ProductElement", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductElementRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setProductElementForProductElementCreate(ProductElementObjectData data) {
    if (data != null) {
      addInput("ProductElement", ProductElementObjectHelper.toMap(data, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }
  public void setProductElementForProductElementDelete(ProductElementObjectKeyData data) {
    if (data != null) {
      addInput("ProductElement", ProductElementObjectKeyHelper.toMap(data, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }
  public void setAccountInternalIdForProductElementFindByAccount(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setLanguageCodeForProductElementFindByAccount(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setLanguageCodeForProductElementFindByService(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setServiceInternalIdForProductElementFindByService(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForProductElementFindByService(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setProductElementForProductElementFind(ProductElementObjectFilter data) {
    if (data != null) {
      addInput("ProductElement", ProductElementObjectHelper.toMap(data, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }
  public void setProductElementForProductElementGet(ProductElementObjectKeyData data) {
    if (data != null) {
      addInput("ProductElement", ProductElementObjectKeyHelper.toMap(data, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }
  public void setBillPeriodForProductElementRate(String data) {
    if (data != null) {
      addInput("BillPeriod", data);
    }
  }
  public void setBillingFrequencyForProductElementRate(Integer data) {
    if (data != null) {
      addInput("BillingFrequency", data);
    }
  }
  public void setComponentIdForProductElementRate(Integer data) {
    if (data != null) {
      addInput("ComponentId", data);
    }
  }
  public void setCurrencyCodeForProductElementRate(Integer data) {
    if (data != null) {
      addInput("CurrencyCode", data);
    }
  }
  public void setEffectiveDateForProductElementRate(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setElementIdForProductElementRate(Integer data) {
    if (data != null) {
      addInput("ElementId", data);
    }
  }
  public void setEquipClassForProductElementRate(Integer data) {
    if (data != null) {
      addInput("EquipClass", data);
    }
  }
  public void setEquipCosForProductElementRate(Integer data) {
    if (data != null) {
      addInput("EquipCos", data);
    }
  }
  public void setEquipTypeForProductElementRate(Integer data) {
    if (data != null) {
      addInput("EquipType", data);
    }
  }
  public void setExrateClassForProductElementRate(Integer data) {
    if (data != null) {
      addInput("ExrateClass", data);
    }
  }
  public void setJurisdictionForProductElementRate(Integer data) {
    if (data != null) {
      addInput("Jurisdiction", data);
    }
  }
  public void setPopUnitsForProductElementRate(Integer data) {
    if (data != null) {
      addInput("PopUnits", data);
    }
  }
  public void setRateClassForProductElementRate(Integer data) {
    if (data != null) {
      addInput("RateClass", data);
    }
  }
  public void setUnitsForProductElementRate(Integer data) {
    if (data != null) {
      addInput("Units", data);
    }
  }
  public void setUnitsTypeForProductElementRate(Integer data) {
    if (data != null) {
      addInput("UnitsType", data);
    }
  }
  public void setProductElementForProductElementUpdate(ProductElementObjectData data) {
    if (data != null) {
      addInput("ProductElement", ProductElementObjectHelper.toMap(data, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }
  public ProductElementObjectData getProductElementObjectDataProductElementFromProductElementCreate() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElement");
  }
  public ProductElementObjectDataList getProductElementObjectDataProductElementFromProductElementFindByAccount() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
  public ProductElementObjectDataList getProductElementObjectDataProductElementFromProductElementFindByService() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
  public ProductElementObjectDataList getProductElementObjectDataProductElementFromProductElementFind() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
  public ProductElementObjectData getProductElementObjectDataProductElementFromProductElementGet() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElement");
  }
  public ProductElementRateOutputData getProductElementRateOutputDataProductElementRateOutputDataFromProductElementRate() {
    return ProductElementRateOutputHelper.fromMap(outputMap);
  }
  public ProductElementObjectData getProductElementObjectDataProductElementFromProductElementUpdate() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElement");
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
  public void setElementId(Integer data) {
    if (data != null) {
      addInput("ElementId", data);
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
  public void setExrateClass(Integer data) {
    if (data != null) {
      addInput("ExrateClass", data);
    }
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
  public void setLanguageCode(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
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
  public void setProductElementObjectFilter(ProductElementObjectFilter data) {
    if (data != null) {
      addInput("ProductElement", ProductElementObjectHelper.toMap(data, new HashMap()).get("ProductElementObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductElementObjectData(ProductElementObjectData data) {
    if (data != null) {
      addInput("ProductElement", ProductElementObjectHelper.toMap(data, new HashMap()).get("ProductElementObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductElementObjectKeyData(ProductElementObjectKeyData data) {
    if (data != null) {
      addInput("ProductElement", ProductElementObjectKeyHelper.toMap(data, new HashMap()).get("ProductElementObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductElementObjectDataList getProductElementObjectDataList() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
  /**
   @deprecated
   */
  public ProductElementObjectData getProductElementObjectData() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElement");
  }
  /**
   @deprecated
   */
  public ProductElementRateOutputData getProductElementRateOutputData() {
    return ProductElementRateOutputHelper.fromMap(outputMap);
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
  public void setServiceInternalId(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceInternalIdResets(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
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
