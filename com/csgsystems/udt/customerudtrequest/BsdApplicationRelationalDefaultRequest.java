/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRelationalDefaultRequest.java
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
public final class BsdApplicationRelationalDefaultRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdApplicationRelationalDefaultRequest (String request, BsdApplicationRelationalDefaultRequestMethod method) {
    initialize(request, "BsdApplicationRelationalDefault", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdApplicationRelationalDefaultRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActionNameForBsdApplicationRelationalDefaultActionFind(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  public void setApplicationNameForBsdApplicationRelationalDefaultActionFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdApplicationRelationalDefaultActionFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setEffectiveDateForBsdApplicationRelationalDefaultActionFind(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setLanguageCodeForBsdApplicationRelationalDefaultActionFind(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setSourceObjectNameForBsdApplicationRelationalDefaultActionFind(String data) {
    if (data != null) {
      addInput("SourceObjectName", data);
    }
  }
  public void setTargetObjectNameForBsdApplicationRelationalDefaultActionFind(String data) {
    if (data != null) {
      addInput("TargetObjectName", data);
    }
  }
  public void setApplicationNameForBsdApplicationRelationalDefaultFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdApplicationRelationalDefaultFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setLanguageCodeForBsdApplicationRelationalDefaultFind(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setBsdApplicationRelationalDefaultForBsdApplicationRelationalDefaultGet(BsdApplicationRelationalDefaultObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationRelationalDefault", BsdApplicationRelationalDefaultObjectKeyHelper.toMap(data, new HashMap(), "BsdApplicationRelationalDefault").get("BsdApplicationRelationalDefault"));
    }
  }
  public BsdApplicationRelationalDefaultObjectDataList getBsdApplicationRelationalDefaultObjectDataBsdApplicationRelationalDefaultFromBsdApplicationRelationalDefaultActionFind() {
    return BsdApplicationRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalDefaultList");
  }
  public BsdApplicationRelationalDefaultObjectDataList getBsdApplicationRelationalDefaultObjectDataBsdApplicationRelationalDefaultFromBsdApplicationRelationalDefaultFind() {
    return BsdApplicationRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalDefaultList");
  }
  public BsdApplicationRelationalDefaultObjectData getBsdApplicationRelationalDefaultObjectDataBsdApplicationRelationalDefaultFromBsdApplicationRelationalDefaultGet() {
    return BsdApplicationRelationalDefaultObjectHelper.fromMap(outputMap, "BsdApplicationRelationalDefault");
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
  public void setBsdApplicationRelationalDefaultObjectKeyData(BsdApplicationRelationalDefaultObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationRelationalDefault", BsdApplicationRelationalDefaultObjectKeyHelper.toMap(data, new HashMap()).get("BsdApplicationRelationalDefaultObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdApplicationRelationalDefaultObjectDataList getBsdApplicationRelationalDefaultObjectDataList() {
    return BsdApplicationRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalDefaultList");
  }
  /**
   @deprecated
   */
  public BsdApplicationRelationalDefaultObjectData getBsdApplicationRelationalDefaultObjectData() {
    return BsdApplicationRelationalDefaultObjectHelper.fromMap(outputMap, "BsdApplicationRelationalDefault");
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
  public void setSourceObjectName(String data) {
    if (data != null) {
      addInput("SourceObjectName", data);
    }
  }
  /**
   @deprecated
   */
  public void setTargetObjectName(String data) {
    if (data != null) {
      addInput("TargetObjectName", data);
    }
  }
}
