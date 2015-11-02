/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintRequest.java
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
public final class BsdAttributeConstraintRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdAttributeConstraintRequest (String request, BsdAttributeConstraintRequestMethod method) {
    initialize(request, "BsdAttributeConstraint", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdAttributeConstraintRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActionNameForBsdAttributeConstraintActionFind(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  public void setApplicationNameForBsdAttributeConstraintActionFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdAttributeConstraintActionFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setEffectiveDateForBsdAttributeConstraintActionFind(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setObjectNameForBsdAttributeConstraintActionFind(String data) {
    if (data != null) {
      addInput("ObjectName", data);
    }
  }
  public void setBsdAttributeConstraintForBsdAttributeConstraintCreate(BsdAttributeConstraintObjectBaseData data) {
    if (data != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseHelper.toMap(data, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }
  public void setBsdAttributeConstraintForBsdAttributeConstraintDelete(BsdAttributeConstraintObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }
  public void setBsdAttributeConstraintForBsdAttributeConstraintFind(BsdAttributeConstraintObjectFilter data) {
    if (data != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectHelper.toMap(data, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }
  public void setBsdAttributeConstraintForBsdAttributeConstraintGet(BsdAttributeConstraintObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }
  public void setBsdAttributeConstraintForBsdAttributeConstraintUpdate(BsdAttributeConstraintObjectBaseData data) {
    if (data != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseHelper.toMap(data, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }
  public BsdAttributeConstraintObjectDataList getBsdAttributeConstraintObjectDataBsdAttributeConstraintFromBsdAttributeConstraintActionFind() {
    return BsdAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintList");
  }
  public BsdAttributeConstraintObjectData getBsdAttributeConstraintObjectDataBsdAttributeConstraintFromBsdAttributeConstraintCreate() {
    return BsdAttributeConstraintObjectHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
  public BsdAttributeConstraintObjectBaseData getBsdAttributeConstraintObjectBaseDataBsdAttributeConstraintFromBsdAttributeConstraintDelete() {
    return BsdAttributeConstraintObjectBaseHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
  public BsdAttributeConstraintObjectDataList getBsdAttributeConstraintObjectDataBsdAttributeConstraintFromBsdAttributeConstraintFind() {
    return BsdAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintList");
  }
  public BsdAttributeConstraintObjectData getBsdAttributeConstraintObjectDataBsdAttributeConstraintFromBsdAttributeConstraintGet() {
    return BsdAttributeConstraintObjectHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
  public BsdAttributeConstraintObjectBaseKeyData getBsdAttributeConstraintObjectBaseKeyDataBsdAttributeConstraintFromBsdAttributeConstraintSequenceGet() {
    return BsdAttributeConstraintObjectBaseKeyHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
  public BsdAttributeConstraintObjectData getBsdAttributeConstraintObjectDataBsdAttributeConstraintFromBsdAttributeConstraintUpdate() {
    return BsdAttributeConstraintObjectHelper.fromMap(outputMap, "BsdAttributeConstraint");
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
  public void setBsdAttributeConstraintObjectFilter(BsdAttributeConstraintObjectFilter data) {
    if (data != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectHelper.toMap(data, new HashMap()).get("BsdAttributeConstraintObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdAttributeConstraintObjectDataList getBsdAttributeConstraintObjectDataList() {
    return BsdAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintList");
  }
  /**
   @deprecated
   */
  public BsdAttributeConstraintObjectData getBsdAttributeConstraintObjectData() {
    return BsdAttributeConstraintObjectHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
  /**
   @deprecated
   */
  public void setBsdAttributeConstraintObjectBaseData(BsdAttributeConstraintObjectBaseData data) {
    if (data != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseHelper.toMap(data, new HashMap()).get("BsdAttributeConstraintObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdAttributeConstraintObjectBaseKeyData(BsdAttributeConstraintObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseKeyHelper.toMap(data, new HashMap()).get("BsdAttributeConstraintObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public BsdAttributeConstraintObjectBaseKeyData getBsdAttributeConstraintObjectBaseKeyData() {
    return BsdAttributeConstraintObjectBaseKeyHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
  /**
   @deprecated
   */
  public BsdAttributeConstraintObjectBaseData getBsdAttributeConstraintObjectBaseData() {
    return BsdAttributeConstraintObjectBaseHelper.fromMap(outputMap, "BsdAttributeConstraint");
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
