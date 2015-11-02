/*
 * Generated code DO NOT EDIT
 * Generated file: UsaRestrictionsRequest.java
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
public final class UsaRestrictionsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsaRestrictionsRequest (String request, UsaRestrictionsRequestMethod method) {
    initialize(request, "UsaRestrictions", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsaRestrictionsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUsaRestrictionsForUsaRestrictionsCreate(UsaRestrictionsObjectData data) {
    if (data != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(data, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }
  public void setUsaRestrictionsForUsaRestrictionsDelete(UsaRestrictionsObjectData data) {
    if (data != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(data, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }
  public void setUsaRestrictionsForUsaRestrictionsFind(UsaRestrictionsObjectFilter data) {
    if (data != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(data, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }
  public void setUsaRestrictionsForUsaRestrictionsGet(UsaRestrictionsObjectKeyData data) {
    if (data != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectKeyHelper.toMap(data, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }
  public void setUsaRestrictionsForUsaRestrictionsUpdate(UsaRestrictionsObjectData data) {
    if (data != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(data, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }
  public UsaRestrictionsObjectData getUsaRestrictionsObjectDataUsaRestrictionsFromUsaRestrictionsCreate() {
    return UsaRestrictionsObjectHelper.fromMap(outputMap, "UsaRestrictions");
  }
  public UsaRestrictionsObjectData getUsaRestrictionsObjectDataUsaRestrictionsFromUsaRestrictionsDelete() {
    return UsaRestrictionsObjectHelper.fromMap(outputMap, "UsaRestrictions");
  }
  public UsaRestrictionsObjectDataList getUsaRestrictionsObjectDataUsaRestrictionsFromUsaRestrictionsFind() {
    return UsaRestrictionsObjectHelper.fromMapList(outputMap, "UsaRestrictionsList");
  }
  public UsaRestrictionsObjectData getUsaRestrictionsObjectDataUsaRestrictionsFromUsaRestrictionsGet() {
    return UsaRestrictionsObjectHelper.fromMap(outputMap, "UsaRestrictions");
  }
  public UsaRestrictionsObjectData getUsaRestrictionsObjectDataUsaRestrictionsFromUsaRestrictionsUpdate() {
    return UsaRestrictionsObjectHelper.fromMap(outputMap, "UsaRestrictions");
  }
  /**
   @deprecated
   */
  public void setUsaRestrictionsObjectFilter(UsaRestrictionsObjectFilter data) {
    if (data != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(data, new HashMap()).get("UsaRestrictionsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsaRestrictionsObjectData(UsaRestrictionsObjectData data) {
    if (data != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(data, new HashMap()).get("UsaRestrictionsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsaRestrictionsObjectKeyData(UsaRestrictionsObjectKeyData data) {
    if (data != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectKeyHelper.toMap(data, new HashMap()).get("UsaRestrictionsObject"));
    }
  }
  /**
   @deprecated
   */
  public UsaRestrictionsObjectDataList getUsaRestrictionsObjectDataList() {
    return UsaRestrictionsObjectHelper.fromMapList(outputMap, "UsaRestrictionsList");
  }
  /**
   @deprecated
   */
  public UsaRestrictionsObjectData getUsaRestrictionsObjectData() {
    return UsaRestrictionsObjectHelper.fromMap(outputMap, "UsaRestrictions");
  }
}
