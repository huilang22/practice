/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherDefinitionsRequest.java
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
public final class VoucherDefinitionsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public VoucherDefinitionsRequest (String request, VoucherDefinitionsRequestMethod method) {
    initialize(request, "VoucherDefinitions", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (VoucherDefinitionsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setVoucherDefinitionsForVoucherConsume(VoucherDefinitionsObjectData data) {
    if (data != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(data, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }
  public void setVoucherDefinitionsForVoucherDefinitionsCreate(VoucherDefinitionsObjectData data) {
    if (data != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(data, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }
  public void setVoucherDefinitionsForVoucherDefinitionsFind(VoucherDefinitionsObjectFilter data) {
    if (data != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(data, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }
  public void setVoucherDefinitionsForVoucherDefinitionsGet(VoucherDefinitionsObjectKeyData data) {
    if (data != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectKeyHelper.toMap(data, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }
  public void setVoucherDefinitionsForVoucherDefinitionsLocationUpdate(VoucherDefinitionsObjectData data) {
    if (data != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(data, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }
  public void setVoucherDefinitionsForVoucherDefinitionsPinGet(VoucherDefinitionsObjectKeyData data) {
    if (data != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectKeyHelper.toMap(data, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }
  public void setVoucherDefinitionsForVoucherDefinitionsPinVerify(VoucherDefinitionsObjectData data) {
    if (data != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(data, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }
  public void setVDUBBatchIdInForVoucherDefinitionsUpdateByBatchId(BigInteger data) {
    if (data != null) {
      addInput("VDUBBatchIdIn", data);
    }
  }
  public void setVDUBLocCodeInForVoucherDefinitionsUpdateByBatchId(BigInteger data) {
    if (data != null) {
      addInput("VDUBLocCodeIn", data);
    }
  }
  public void setVDUBStatusInForVoucherDefinitionsUpdateByBatchId(BigInteger data) {
    if (data != null) {
      addInput("VDUBStatusIn", data);
    }
  }
  public VoucherStatusInfoObjectData getVoucherStatusInfoObjectDataVCOutFromVoucherConsume() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VCOut");
  }
  public VoucherDefinitionsObjectData getVoucherDefinitionsObjectDataVoucherDefinitionsFromVoucherDefinitionsCreate() {
    return VoucherDefinitionsObjectHelper.fromMap(outputMap, "VoucherDefinitions");
  }
  public VoucherDefinitionsObjectDataList getVoucherDefinitionsObjectDataVoucherDefinitionsFromVoucherDefinitionsFind() {
    return VoucherDefinitionsObjectHelper.fromMapList(outputMap, "VoucherDefinitionsList");
  }
  public VoucherDefinitionsObjectData getVoucherDefinitionsObjectDataVoucherDefinitionsFromVoucherDefinitionsGet() {
    return VoucherDefinitionsObjectHelper.fromMap(outputMap, "VoucherDefinitions");
  }
  public VoucherDefinitionsObjectData getVoucherDefinitionsObjectDataVoucherDefinitionsFromVoucherDefinitionsLocationUpdate() {
    return VoucherDefinitionsObjectHelper.fromMap(outputMap, "VoucherDefinitions");
  }
  public VoucherDefinitionsPinGetOutputData getVoucherDefinitionsPinGetOutputDataVoucherDefinitionsPinGetOutputDataFromVoucherDefinitionsPinGet() {
    return VoucherDefinitionsPinGetOutputHelper.fromMap(outputMap);
  }
  public BigInteger getBigIntegerRetFromVoucherDefinitionsPinVerify() {
    return (BigInteger)outputMap.get("Ret");
  }
  public Integer getIntegerVDUBUpdateCountOutFromVoucherDefinitionsUpdateByBatchId() {
    return (Integer)outputMap.get("VDUBUpdateCountOut");
  }
  /**
   @deprecated
   */
  public void setVDUBBatchIdIn(BigInteger data) {
    if (data != null) {
      addInput("VDUBBatchIdIn", data);
    }
  }
  /**
   @deprecated
   */
  public void setVDUBLocCodeIn(BigInteger data) {
    if (data != null) {
      addInput("VDUBLocCodeIn", data);
    }
  }
  /**
   @deprecated
   */
  public void setVDUBStatusIn(BigInteger data) {
    if (data != null) {
      addInput("VDUBStatusIn", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getVDUBUpdateCountOut() {
    return (Integer)outputMap.get("VDUBUpdateCountOut");
  }
  /**
   @deprecated
   */
  public void setVoucherDefinitionsObjectFilter(VoucherDefinitionsObjectFilter data) {
    if (data != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(data, new HashMap()).get("VoucherDefinitionsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherDefinitionsObjectData(VoucherDefinitionsObjectData data) {
    if (data != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(data, new HashMap()).get("VoucherDefinitionsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherDefinitionsObjectKeyData(VoucherDefinitionsObjectKeyData data) {
    if (data != null) {
      addInput("VoucherDefinitions", VoucherDefinitionsObjectKeyHelper.toMap(data, new HashMap()).get("VoucherDefinitionsObject"));
    }
  }
  /**
   @deprecated
   */
  public VoucherDefinitionsObjectDataList getVoucherDefinitionsObjectDataList() {
    return VoucherDefinitionsObjectHelper.fromMapList(outputMap, "VoucherDefinitionsList");
  }
  /**
   @deprecated
   */
  public VoucherDefinitionsObjectData getVoucherDefinitionsObjectData() {
    return VoucherDefinitionsObjectHelper.fromMap(outputMap, "VoucherDefinitions");
  }
  /**
   @deprecated
   */
  public VoucherDefinitionsPinGetOutputData getVoucherDefinitionsPinGetOutputData() {
    return VoucherDefinitionsPinGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public VoucherStatusInfoObjectData getVoucherStatusInfoObjectData() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
  /**
   @deprecated
   */
  public BigInteger getRet() {
    return (BigInteger)outputMap.get("Ret");
  }
}
