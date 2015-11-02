/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageBulkAdjustmentRequest.java
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
public final class UnbilledUsageBulkAdjustmentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UnbilledUsageBulkAdjustmentRequest (String request, UnbilledUsageBulkAdjustmentRequestMethod method) {
    initialize(request, "UnbilledUsageBulkAdjustment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UnbilledUsageBulkAdjustmentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestForUnbilledUsageBulkAdjustmentCreate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBulkAdjustmentForUnbilledUsageBulkAdjustmentCreate(BulkAdjustmentObjectData data) {
    if (data != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(data, new HashMap(), "BulkAdjustment").get("BulkAdjustment"));
    }
  }
  public void setCDFFileNameForUnbilledUsageBulkAdjustmentCreate(String data) {
    if (data != null) {
      addInput("CDFFileName", data);
    }
  }
  public void setUnbilledUsageForUnbilledUsageBulkAdjustmentCreate(UnbilledUsageObjectData data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageQueryForUnbilledUsageBulkAdjustmentCreate(UnbilledUsageQueryObjectData data) {
    if (data != null) {
      addInput("UnbilledUsageQuery", UnbilledUsageQueryObjectHelper.toMap(data, new HashMap(), "UnbilledUsageQuery").get("UnbilledUsageQuery"));
    }
  }
  public void setXMLFileNameForUnbilledUsageBulkAdjustmentCreate(String data) {
    if (data != null) {
      addInput("XMLFileName", data);
    }
  }
  public void setBatchRequestForUnbilledUsageBulkAdjustmentGet(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBatchRequestForUnbilledUsageBulkAdjustmentUpdate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBulkAdjustmentForUnbilledUsageBulkAdjustmentUpdate(BulkAdjustmentObjectData data) {
    if (data != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(data, new HashMap(), "BulkAdjustment").get("BulkAdjustment"));
    }
  }
  public void setCDFFileNameForUnbilledUsageBulkAdjustmentUpdate(String data) {
    if (data != null) {
      addInput("CDFFileName", data);
    }
  }
  public void setUnbilledUsageForUnbilledUsageBulkAdjustmentUpdate(UnbilledUsageObjectData data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageQueryForUnbilledUsageBulkAdjustmentUpdate(UnbilledUsageQueryObjectData data) {
    if (data != null) {
      addInput("UnbilledUsageQuery", UnbilledUsageQueryObjectHelper.toMap(data, new HashMap(), "UnbilledUsageQuery").get("UnbilledUsageQuery"));
    }
  }
  public void setXMLFileNameForUnbilledUsageBulkAdjustmentUpdate(String data) {
    if (data != null) {
      addInput("XMLFileName", data);
    }
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromUnbilledUsageBulkAdjustmentCreate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public UnbilledUsageBulkAdjustmentGetOutputData getUnbilledUsageBulkAdjustmentGetOutputDataUnbilledUsageBulkAdjustmentGetOutputDataFromUnbilledUsageBulkAdjustmentGet() {
    return UnbilledUsageBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromUnbilledUsageBulkAdjustmentUpdate() {
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
  public UnbilledUsageBulkAdjustmentGetOutputData getUnbilledUsageBulkAdjustmentGetOutputData() {
    return UnbilledUsageBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setUnbilledUsageObjectDataArray(UnbilledUsageObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = UnbilledUsageObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "UnbilledUsage");
      }
      addInput("UnbilledUsageList", list);
    }
  }
  /**
   @deprecated
   */
  public void setUnbilledUsageQueryObjectData(UnbilledUsageQueryObjectData data) {
    if (data != null) {
      addInput("UnbilledUsageQuery", UnbilledUsageQueryObjectHelper.toMap(data, new HashMap()).get("UnbilledUsageQueryObject"));
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
