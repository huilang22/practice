/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyRequest.java
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
public final class PolicyRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PolicyRequest (String request, PolicyRequestMethod method) {
    initialize(request, "Policy", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PolicyRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPolicyForPolicyCreate(PolicyObjectData data) {
    if (data != null) {
      addInput("Policy", PolicyObjectHelper.toMap(data, new HashMap(), "Policy").get("Policy"));
    }
  }
  public void setPolicyForPolicyFind(PolicyObjectFilter data) {
    if (data != null) {
      addInput("Policy", PolicyObjectHelper.toMap(data, new HashMap(), "Policy").get("Policy"));
    }
  }
  public void setPolicyForPolicyGet(PolicyObjectKeyData data) {
    if (data != null) {
      addInput("Policy", PolicyObjectKeyHelper.toMap(data, new HashMap(), "Policy").get("Policy"));
    }
  }
  public void setPolicyForPolicyUpdate(PolicyObjectData data) {
    if (data != null) {
      addInput("Policy", PolicyObjectHelper.toMap(data, new HashMap(), "Policy").get("Policy"));
    }
  }
  public PolicyObjectData getPolicyObjectDataPolicyFromPolicyCreate() {
    return PolicyObjectHelper.fromMap(outputMap, "Policy");
  }
  public PolicyObjectDataList getPolicyObjectDataPolicyFromPolicyFind() {
    return PolicyObjectHelper.fromMapList(outputMap, "PolicyList");
  }
  public PolicyObjectData getPolicyObjectDataPolicyFromPolicyGet() {
    return PolicyObjectHelper.fromMap(outputMap, "Policy");
  }
  public PolicyObjectData getPolicyObjectDataPolicyFromPolicyUpdate() {
    return PolicyObjectHelper.fromMap(outputMap, "Policy");
  }
  /**
   @deprecated
   */
  public void setPolicyObjectFilter(PolicyObjectFilter data) {
    if (data != null) {
      addInput("Policy", PolicyObjectHelper.toMap(data, new HashMap()).get("PolicyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPolicyObjectData(PolicyObjectData data) {
    if (data != null) {
      addInput("Policy", PolicyObjectHelper.toMap(data, new HashMap()).get("PolicyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPolicyObjectKeyData(PolicyObjectKeyData data) {
    if (data != null) {
      addInput("Policy", PolicyObjectKeyHelper.toMap(data, new HashMap()).get("PolicyObject"));
    }
  }
  /**
   @deprecated
   */
  public PolicyObjectDataList getPolicyObjectDataList() {
    return PolicyObjectHelper.fromMapList(outputMap, "PolicyList");
  }
  /**
   @deprecated
   */
  public PolicyObjectData getPolicyObjectData() {
    return PolicyObjectHelper.fromMap(outputMap, "Policy");
  }
}
