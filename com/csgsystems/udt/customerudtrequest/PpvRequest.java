/*
 * Generated code DO NOT EDIT
 * Generated file: PpvRequest.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;
public final class PpvRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PpvRequest (String request, PpvRequestMethod method) {
    initialize(request, "Ppv", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PpvRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdForCtcScheduleFindEligible(Integer[] data) {
    if (data != null) {
      addInput("AddressIdList", data);
    }
  }
  public void setCtcScheduleForCtcScheduleFindEligible(CtcScheduleObjectFilter data) {
    if (data != null) {
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(data, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }
  public void setEffectiveDateForCtcScheduleFindEligible(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForCtcScheduleFindEligible(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setPpvServiceForCtcScheduleFindEligible(PpvServiceObjectData data) {
    if (data != null) {
      addInput("PpvService", PpvServiceObjectHelper.toMap(data, new HashMap(), "PpvService").get("PpvService"));
    }
  }
  public void setAccountInForPpvAccountQdeCheck(PpvAccountObjectData data) {
    if (data != null) {
      addInput("AccountIn", PpvAccountObjectHelper.toMap(data, new HashMap(), "AccountIn").get("AccountIn"));
    }
  }
  public void setAccountInForPpvOfferValidate(PpvAccountObjectData data) {
    if (data != null) {
      addInput("AccountIn", PpvAccountObjectHelper.toMap(data, new HashMap(), "AccountIn").get("AccountIn"));
    }
  }
  public void setCurrencyCodeForPpvOfferValidate(Integer data) {
    if (data != null) {
      addInput("CurrencyCode", data);
    }
  }
  public void setIgnoreOrderMethodForPpvOfferValidate(Boolean data) {
    if (data != null) {
      addInput("IgnoreOrderMethod", data);
    }
  }
  public void setIgnoreOrderWindowForPpvOfferValidate(Boolean data) {
    if (data != null) {
      addInput("IgnoreOrderWindow", data);
    }
  }
  public void setOfferForPpvOfferValidate(CtcOfferObjectData data) {
    if (data != null) {
      addInput("Offer", CtcOfferObjectHelper.toMap(data, new HashMap(), "Offer").get("Offer"));
    }
  }
  public void setOrderMethodForPpvOfferValidate(CtcOrderMethodObjectData data) {
    if (data != null) {
      addInput("OrderMethod", CtcOrderMethodObjectHelper.toMap(data, new HashMap(), "OrderMethod").get("OrderMethod"));
    }
  }
  public void setQuickOrderCodeForPpvOfferValidate(String data) {
    if (data != null) {
      addInput("QuickOrderCode", data);
    }
  }
  public void setAccountInForPpvOrderItemAssemble(PpvAccountObjectData data) {
    if (data != null) {
      addInput("AccountIn", PpvAccountObjectHelper.toMap(data, new HashMap(), "AccountIn").get("AccountIn"));
    }
  }
  public void setCurrencyCodeForPpvOrderItemAssemble(Integer data) {
    if (data != null) {
      addInput("CurrencyCode", data);
    }
  }
  public void setIgnoreOrderMethodForPpvOrderItemAssemble(Boolean data) {
    if (data != null) {
      addInput("IgnoreOrderMethod", data);
    }
  }
  public void setIgnoreOrderWindowForPpvOrderItemAssemble(Boolean data) {
    if (data != null) {
      addInput("IgnoreOrderWindow", data);
    }
  }
  public void setOfferForPpvOrderItemAssemble(CtcOfferObjectData data) {
    if (data != null) {
      addInput("Offer", CtcOfferObjectHelper.toMap(data, new HashMap(), "Offer").get("Offer"));
    }
  }
  public void setOrderMethodForPpvOrderItemAssemble(CtcOrderMethodObjectData data) {
    if (data != null) {
      addInput("OrderMethod", CtcOrderMethodObjectHelper.toMap(data, new HashMap(), "OrderMethod").get("OrderMethod"));
    }
  }
  public void setQuickOrderCodeForPpvOrderItemAssemble(String data) {
    if (data != null) {
      addInput("QuickOrderCode", data);
    }
  }
  public void setAccountInForPpvOutletFindByAccount(PpvAccountObjectData data) {
    if (data != null) {
      addInput("AccountIn", PpvAccountObjectHelper.toMap(data, new HashMap(), "AccountIn").get("AccountIn"));
    }
  }
  public void setAccountInForPpvOutletFindByService(PpvAccountObjectData data) {
    if (data != null) {
      addInput("AccountIn", PpvAccountObjectHelper.toMap(data, new HashMap(), "AccountIn").get("AccountIn"));
    }
  }
  public CtcScheduleObjectDataList getCtcScheduleObjectDataCtcScheduleFromCtcScheduleFindEligible() {
    return CtcScheduleObjectHelper.fromMapList(outputMap, "CtcScheduleList");
  }
  public PpvAccountObjectData getPpvAccountObjectDataAccountOutFromPpvAccountQdeCheck() {
    return PpvAccountObjectHelper.fromMap(outputMap, "AccountOut");
  }
  public PpvAccountObjectData getPpvAccountObjectDataAccountOutFromPpvOfferValidate() {
    return PpvAccountObjectHelper.fromMap(outputMap, "AccountOut");
  }
  public PpvAccountObjectData getPpvAccountObjectDataAccountOutFromPpvOrderItemAssemble() {
    return PpvAccountObjectHelper.fromMap(outputMap, "AccountOut");
  }
  public PpvAccountObjectData getPpvAccountObjectDataAccountOutFromPpvOutletFindByAccount() {
    return PpvAccountObjectHelper.fromMap(outputMap, "AccountOut");
  }
  public PpvAccountObjectData getPpvAccountObjectDataAccountOutFromPpvOutletFindByService() {
    return PpvAccountObjectHelper.fromMap(outputMap, "AccountOut");
  }
  public PpvReferenceDataGetOutputData getPpvReferenceDataGetOutputDataPpvReferenceDataGetOutputDataFromPpvReferenceDataGet() {
    return PpvReferenceDataGetOutputHelper.fromMap(outputMap);
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
  public void setCtcOfferObjectData(CtcOfferObjectData data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(data, new HashMap()).get("CtcOfferObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOrderMethodObjectData(CtcOrderMethodObjectData data) {
    if (data != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(data, new HashMap()).get("CtcOrderMethodObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcScheduleObjectFilter(CtcScheduleObjectFilter data) {
    if (data != null) {
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(data, new HashMap()).get("CtcScheduleObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcScheduleObjectDataList getCtcScheduleObjectDataList() {
    return CtcScheduleObjectHelper.fromMapList(outputMap, "CtcScheduleList");
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
  public void setEntityObjectDataArray(EntityObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = EntityObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
    }
  }
  /**
   @deprecated
   */
  public void setIgnoreOrderMethod(Boolean data) {
    if (data != null) {
      addInput("IgnoreOrderMethod", data);
    }
  }
  /**
   @deprecated
   */
  public void setIgnoreOrderWindow(Boolean data) {
    if (data != null) {
      addInput("IgnoreOrderWindow", data);
    }
  }
  /**
   @deprecated
   */
  public void setPpvAccountObjectData(PpvAccountObjectData data) {
    if (data != null) {
      addInput("PpvAccount", PpvAccountObjectHelper.toMap(data, new HashMap()).get("PpvAccountObject"));
    }
  }
  /**
   @deprecated
   */
  public PpvAccountObjectData getPpvAccountObjectData() {
    return PpvAccountObjectHelper.fromMap(outputMap, "PpvAccount");
  }
  /**
   @deprecated
   */
  public PpvReferenceDataGetOutputData getPpvReferenceDataGetOutputData() {
    return PpvReferenceDataGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setPpvServiceObjectDataArray(PpvServiceObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = PpvServiceObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Ppv");
      }
      addInput("PpvList", list);
    }
  }
  /**
   @deprecated
   */
  public void setQuickOrderCode(String data) {
    if (data != null) {
      addInput("QuickOrderCode", data);
    }
  }
}
