/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailBulkAdjustmentCreateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvoiceDetailBulkAdjustmentCreateRequest Udt Request
 *
 */

public class InvoiceDetailBulkAdjustmentCreateRequest extends InvoiceDetailBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  InvoiceDetailBulkAdjustmentCreateRequest
 * @param id Unique request name
 * @param _BulkAdjustment BulkAdjustmentObjectData for InvoiceDetailBulkAdjustmentCreateRequest
 * @param _BatchRequest BatchRequestObjectData for InvoiceDetailBulkAdjustmentCreateRequest
 * @param ____InvoiceDetail InvoiceDetailObjectData[] for InvoiceDetailBulkAdjustmentCreateRequest
 * @param _InvoiceDetailQuery InvoiceDetailQueryObjectData for InvoiceDetailBulkAdjustmentCreateRequest
 * @param XMLFileName String for InvoiceDetailBulkAdjustmentCreateRequest
 * @param CDFFileName String for InvoiceDetailBulkAdjustmentCreateRequest
 *
 */
@JsonCreator
  public InvoiceDetailBulkAdjustmentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BulkAdjustment")BulkAdjustmentObjectData _BulkAdjustment, @JsonProperty("BatchRequest")BatchRequestObjectData _BatchRequest, @JsonProperty("InvoiceDetail")InvoiceDetailObjectData[] ____InvoiceDetail, @JsonProperty("InvoiceDetailQuery")InvoiceDetailQueryObjectData _InvoiceDetailQuery, @JsonProperty("XMLFileName")String XMLFileName, @JsonProperty("CDFFileName")String CDFFileName) {
    super(id, "InvoiceDetailBulkAdjustmentCreate");
    if (_BulkAdjustment != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(_BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (____InvoiceDetail != null) {
      Object[] list = new Object[____InvoiceDetail.length];
      for (int i = 0; i < ____InvoiceDetail.length; i++) {
        list[i] = InvoiceDetailObjectHelper.getMap(____InvoiceDetail[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvoiceDetail");
      }
      addInput("InvoiceDetailList", list);
    }
    if (_InvoiceDetailQuery != null) {
      addInput("InvoiceDetailQuery", InvoiceDetailQueryObjectHelper.toMap(_InvoiceDetailQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (XMLFileName != null) {
      addInput("XMLFileName", XMLFileName);
    }
    if (CDFFileName != null) {
      addInput("CDFFileName", CDFFileName);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the InvoiceDetailBulkAdjustmentCreateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
