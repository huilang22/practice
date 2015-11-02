/*
 * Generated code DO NOT EDIT
 * Generated file: CitChannelRequest.java
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

import com.csgsystems.cit.data.*;
public final class CitChannelRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CitChannelRequest (String request, CitChannelRequestMethod method) {
    initialize(request, "CitChannel", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CitChannelRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCitChannelForCitChannelCreate(CitChannelObjectData data) {
    if (data != null) {
      addInput("CitChannel", CitChannelObjectHelper.toMap(data, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }
  public void setCitChannelForCitChannelDelete(CitChannelObjectKeyData data) {
    if (data != null) {
      addInput("CitChannel", CitChannelObjectKeyHelper.toMap(data, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }
  public void setCitChannelForCitChannelFind(CitChannelObjectFilter data) {
    if (data != null) {
      addInput("CitChannel", CitChannelObjectHelper.toMap(data, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }
  public void setCitChannelForCitChannelGet(CitChannelObjectKeyData data) {
    if (data != null) {
      addInput("CitChannel", CitChannelObjectKeyHelper.toMap(data, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }
  public void setCitChannelForCitChannelUpdate(CitChannelObjectData data) {
    if (data != null) {
      addInput("CitChannel", CitChannelObjectHelper.toMap(data, new HashMap(), "CitChannel").get("CitChannel"));
    }
  }
  public CitChannelObjectData getCitChannelObjectDataCitChannelFromCitChannelCreate() {
    return CitChannelObjectHelper.fromMap(outputMap, "CitChannel");
  }
  public CitChannelObjectData getCitChannelObjectDataCitChannelFromCitChannelDelete() {
    return CitChannelObjectHelper.fromMap(outputMap, "CitChannel");
  }
  public CitChannelObjectDataList getCitChannelObjectDataCitChannelFromCitChannelFind() {
    return CitChannelObjectHelper.fromMapList(outputMap, "CitChannelList");
  }
  public CitChannelObjectData getCitChannelObjectDataCitChannelFromCitChannelGet() {
    return CitChannelObjectHelper.fromMap(outputMap, "CitChannel");
  }
  public CitChannelObjectKeyData getCitChannelObjectKeyDataCitChannelFromCitChannelSequenceGet() {
    return CitChannelObjectKeyHelper.fromMap(outputMap, "CitChannel");
  }
  public CitChannelObjectData getCitChannelObjectDataCitChannelFromCitChannelUpdate() {
    return CitChannelObjectHelper.fromMap(outputMap, "CitChannel");
  }
  /**
   @deprecated
   */
  public void setCitChannelObjectFilter(CitChannelObjectFilter data) {
    if (data != null) {
      addInput("CitChannel", CitChannelObjectHelper.toMap(data, new HashMap()).get("CitChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitChannelObjectData(CitChannelObjectData data) {
    if (data != null) {
      addInput("CitChannel", CitChannelObjectHelper.toMap(data, new HashMap()).get("CitChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitChannelObjectKeyData(CitChannelObjectKeyData data) {
    if (data != null) {
      addInput("CitChannel", CitChannelObjectKeyHelper.toMap(data, new HashMap()).get("CitChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public CitChannelObjectDataList getCitChannelObjectDataList() {
    return CitChannelObjectHelper.fromMapList(outputMap, "CitChannelList");
  }
  /**
   @deprecated
   */
  public CitChannelObjectKeyData getCitChannelObjectKeyData() {
    return CitChannelObjectKeyHelper.fromMap(outputMap, "CitChannel");
  }
  /**
   @deprecated
   */
  public CitChannelObjectData getCitChannelObjectData() {
    return CitChannelObjectHelper.fromMap(outputMap, "CitChannel");
  }
}
