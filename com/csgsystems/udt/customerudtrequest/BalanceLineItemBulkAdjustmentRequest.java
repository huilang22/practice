/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceLineItemBulkAdjustmentRequest.java
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
public final class BalanceLineItemBulkAdjustmentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BalanceLineItemBulkAdjustmentRequest (String request, BalanceLineItemBulkAdjustmentRequestMethod method) {
    initialize(request, "BalanceLineItemBulkAdjustment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BalanceLineItemBulkAdjustmentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBalanceLineItemForBalanceLineItemBulkAdjustmentCreate(BalanceLineItemObjectData data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(data, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
  public void setBalanceLineItemQueryForBalanceLineItemBulkAdjustmentCreate(BalanceLineItemQueryObjectData data) {
    if (data != null) {
      addInput("BalanceLineItemQuery", BalanceLineItemQueryObjectHelper.toMap(data, new HashMap(), "BalanceLineItemQuery").get("BalanceLineItemQuery"));
    }
  }
  public void setBatchRequestForBalanceLineItemBulkAdjustmentCreate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBulkAdjustmentForBalanceLineItemBulkAdjustmentCreate(BulkAdjustmentObjectData data) {
    if (data != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(data, new HashMap(), "BulkAdjustment").get("BulkAdjustment"));
    }
  }
  public void setCDFFileNameForBalanceLineItemBulkAdjustmentCreate(String data) {
    if (data != null) {
      addInput("CDFFileName", data);
    }
  }
  public void setXMLFileNameForBalanceLineItemBulkAdjustmentCreate(String data) {
    if (data != null) {
      addInput("XMLFileName", data);
    }
  }
  public void setBatchRequestForBalanceLineItemBulkAdjustmentGet(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBalanceLineItemForBalanceLineItemBulkAdjustmentUpdate(BalanceLineItemObjectData data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(data, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
  public void setBalanceLineItemQueryForBalanceLineItemBulkAdjustmentUpdate(BalanceLineItemQueryObjectData data) {
    if (data != null) {
      addInput("BalanceLineItemQuery", BalanceLineItemQueryObjectHelper.toMap(data, new HashMap(), "BalanceLineItemQuery").get("BalanceLineItemQuery"));
    }
  }
  public void setBatchRequestForBalanceLineItemBulkAdjustmentUpdate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBulkAdjustmentForBalanceLineItemBulkAdjustmentUpdate(BulkAdjustmentObjectData data) {
    if (data != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(data, new HashMap(), "BulkAdjustment").get("BulkAdjustment"));
    }
  }
  public void setCDFFileNameForBalanceLineItemBulkAdjustmentUpdate(String data) {
    if (data != null) {
      addInput("CDFFileName", data);
    }
  }
  public void setXMLFileNameForBalanceLineItemBulkAdjustmentUpdate(String data) {
    if (data != null) {
      addInput("XMLFileName", data);
    }
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBalanceLineItemBulkAdjustmentCreate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BalanceLineItemBulkAdjustmentGetOutputData getBalanceLineItemBulkAdjustmentGetOutputDataBalanceLineItemBulkAdjustmentGetOutputDataFromBalanceLineItemBulkAdjustmentGet() {
    return BalanceLineItemBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBalanceLineItemBulkAdjustmentUpdate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  /**
   @deprecated
   */
  public BalanceLineItemBulkAdjustmentGetOutputData getBalanceLineItemBulkAdjustmentGetOutputData() {
    return BalanceLineItemBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setBalanceLineItemObjectDataArray(BalanceLineItemObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = BalanceLineItemObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BalanceLineItem");
      }
      addInput("BalanceLineItemList", list);
    }
  }
  /**
   @deprecated
   */
  public void setBalanceLineItemQueryObjectData(BalanceLineItemQueryObjectData data) {
    if (data != null) {
      addInput("BalanceLineItemQuery", BalanceLineItemQueryObjectHelper.toMap(data, new HashMap()).get("BalanceLineItemQueryObject"));
    }
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
  public void setXMLFileName(String data) {
    if (data != null) {
      addInput("XMLFileName", data);
    }
  }
}
