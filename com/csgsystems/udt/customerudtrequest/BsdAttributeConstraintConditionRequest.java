/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintConditionRequest.java
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
public final class BsdAttributeConstraintConditionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdAttributeConstraintConditionRequest (String request, BsdAttributeConstraintConditionRequestMethod method) {
    initialize(request, "BsdAttributeConstraintCondition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdAttributeConstraintConditionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActionNameForBsdAttributeConstraintConditionActionFind(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  public void setApplicationNameForBsdAttributeConstraintConditionActionFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdAttributeConstraintConditionActionFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setEffectiveDateForBsdAttributeConstraintConditionActionFind(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setObjectNameForBsdAttributeConstraintConditionActionFind(String data) {
    if (data != null) {
      addInput("ObjectName", data);
    }
  }
  public void setBsdAttributeConstraintConditionForBsdAttributeConstraintConditionCreate(BsdAttributeConstraintConditionObjectData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(data, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }
  public void setBsdAttributeConstraintConditionForBsdAttributeConstraintConditionDelete(BsdAttributeConstraintConditionObjectKeyData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectKeyHelper.toMap(data, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }
  public void setBsdAttributeConstraintConditionForBsdAttributeConstraintConditionFind(BsdAttributeConstraintConditionObjectFilter data) {
    if (data != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(data, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }
  public void setBsdAttributeConstraintConditionForBsdAttributeConstraintConditionGet(BsdAttributeConstraintConditionObjectKeyData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectKeyHelper.toMap(data, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }
  public void setBsdAttributeConstraintConditionForBsdAttributeConstraintConditionUpdate(BsdAttributeConstraintConditionObjectData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(data, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }
  public BsdAttributeConstraintConditionDescObjectDataList getBsdAttributeConstraintConditionDescObjectDataBsdAttributeConstraintConditionFromBsdAttributeConstraintConditionActionFind() {
    return BsdAttributeConstraintConditionDescObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintConditionList");
  }
  public BsdAttributeConstraintConditionObjectData getBsdAttributeConstraintConditionObjectDataBsdAttributeConstraintConditionFromBsdAttributeConstraintConditionCreate() {
    return BsdAttributeConstraintConditionObjectHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
  public BsdAttributeConstraintConditionObjectData getBsdAttributeConstraintConditionObjectDataBsdAttributeConstraintConditionFromBsdAttributeConstraintConditionDelete() {
    return BsdAttributeConstraintConditionObjectHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
  public BsdAttributeConstraintConditionObjectDataList getBsdAttributeConstraintConditionObjectDataBsdAttributeConstraintConditionFromBsdAttributeConstraintConditionFind() {
    return BsdAttributeConstraintConditionObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintConditionList");
  }
  public BsdAttributeConstraintConditionObjectData getBsdAttributeConstraintConditionObjectDataBsdAttributeConstraintConditionFromBsdAttributeConstraintConditionGet() {
    return BsdAttributeConstraintConditionObjectHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
  public BsdAttributeConstraintConditionObjectKeyData getBsdAttributeConstraintConditionObjectKeyDataBsdAttributeConstraintConditionFromBsdAttributeConstraintConditionSequenceGet() {
    return BsdAttributeConstraintConditionObjectKeyHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
  public BsdAttributeConstraintConditionObjectData getBsdAttributeConstraintConditionObjectDataBsdAttributeConstraintConditionFromBsdAttributeConstraintConditionUpdate() {
    return BsdAttributeConstraintConditionObjectHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
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
  public BsdAttributeConstraintConditionDescObjectDataList getBsdAttributeConstraintConditionDescObjectDataList() {
    return BsdAttributeConstraintConditionDescObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintConditionList");
  }
  /**
   @deprecated
   */
  public void setBsdAttributeConstraintConditionObjectFilter(BsdAttributeConstraintConditionObjectFilter data) {
    if (data != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(data, new HashMap()).get("BsdAttributeConstraintConditionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdAttributeConstraintConditionObjectData(BsdAttributeConstraintConditionObjectData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(data, new HashMap()).get("BsdAttributeConstraintConditionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdAttributeConstraintConditionObjectKeyData(BsdAttributeConstraintConditionObjectKeyData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectKeyHelper.toMap(data, new HashMap()).get("BsdAttributeConstraintConditionObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdAttributeConstraintConditionObjectDataList getBsdAttributeConstraintConditionObjectDataList() {
    return BsdAttributeConstraintConditionObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintConditionList");
  }
  /**
   @deprecated
   */
  public BsdAttributeConstraintConditionObjectKeyData getBsdAttributeConstraintConditionObjectKeyData() {
    return BsdAttributeConstraintConditionObjectKeyHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
  /**
   @deprecated
   */
  public BsdAttributeConstraintConditionObjectData getBsdAttributeConstraintConditionObjectData() {
    return BsdAttributeConstraintConditionObjectHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
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
