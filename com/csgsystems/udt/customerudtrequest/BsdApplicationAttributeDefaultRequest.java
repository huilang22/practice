/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationAttributeDefaultRequest.java
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

import com.csgsystems.utl.data.*;
public final class BsdApplicationAttributeDefaultRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdApplicationAttributeDefaultRequest (String request, BsdApplicationAttributeDefaultRequestMethod method) {
    initialize(request, "BsdApplicationAttributeDefault", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdApplicationAttributeDefaultRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActionNameForBsdApplicationAttributeDefaultActionFind(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  public void setApplicationNameForBsdApplicationAttributeDefaultActionFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdApplicationAttributeDefaultActionFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setEffectiveDateForBsdApplicationAttributeDefaultActionFind(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setLanguageCodeForBsdApplicationAttributeDefaultActionFind(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setObjectNameForBsdApplicationAttributeDefaultActionFind(String data) {
    if (data != null) {
      addInput("ObjectName", data);
    }
  }
  public void setApplicationNameForBsdApplicationAttributeDefaultFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdApplicationAttributeDefaultFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setLanguageCodeForBsdApplicationAttributeDefaultFind(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setBsdApplicationAttributeDefaultForBsdApplicationAttributeDefaultGet(BsdApplicationAttributeDefaultObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationAttributeDefault", BsdApplicationAttributeDefaultObjectKeyHelper.toMap(data, new HashMap(), "BsdApplicationAttributeDefault").get("BsdApplicationAttributeDefault"));
    }
  }
  public BsdApplicationAttributeDefaultObjectDataList getBsdApplicationAttributeDefaultObjectDataBsdApplicationAttributeDefaultFromBsdApplicationAttributeDefaultActionFind() {
    return BsdApplicationAttributeDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeDefaultList");
  }
  public BsdApplicationAttributeDefaultObjectDataList getBsdApplicationAttributeDefaultObjectDataBsdApplicationAttributeDefaultFromBsdApplicationAttributeDefaultFind() {
    return BsdApplicationAttributeDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeDefaultList");
  }
  public BsdApplicationAttributeDefaultObjectData getBsdApplicationAttributeDefaultObjectDataBsdApplicationAttributeDefaultFromBsdApplicationAttributeDefaultGet() {
    return BsdApplicationAttributeDefaultObjectHelper.fromMap(outputMap, "BsdApplicationAttributeDefault");
  }
  /**
   @deprecated
   */
  public void setActionName(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  /**
   @deprecated
   */
  public void setApplicationName(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  /**
   @deprecated
   */
  public void setBsdApplicationAttributeDefaultObjectKeyData(BsdApplicationAttributeDefaultObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationAttributeDefault", BsdApplicationAttributeDefaultObjectKeyHelper.toMap(data, new HashMap()).get("BsdApplicationAttributeDefaultObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdApplicationAttributeDefaultObjectDataList getBsdApplicationAttributeDefaultObjectDataList() {
    return BsdApplicationAttributeDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeDefaultList");
  }
  /**
   @deprecated
   */
  public BsdApplicationAttributeDefaultObjectData getBsdApplicationAttributeDefaultObjectData() {
    return BsdApplicationAttributeDefaultObjectHelper.fromMap(outputMap, "BsdApplicationAttributeDefault");
  }
  /**
   @deprecated
   */
  public void setBusinessUnitName(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
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
  public void setLanguageCode(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setObjectName(String data) {
    if (data != null) {
      addInput("ObjectName", data);
    }
  }
}
