/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageBulkAdjustmentRequest.java
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

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
public final class BilledUsageBulkAdjustmentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BilledUsageBulkAdjustmentRequest (String request, BilledUsageBulkAdjustmentRequestMethod method) {
    initialize(request, "BilledUsageBulkAdjustment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BilledUsageBulkAdjustmentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestForBilledUsageBulkAdjustmentCreate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBilledUsageForBilledUsageBulkAdjustmentCreate(BilledUsageObjectData data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageQueryForBilledUsageBulkAdjustmentCreate(BilledUsageQueryObjectData data) {
    if (data != null) {
      addInput("BilledUsageQuery", BilledUsageQueryObjectHelper.toMap(data, new HashMap(), "BilledUsageQuery").get("BilledUsageQuery"));
    }
  }
  public void setBulkAdjustmentForBilledUsageBulkAdjustmentCreate(BulkAdjustmentObjectData data) {
    if (data != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(data, new HashMap(), "BulkAdjustment").get("BulkAdjustment"));
    }
  }
  public void setCDFFileNameForBilledUsageBulkAdjustmentCreate(String data) {
    if (data != null) {
      addInput("CDFFileName", data);
    }
  }
  public void setXMLFileNameForBilledUsageBulkAdjustmentCreate(String data) {
    if (data != null) {
      addInput("XMLFileName", data);
    }
  }
  public void setBatchRequestForBilledUsageBulkAdjustmentGet(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBatchRequestForBilledUsageBulkAdjustmentUpdate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBilledUsageForBilledUsageBulkAdjustmentUpdate(BilledUsageObjectData data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageQueryForBilledUsageBulkAdjustmentUpdate(BilledUsageQueryObjectData data) {
    if (data != null) {
      addInput("BilledUsageQuery", BilledUsageQueryObjectHelper.toMap(data, new HashMap(), "BilledUsageQuery").get("BilledUsageQuery"));
    }
  }
  public void setBulkAdjustmentForBilledUsageBulkAdjustmentUpdate(BulkAdjustmentObjectData data) {
    if (data != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(data, new HashMap(), "BulkAdjustment").get("BulkAdjustment"));
    }
  }
  public void setCDFFileNameForBilledUsageBulkAdjustmentUpdate(String data) {
    if (data != null) {
      addInput("CDFFileName", data);
    }
  }
  public void setXMLFileNameForBilledUsageBulkAdjustmentUpdate(String data) {
    if (data != null) {
      addInput("XMLFileName", data);
    }
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBilledUsageBulkAdjustmentCreate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BilledUsageBulkAdjustmentGetOutputData getBilledUsageBulkAdjustmentGetOutputDataBilledUsageBulkAdjustmentGetOutputDataFromBilledUsageBulkAdjustmentGet() {
    return BilledUsageBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBilledUsageBulkAdjustmentUpdate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  /**
   @deprecated
   */
  public void setBatchRequestObjectData(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap()).get("BatchRequestObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestObjectKeyData(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap()).get("BatchRequestObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestObjectData getBatchRequestObjectData() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  /**
   @deprecated
   */
  public BilledUsageBulkAdjustmentGetOutputData getBilledUsageBulkAdjustmentGetOutputData() {
    return BilledUsageBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setBilledUsageObjectDataArray(BilledUsageObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = BilledUsageObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BilledUsage");
      }
      addInput("BilledUsageList", list);
    }
  }
  /**
   @deprecated
   */
  public void setBilledUsageQueryObjectData(BilledUsageQueryObjectData data) {
    if (data != null) {
      addInput("BilledUsageQuery", BilledUsageQueryObjectHelper.toMap(data, new HashMap()).get("BilledUsageQueryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBulkAdjustmentObjectData(BulkAdjustmentObjectData data) {
    if (data != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(data, new HashMap()).get("BulkAdjustmentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCDFFileName(String data) {
    if (data != null) {
      addInput("CDFFileName", data);
    }
  }
  /**
   @deprecated
   */
  public void setXMLFileName(String data) {
    if (data != null) {
      addInput("XMLFileName", data);
    }
  }
}
