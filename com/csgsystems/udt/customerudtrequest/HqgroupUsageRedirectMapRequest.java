/*
 * Generated code DO NOT EDIT
 * Generated file: HqgroupUsageRedirectMapRequest.java
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
public final class HqgroupUsageRedirectMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public HqgroupUsageRedirectMapRequest (String request, HqgroupUsageRedirectMapRequestMethod method) {
    initialize(request, "HqgroupUsageRedirectMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (HqgroupUsageRedirectMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setHqgroupUsageRedirectMapForHqgroupUsageRedirectMapCancel(HqGroupUsageRedirectMapObjectData data) {
    if (data != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(data, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }
  public void setHqgroupUsageRedirectMapForHqgroupUsageRedirectMapCreate(HqGroupUsageRedirectMapObjectData data) {
    if (data != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(data, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }
  public void setHGURMDCeaseDateForHqgroupUsageRedirectMapDelete(Date data) {
    if (data != null) {
      addInput("HGURMDCeaseDate", data);
    }
  }
  public void setHqgroupUsageRedirectMapForHqgroupUsageRedirectMapDelete(HqGroupUsageRedirectMapObjectKeyData data) {
    if (data != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectKeyHelper.toMap(data, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }
  public void setHGURMDLCeaseDateForHqgroupUsageRedirectMapDeleteList(Date data) {
    if (data != null) {
      addInput("HGURMDLCeaseDate", data);
    }
  }
  public void setHqGroupUsageRedirectMapFilterForHqgroupUsageRedirectMapDeleteList(HqGroupUsageRedirectMapObjectFilter data) {
    if (data != null) {
      addInput("HqGroupUsageRedirectMapFilter", HqGroupUsageRedirectMapObjectHelper.toMap(data, new HashMap(), "HqGroupUsageRedirectMapFilter").get("HqGroupUsageRedirectMapFilter"));
    }
  }
  public void setHqgroupUsageRedirectMapForHqgroupUsageRedirectMapDisconnectList(HqGroupUsageRedirectMapObjectData data) {
    if (data != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(data, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }
  public void setHqgroupUsageRedirectMapForHqgroupUsageRedirectMapFind(HqGroupUsageRedirectMapObjectFilter data) {
    if (data != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(data, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }
  public void setHqgroupUsageRedirectMapForHqgroupUsageRedirectMapGet(HqGroupUsageRedirectMapObjectKeyData data) {
    if (data != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectKeyHelper.toMap(data, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }
  public void setHqgroupUsageRedirectMapForHqgroupUsageRedirectMapPriorityUpdate(HqGroupUsageRedirectMapObjectData data) {
    if (data != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(data, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }
  public void setHqgroupUsageRedirectMapForHqgroupUsageRedirectMapUpdate(HqGroupUsageRedirectMapObjectData data) {
    if (data != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(data, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }
  public HqGroupUsageRedirectMapObjectData getHqGroupUsageRedirectMapObjectDataHqgroupUsageRedirectMapFromHqgroupUsageRedirectMapCreate() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
  public HqGroupUsageRedirectMapObjectData getHqGroupUsageRedirectMapObjectDataHqgroupUsageRedirectMapFromHqgroupUsageRedirectMapDelete() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
  public HqGroupUsageRedirectMapObjectDataList getHqGroupUsageRedirectMapObjectDataHqgroupUsageRedirectMapFromHqgroupUsageRedirectMapFind() {
    return HqGroupUsageRedirectMapObjectHelper.fromMapList(outputMap, "HqgroupUsageRedirectMapList");
  }
  public HqGroupUsageRedirectMapObjectData getHqGroupUsageRedirectMapObjectDataHqgroupUsageRedirectMapFromHqgroupUsageRedirectMapGet() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
  public HqGroupUsageRedirectMapObjectData getHqGroupUsageRedirectMapObjectDataHqgroupUsageRedirectMapFromHqgroupUsageRedirectMapPriorityUpdate() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
  public HqGroupUsageRedirectMapObjectData getHqGroupUsageRedirectMapObjectDataHqgroupUsageRedirectMapFromHqgroupUsageRedirectMapUpdate() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
  /**
   @deprecated
   */
  public void setHGURMDCeaseDate(Date data) {
    if (data != null) {
      addInput("HGURMDCeaseDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setHGURMDLCeaseDate(Date data) {
    if (data != null) {
      addInput("HGURMDLCeaseDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupUsageRedirectMapObjectFilter(HqGroupUsageRedirectMapObjectFilter data) {
    if (data != null) {
      addInput("HqGroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(data, new HashMap()).get("HqGroupUsageRedirectMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupUsageRedirectMapObjectData(HqGroupUsageRedirectMapObjectData data) {
    if (data != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(data, new HashMap()).get("HqGroupUsageRedirectMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupUsageRedirectMapObjectKeyData(HqGroupUsageRedirectMapObjectKeyData data) {
    if (data != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectKeyHelper.toMap(data, new HashMap()).get("HqGroupUsageRedirectMapObject"));
    }
  }
  /**
   @deprecated
   */
  public HqGroupUsageRedirectMapObjectDataList getHqGroupUsageRedirectMapObjectDataList() {
    return HqGroupUsageRedirectMapObjectHelper.fromMapList(outputMap, "HqGroupUsageRedirectMapList");
  }
  /**
   @deprecated
   */
  public HqGroupUsageRedirectMapObjectData getHqGroupUsageRedirectMapObjectData() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
}
