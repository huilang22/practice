/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeDefaultRequest.java
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
public final class BsdAttributeDefaultRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdAttributeDefaultRequest (String request, BsdAttributeDefaultRequestMethod method) {
    initialize(request, "BsdAttributeDefault", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdAttributeDefaultRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActionNameForBsdAttributeDefaultActionFind(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  public void setApplicationNameForBsdAttributeDefaultActionFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdAttributeDefaultActionFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setEffectiveDateForBsdAttributeDefaultActionFind(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setObjectNameForBsdAttributeDefaultActionFind(String data) {
    if (data != null) {
      addInput("ObjectName", data);
    }
  }
  public void setBsdAttributeDefaultForBsdAttributeDefaultCreate(BsdAttributeDefaultObjectBaseData data) {
    if (data != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseHelper.toMap(data, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }
  public void setBsdAttributeDefaultForBsdAttributeDefaultDelete(BsdAttributeDefaultObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }
  public void setBsdAttributeDefaultForBsdAttributeDefaultFind(BsdAttributeDefaultObjectFilter data) {
    if (data != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectHelper.toMap(data, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }
  public void setBsdAttributeDefaultForBsdAttributeDefaultGet(BsdAttributeDefaultObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }
  public void setBsdAttributeDefaultForBsdAttributeDefaultUpdate(BsdAttributeDefaultObjectBaseData data) {
    if (data != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseHelper.toMap(data, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }
  public BsdAttributeDefaultObjectDataList getBsdAttributeDefaultObjectDataBsdAttributeDefaultFromBsdAttributeDefaultActionFind() {
    return BsdAttributeDefaultObjectHelper.fromMapList(outputMap, "BsdAttributeDefaultList");
  }
  public BsdAttributeDefaultObjectBaseData getBsdAttributeDefaultObjectBaseDataBsdAttributeDefaultFromBsdAttributeDefaultCreate() {
    return BsdAttributeDefaultObjectBaseHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
  public BsdAttributeDefaultObjectBaseData getBsdAttributeDefaultObjectBaseDataBsdAttributeDefaultFromBsdAttributeDefaultDelete() {
    return BsdAttributeDefaultObjectBaseHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
  public BsdAttributeDefaultObjectDataList getBsdAttributeDefaultObjectDataBsdAttributeDefaultFromBsdAttributeDefaultFind() {
    return BsdAttributeDefaultObjectHelper.fromMapList(outputMap, "BsdAttributeDefaultList");
  }
  public BsdAttributeDefaultObjectData getBsdAttributeDefaultObjectDataBsdAttributeDefaultFromBsdAttributeDefaultGet() {
    return BsdAttributeDefaultObjectHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
  public BsdAttributeDefaultObjectBaseKeyData getBsdAttributeDefaultObjectBaseKeyDataBsdAttributeDefaultFromBsdAttributeDefaultSequenceGet() {
    return BsdAttributeDefaultObjectBaseKeyHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
  public BsdAttributeDefaultObjectBaseData getBsdAttributeDefaultObjectBaseDataBsdAttributeDefaultFromBsdAttributeDefaultUpdate() {
    return BsdAttributeDefaultObjectBaseHelper.fromMap(outputMap, "BsdAttributeDefault");
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
  public void setBsdAttributeDefaultObjectFilter(BsdAttributeDefaultObjectFilter data) {
    if (data != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectHelper.toMap(data, new HashMap()).get("BsdAttributeDefaultObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdAttributeDefaultObjectDataList getBsdAttributeDefaultObjectDataList() {
    return BsdAttributeDefaultObjectHelper.fromMapList(outputMap, "BsdAttributeDefaultList");
  }
  /**
   @deprecated
   */
  public BsdAttributeDefaultObjectData getBsdAttributeDefaultObjectData() {
    return BsdAttributeDefaultObjectHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
  /**
   @deprecated
   */
  public void setBsdAttributeDefaultObjectBaseData(BsdAttributeDefaultObjectBaseData data) {
    if (data != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseHelper.toMap(data, new HashMap()).get("BsdAttributeDefaultObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdAttributeDefaultObjectBaseKeyData(BsdAttributeDefaultObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseKeyHelper.toMap(data, new HashMap()).get("BsdAttributeDefaultObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public BsdAttributeDefaultObjectBaseKeyData getBsdAttributeDefaultObjectBaseKeyData() {
    return BsdAttributeDefaultObjectBaseKeyHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
  /**
   @deprecated
   */
  public BsdAttributeDefaultObjectBaseData getBsdAttributeDefaultObjectBaseData() {
    return BsdAttributeDefaultObjectBaseHelper.fromMap(outputMap, "BsdAttributeDefault");
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
  public void setObjectName(String data) {
    if (data != null) {
      addInput("ObjectName", data);
    }
  }
}
