/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailBulkAdjustmentRequest.java
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
public final class InvoiceDetailBulkAdjustmentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvoiceDetailBulkAdjustmentRequest (String request, InvoiceDetailBulkAdjustmentRequestMethod method) {
    initialize(request, "InvoiceDetailBulkAdjustment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvoiceDetailBulkAdjustmentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestForInvoiceDetailBulkAdjustmentCreate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBulkAdjustmentForInvoiceDetailBulkAdjustmentCreate(BulkAdjustmentObjectData data) {
    if (data != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(data, new HashMap(), "BulkAdjustment").get("BulkAdjustment"));
    }
  }
  public void setCDFFileNameForInvoiceDetailBulkAdjustmentCreate(String data) {
    if (data != null) {
      addInput("CDFFileName", data);
    }
  }
  public void setInvoiceDetailForInvoiceDetailBulkAdjustmentCreate(InvoiceDetailObjectData data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(data, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
  public void setInvoiceDetailQueryForInvoiceDetailBulkAdjustmentCreate(InvoiceDetailQueryObjectData data) {
    if (data != null) {
      addInput("InvoiceDetailQuery", InvoiceDetailQueryObjectHelper.toMap(data, new HashMap(), "InvoiceDetailQuery").get("InvoiceDetailQuery"));
    }
  }
  public void setXMLFileNameForInvoiceDetailBulkAdjustmentCreate(String data) {
    if (data != null) {
      addInput("XMLFileName", data);
    }
  }
  public void setBatchRequestForInvoiceDetailBulkAdjustmentGet(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBatchRequestForInvoiceDetailBulkAdjustmentUpdate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBulkAdjustmentForInvoiceDetailBulkAdjustmentUpdate(BulkAdjustmentObjectData data) {
    if (data != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(data, new HashMap(), "BulkAdjustment").get("BulkAdjustment"));
    }
  }
  public void setCDFFileNameForInvoiceDetailBulkAdjustmentUpdate(String data) {
    if (data != null) {
      addInput("CDFFileName", data);
    }
  }
  public void setInvoiceDetailForInvoiceDetailBulkAdjustmentUpdate(InvoiceDetailObjectData data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(data, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
  public void setInvoiceDetailQueryForInvoiceDetailBulkAdjustmentUpdate(InvoiceDetailQueryObjectData data) {
    if (data != null) {
      addInput("InvoiceDetailQuery", InvoiceDetailQueryObjectHelper.toMap(data, new HashMap(), "InvoiceDetailQuery").get("InvoiceDetailQuery"));
    }
  }
  public void setXMLFileNameForInvoiceDetailBulkAdjustmentUpdate(String data) {
    if (data != null) {
      addInput("XMLFileName", data);
    }
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromInvoiceDetailBulkAdjustmentCreate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public InvoiceDetailBulkAdjustmentGetOutputData getInvoiceDetailBulkAdjustmentGetOutputDataInvoiceDetailBulkAdjustmentGetOutputDataFromInvoiceDetailBulkAdjustmentGet() {
    return InvoiceDetailBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromInvoiceDetailBulkAdjustmentUpdate() {
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
  public InvoiceDetailBulkAdjustmentGetOutputData getInvoiceDetailBulkAdjustmentGetOutputData() {
    return InvoiceDetailBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setInvoiceDetailObjectDataArray(InvoiceDetailObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = InvoiceDetailObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvoiceDetail");
      }
      addInput("InvoiceDetailList", list);
    }
  }
  /**
   @deprecated
   */
  public void setInvoiceDetailQueryObjectData(InvoiceDetailQueryObjectData data) {
    if (data != null) {
      addInput("InvoiceDetailQuery", InvoiceDetailQueryObjectHelper.toMap(data, new HashMap()).get("InvoiceDetailQueryObject"));
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
