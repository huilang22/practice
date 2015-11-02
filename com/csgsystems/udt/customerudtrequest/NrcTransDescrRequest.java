/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTransDescrRequest.java
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
public final class NrcTransDescrRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NrcTransDescrRequest (String request, NrcTransDescrRequestMethod method) {
    initialize(request, "NrcTransDescr", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NrcTransDescrRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNrcTransDescrForNrcTransDescrCreate(NrcTransDescrObjectData data) {
    if (data != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(data, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }
  public void setAccountInternalIdForNrcTransDescrFindByAccount(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setLanguageCodeForNrcTransDescrFindByAccount(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setLanguageCodeForNrcTransDescrFindByService(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setServiceInternalIdForNrcTransDescrFindByService(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForNrcTransDescrFindByService(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setNrcTransDescrForNrcTransDescrFind(NrcTransDescrObjectFilter data) {
    if (data != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(data, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }
  public void setNrcTransDescrForNrcTransDescrGet(NrcTransDescrObjectKeyData data) {
    if (data != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectKeyHelper.toMap(data, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }
  public void setClassOfServiceCodeForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("ClassOfServiceCode", data);
    }
  }
  public void setComponentIdForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("ComponentId", data);
    }
  }
  public void setCurrencyCodeForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("CurrencyCode", data);
    }
  }
  public void setEffectiveDateForNrcTransDescrQuote(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setElementIdForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("ElementId", data);
    }
  }
  public void setEquipClassCodeForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("EquipClassCode", data);
    }
  }
  public void setEquipTypeCodeForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("EquipTypeCode", data);
    }
  }
  public void setGeoAreaIdForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("GeoAreaId", data);
    }
  }
  public void setIsUnitTypeForNrcTransDescrQuote(Boolean data) {
    if (data != null) {
      addInput("IsUnitType", data);
    }
  }
  public void setPopUnitsForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("PopUnits", data);
    }
  }
  public void setRateClassForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("RateClass", data);
    }
  }
  public void setTypeIdNrcForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("TypeIdNrc", data);
    }
  }
  public void setUnitsForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("Units", data);
    }
  }
  public void setUnitsTypeForNrcTransDescrQuote(Integer data) {
    if (data != null) {
      addInput("UnitsType", data);
    }
  }
  public void setNrcTransDescrForNrcTransDescrUpdate(NrcTransDescrObjectData data) {
    if (data != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(data, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }
  public NrcTransDescrObjectData getNrcTransDescrObjectDataNrcTransDescrFromNrcTransDescrCreate() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescr");
  }
  public NrcTransDescrObjectDataList getNrcTransDescrObjectDataNrcTransDescrFromNrcTransDescrFindByAccount() {
    return NrcTransDescrObjectHelper.fromMapList(outputMap, "NrcTransDescrList");
  }
  public NrcTransDescrObjectDataList getNrcTransDescrObjectDataNrcTransDescrFromNrcTransDescrFindByService() {
    return NrcTransDescrObjectHelper.fromMapList(outputMap, "NrcTransDescrList");
  }
  public NrcTransDescrObjectDataList getNrcTransDescrObjectDataNrcTransDescrFromNrcTransDescrFind() {
    return NrcTransDescrObjectHelper.fromMapList(outputMap, "NrcTransDescrList");
  }
  public NrcTransDescrObjectData getNrcTransDescrObjectDataNrcTransDescrFromNrcTransDescrGet() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescr");
  }
  public NrcTransDescrQuoteOutputData getNrcTransDescrQuoteOutputDataNrcTransDescrQuoteOutputDataFromNrcTransDescrQuote() {
    return NrcTransDescrQuoteOutputHelper.fromMap(outputMap);
  }
  public NrcTransDescrObjectData getNrcTransDescrObjectDataNrcTransDescrFromNrcTransDescrUpdate() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescr");
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
  public void setClassOfServiceCode(Integer data) {
    if (data != null) {
      addInput("ClassOfServiceCode", data);
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
  public void setEquipClassCode(Integer data) {
    if (data != null) {
      addInput("EquipClassCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setEquipTypeCode(Integer data) {
    if (data != null) {
      addInput("EquipTypeCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaId(Integer data) {
    if (data != null) {
      addInput("GeoAreaId", data);
    }
  }
  /**
   @deprecated
   */
  public void setIsUnitType(Boolean data) {
    if (data != null) {
      addInput("IsUnitType", data);
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
  public void setNrcTransDescrObjectFilter(NrcTransDescrObjectFilter data) {
    if (data != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(data, new HashMap()).get("NrcTransDescrObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNrcTransDescrObjectData(NrcTransDescrObjectData data) {
    if (data != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(data, new HashMap()).get("NrcTransDescrObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNrcTransDescrObjectKeyData(NrcTransDescrObjectKeyData data) {
    if (data != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectKeyHelper.toMap(data, new HashMap()).get("NrcTransDescrObject"));
    }
  }
  /**
   @deprecated
   */
  public NrcTransDescrObjectDataList getNrcTransDescrObjectDataList() {
    return NrcTransDescrObjectHelper.fromMapList(outputMap, "NrcTransDescrList");
  }
  /**
   @deprecated
   */
  public NrcTransDescrObjectData getNrcTransDescrObjectData() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescr");
  }
  /**
   @deprecated
   */
  public NrcTransDescrQuoteOutputData getNrcTransDescrQuoteOutputData() {
    return NrcTransDescrQuoteOutputHelper.fromMap(outputMap);
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
  public void setTypeIdNrc(Integer data) {
    if (data != null) {
      addInput("TypeIdNrc", data);
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
