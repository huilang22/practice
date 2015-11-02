/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalDefaultRequest.java
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
public final class BsdRelationalDefaultRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdRelationalDefaultRequest (String request, BsdRelationalDefaultRequestMethod method) {
    initialize(request, "BsdRelationalDefault", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdRelationalDefaultRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActionNameForBsdRelationalDefaultActionFind(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  public void setApplicationNameForBsdRelationalDefaultActionFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdRelationalDefaultActionFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setEffectiveDateForBsdRelationalDefaultActionFind(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setSourceObjectNameForBsdRelationalDefaultActionFind(String data) {
    if (data != null) {
      addInput("SourceObjectName", data);
    }
  }
  public void setTargetObjectNameForBsdRelationalDefaultActionFind(String data) {
    if (data != null) {
      addInput("TargetObjectName", data);
    }
  }
  public void setBsdRelationalDefaultForBsdRelationalDefaultCreate(BsdRelationalDefaultObjectBaseData data) {
    if (data != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseHelper.toMap(data, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }
  public void setBsdRelationalDefaultForBsdRelationalDefaultDelete(BsdRelationalDefaultObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }
  public void setBsdRelationalDefaultForBsdRelationalDefaultFind(BsdRelationalDefaultObjectFilter data) {
    if (data != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectHelper.toMap(data, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }
  public void setBsdRelationalDefaultForBsdRelationalDefaultGet(BsdRelationalDefaultObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }
  public void setBsdRelationalDefaultForBsdRelationalDefaultUpdate(BsdRelationalDefaultObjectBaseData data) {
    if (data != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseHelper.toMap(data, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }
  public BsdRelationalDefaultObjectDataList getBsdRelationalDefaultObjectDataBsdRelationalDefaultFromBsdRelationalDefaultActionFind() {
    return BsdRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdRelationalDefaultList");
  }
  public BsdRelationalDefaultObjectBaseData getBsdRelationalDefaultObjectBaseDataBsdRelationalDefaultFromBsdRelationalDefaultCreate() {
    return BsdRelationalDefaultObjectBaseHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
  public BsdRelationalDefaultObjectBaseData getBsdRelationalDefaultObjectBaseDataBsdRelationalDefaultFromBsdRelationalDefaultDelete() {
    return BsdRelationalDefaultObjectBaseHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
  public BsdRelationalDefaultObjectDataList getBsdRelationalDefaultObjectDataBsdRelationalDefaultFromBsdRelationalDefaultFind() {
    return BsdRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdRelationalDefaultList");
  }
  public BsdRelationalDefaultObjectData getBsdRelationalDefaultObjectDataBsdRelationalDefaultFromBsdRelationalDefaultGet() {
    return BsdRelationalDefaultObjectHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
  public BsdRelationalDefaultObjectBaseKeyData getBsdRelationalDefaultObjectBaseKeyDataBsdRelationalDefaultFromBsdRelationalDefaultSequenceGet() {
    return BsdRelationalDefaultObjectBaseKeyHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
  public BsdRelationalDefaultObjectBaseData getBsdRelationalDefaultObjectBaseDataBsdRelationalDefaultFromBsdRelationalDefaultUpdate() {
    return BsdRelationalDefaultObjectBaseHelper.fromMap(outputMap, "BsdRelationalDefault");
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
  public void setBsdRelationalDefaultObjectFilter(BsdRelationalDefaultObjectFilter data) {
    if (data != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectHelper.toMap(data, new HashMap()).get("BsdRelationalDefaultObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdRelationalDefaultObjectDataList getBsdRelationalDefaultObjectDataList() {
    return BsdRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdRelationalDefaultList");
  }
  /**
   @deprecated
   */
  public BsdRelationalDefaultObjectData getBsdRelationalDefaultObjectData() {
    return BsdRelationalDefaultObjectHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
  /**
   @deprecated
   */
  public void setBsdRelationalDefaultObjectBaseData(BsdRelationalDefaultObjectBaseData data) {
    if (data != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseHelper.toMap(data, new HashMap()).get("BsdRelationalDefaultObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdRelationalDefaultObjectBaseKeyData(BsdRelationalDefaultObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseKeyHelper.toMap(data, new HashMap()).get("BsdRelationalDefaultObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public BsdRelationalDefaultObjectBaseKeyData getBsdRelationalDefaultObjectBaseKeyData() {
    return BsdRelationalDefaultObjectBaseKeyHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
  /**
   @deprecated
   */
  public BsdRelationalDefaultObjectBaseData getBsdRelationalDefaultObjectBaseData() {
    return BsdRelationalDefaultObjectBaseHelper.fromMap(outputMap, "BsdRelationalDefault");
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
