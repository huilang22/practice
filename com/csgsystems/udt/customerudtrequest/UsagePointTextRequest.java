/*
 * Generated code DO NOT EDIT
 * Generated file: UsagePointTextRequest.java
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
public final class UsagePointTextRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsagePointTextRequest (String request, UsagePointTextRequestMethod method) {
    initialize(request, "UsagePointText", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsagePointTextRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUsagePointTextForUsagePointTextCreate(UsagePointTextObjectData data) {
    if (data != null) {
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(data, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }
  public void setUsagePointTextForUsagePointTextFind(UsagePointTextObjectFilter data) {
    if (data != null) {
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(data, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }
  public void setUsagePointTextForUsagePointTextGet(UsagePointTextObjectKeyData data) {
    if (data != null) {
      addInput("UsagePointText", UsagePointTextObjectKeyHelper.toMap(data, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }
  public void setUsagePointTextForUsagePointTextUpdate(UsagePointTextObjectData data) {
    if (data != null) {
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(data, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }
  public UsagePointTextObjectData getUsagePointTextObjectDataUsagePointTextFromUsagePointTextCreate() {
    return UsagePointTextObjectHelper.fromMap(outputMap, "UsagePointText");
  }
  public UsagePointTextObjectDataList getUsagePointTextObjectDataUsagePointTextFromUsagePointTextFind() {
    return UsagePointTextObjectHelper.fromMapList(outputMap, "UsagePointTextList");
  }
  public UsagePointTextObjectData getUsagePointTextObjectDataUsagePointTextFromUsagePointTextGet() {
    return UsagePointTextObjectHelper.fromMap(outputMap, "UsagePointText");
  }
  public UsagePointTextObjectData getUsagePointTextObjectDataUsagePointTextFromUsagePointTextUpdate() {
    return UsagePointTextObjectHelper.fromMap(outputMap, "UsagePointText");
  }
  /**
   @deprecated
   */
  public void setUsagePointTextObjectFilter(UsagePointTextObjectFilter data) {
    if (data != null) {
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(data, new HashMap()).get("UsagePointTextObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsagePointTextObjectData(UsagePointTextObjectData data) {
    if (data != null) {
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(data, new HashMap()).get("UsagePointTextObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsagePointTextObjectKeyData(UsagePointTextObjectKeyData data) {
    if (data != null) {
      addInput("UsagePointText", UsagePointTextObjectKeyHelper.toMap(data, new HashMap()).get("UsagePointTextObject"));
    }
  }
  /**
   @deprecated
   */
  public UsagePointTextObjectDataList getUsagePointTextObjectDataList() {
    return UsagePointTextObjectHelper.fromMapList(outputMap, "UsagePointTextList");
  }
  /**
   @deprecated
   */
  public UsagePointTextObjectData getUsagePointTextObjectData() {
    return UsagePointTextObjectHelper.fromMap(outputMap, "UsagePointText");
  }
}
