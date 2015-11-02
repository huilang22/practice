/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentDistributionRequest.java
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
public final class PrepaymentDistributionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PrepaymentDistributionRequest (String request, PrepaymentDistributionRequestMethod method) {
    initialize(request, "PrepaymentDistribution", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PrepaymentDistributionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PrepaymentRequest request, PrepaymentDistributionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PrepaymentRequest request, PrepaymentDistributionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setPrepaymentDistributionForPrepaymentDistributionFind(PrepaymentDistributionObjectFilter data) {
    if (data != null) {
      addInput("PrepaymentDistribution", PrepaymentDistributionObjectHelper.toMap(data, new HashMap(), "PrepaymentDistribution").get("PrepaymentDistribution"));
    }
  }
  public void setPrepaymentDistributionForPrepaymentDistributionGet(PrepaymentDistributionObjectKeyData data) {
    if (data != null) {
      addInput("PrepaymentDistribution", PrepaymentDistributionObjectKeyHelper.toMap(data, new HashMap(), "PrepaymentDistribution").get("PrepaymentDistribution"));
    }
  }
  public PrepaymentDistributionObjectDataList getPrepaymentDistributionObjectDataPrepaymentDistributionFromPrepaymentDistributionFind() {
    return PrepaymentDistributionObjectHelper.fromMapList(outputMap, "PrepaymentDistributionList");
  }
  public PrepaymentDistributionObjectData getPrepaymentDistributionObjectDataPrepaymentDistributionFromPrepaymentDistributionGet() {
    return PrepaymentDistributionObjectHelper.fromMap(outputMap, "PrepaymentDistribution");
  }
  /**
   @deprecated
   */
  public void setPrepaymentDistributionObjectFilter(PrepaymentDistributionObjectFilter data) {
    if (data != null) {
      addInput("PrepaymentDistribution", PrepaymentDistributionObjectHelper.toMap(data, new HashMap()).get("PrepaymentDistributionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPrepaymentDistributionObjectKeyData(PrepaymentDistributionObjectKeyData data) {
    if (data != null) {
      addInput("PrepaymentDistribution", PrepaymentDistributionObjectKeyHelper.toMap(data, new HashMap()).get("PrepaymentDistributionObject"));
    }
  }
  /**
   @deprecated
   */
  public PrepaymentDistributionObjectDataList getPrepaymentDistributionObjectDataList() {
    return PrepaymentDistributionObjectHelper.fromMapList(outputMap, "PrepaymentDistributionList");
  }
  /**
   @deprecated
   */
  public PrepaymentDistributionObjectData getPrepaymentDistributionObjectData() {
    return PrepaymentDistributionObjectHelper.fromMap(outputMap, "PrepaymentDistribution");
  }
}
