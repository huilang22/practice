/*
 * Generated code DO NOT EDIT
 * Generated file: JurisdictionRequest.java
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
public final class JurisdictionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public JurisdictionRequest (String request, JurisdictionRequestMethod method) {
    initialize(request, "Jurisdiction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (JurisdictionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setJurisdictionForJurisdictionFind(JurisdictionObjectFilter data) {
    if (data != null) {
      addInput("Jurisdiction", JurisdictionObjectHelper.toMap(data, new HashMap(), "Jurisdiction").get("Jurisdiction"));
    }
  }
  public void setJurisdictionForJurisdictionGet(JurisdictionObjectKeyData data) {
    if (data != null) {
      addInput("Jurisdiction", JurisdictionObjectKeyHelper.toMap(data, new HashMap(), "Jurisdiction").get("Jurisdiction"));
    }
  }
  public JurisdictionObjectDataList getJurisdictionObjectDataJurisdictionFromJurisdictionFind() {
    return JurisdictionObjectHelper.fromMapList(outputMap, "JurisdictionList");
  }
  public JurisdictionObjectData getJurisdictionObjectDataJurisdictionFromJurisdictionGet() {
    return JurisdictionObjectHelper.fromMap(outputMap, "Jurisdiction");
  }
  /**
   @deprecated
   */
  public void setJurisdictionObjectFilter(JurisdictionObjectFilter data) {
    if (data != null) {
      addInput("Jurisdiction", JurisdictionObjectHelper.toMap(data, new HashMap()).get("JurisdictionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setJurisdictionObjectKeyData(JurisdictionObjectKeyData data) {
    if (data != null) {
      addInput("Jurisdiction", JurisdictionObjectKeyHelper.toMap(data, new HashMap()).get("JurisdictionObject"));
    }
  }
  /**
   @deprecated
   */
  public JurisdictionObjectDataList getJurisdictionObjectDataList() {
    return JurisdictionObjectHelper.fromMapList(outputMap, "JurisdictionList");
  }
  /**
   @deprecated
   */
  public JurisdictionObjectData getJurisdictionObjectData() {
    return JurisdictionObjectHelper.fromMap(outputMap, "Jurisdiction");
  }
}
