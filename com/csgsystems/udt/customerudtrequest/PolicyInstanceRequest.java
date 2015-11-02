/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyInstanceRequest.java
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

import com.csgsystems.om.data.*;
public final class PolicyInstanceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PolicyInstanceRequest (String request, PolicyInstanceRequestMethod method) {
    initialize(request, "PolicyInstance", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PolicyInstanceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPolicyInstanceForPolicyInstanceCreate(PolicyInstanceObjectData data) {
    if (data != null) {
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(data, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }
  public void setPolicyInstanceForPolicyInstanceFind(PolicyInstanceObjectFilter data) {
    if (data != null) {
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(data, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }
  public void setPolicyInstanceForPolicyInstanceGet(PolicyInstanceObjectKeyData data) {
    if (data != null) {
      addInput("PolicyInstance", PolicyInstanceObjectKeyHelper.toMap(data, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }
  public void setPolicyInstanceForPolicyInstanceUpdate(PolicyInstanceObjectData data) {
    if (data != null) {
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(data, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }
  public PolicyInstanceObjectData getPolicyInstanceObjectDataPolicyInstanceFromPolicyInstanceCreate() {
    return PolicyInstanceObjectHelper.fromMap(outputMap, "PolicyInstance");
  }
  public PolicyInstanceObjectDataList getPolicyInstanceObjectDataPolicyInstanceFromPolicyInstanceFind() {
    return PolicyInstanceObjectHelper.fromMapList(outputMap, "PolicyInstanceList");
  }
  public PolicyInstanceObjectData getPolicyInstanceObjectDataPolicyInstanceFromPolicyInstanceGet() {
    return PolicyInstanceObjectHelper.fromMap(outputMap, "PolicyInstance");
  }
  public PolicyInstanceObjectData getPolicyInstanceObjectDataPolicyInstanceFromPolicyInstanceUpdate() {
    return PolicyInstanceObjectHelper.fromMap(outputMap, "PolicyInstance");
  }
  /**
   @deprecated
   */
  public void setPolicyInstanceObjectFilter(PolicyInstanceObjectFilter data) {
    if (data != null) {
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(data, new HashMap()).get("PolicyInstanceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPolicyInstanceObjectData(PolicyInstanceObjectData data) {
    if (data != null) {
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(data, new HashMap()).get("PolicyInstanceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPolicyInstanceObjectKeyData(PolicyInstanceObjectKeyData data) {
    if (data != null) {
      addInput("PolicyInstance", PolicyInstanceObjectKeyHelper.toMap(data, new HashMap()).get("PolicyInstanceObject"));
    }
  }
  /**
   @deprecated
   */
  public PolicyInstanceObjectDataList getPolicyInstanceObjectDataList() {
    return PolicyInstanceObjectHelper.fromMapList(outputMap, "PolicyInstanceList");
  }
  /**
   @deprecated
   */
  public PolicyInstanceObjectData getPolicyInstanceObjectData() {
    return PolicyInstanceObjectHelper.fromMap(outputMap, "PolicyInstance");
  }
}
