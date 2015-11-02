/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailBulkAdjustmentUpdateRequest.java
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
 * Class used to create a InvoiceDetailBulkAdjustmentUpdateRequest Udt Request
 *
 */

public class InvoiceDetailBulkAdjustmentUpdateRequest extends InvoiceDetailBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  InvoiceDetailBulkAdjustmentUpdateRequest
 * @param id Unique request name
 * @param ___BulkAdjustment BulkAdjustmentObjectData for InvoiceDetailBulkAdjustmentUpdateRequest
 * @param _____BatchRequest BatchRequestObjectData for InvoiceDetailBulkAdjustmentUpdateRequest
 * @param _______InvoiceDetail InvoiceDetailObjectData[] for InvoiceDetailBulkAdjustmentUpdateRequest
 * @param ___InvoiceDetailQuery InvoiceDetailQueryObjectData for InvoiceDetailBulkAdjustmentUpdateRequest
 * @param __XMLFileName String for InvoiceDetailBulkAdjustmentUpdateRequest
 * @param __CDFFileName String for InvoiceDetailBulkAdjustmentUpdateRequest
 *
 */
@JsonCreator
  public InvoiceDetailBulkAdjustmentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BulkAdjustment")BulkAdjustmentObjectData ___BulkAdjustment, @JsonProperty("BatchRequest")BatchRequestObjectData _____BatchRequest, @JsonProperty("InvoiceDetail")InvoiceDetailObjectData[] _______InvoiceDetail, @JsonProperty("InvoiceDetailQuery")InvoiceDetailQueryObjectData ___InvoiceDetailQuery, @JsonProperty("XMLFileName")String __XMLFileName, @JsonProperty("CDFFileName")String __CDFFileName) {
    super(id, "InvoiceDetailBulkAdjustmentUpdate");
    if (___BulkAdjustment != null) {
      addInput("BulkAdjustment", BulkAdjustmentObjectHelper.toMap(___BulkAdjustment, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_____BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_____BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_______InvoiceDetail != null) {
      Object[] list = new Object[_______InvoiceDetail.length];
      for (int i = 0; i < _______InvoiceDetail.length; i++) {
        list[i] = InvoiceDetailObjectHelper.getMap(_______InvoiceDetail[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvoiceDetail");
      }
      addInput("InvoiceDetailList", list);
    }
    if (___InvoiceDetailQuery != null) {
      addInput("InvoiceDetailQuery", InvoiceDetailQueryObjectHelper.toMap(___InvoiceDetailQuery, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (__XMLFileName != null) {
      addInput("XMLFileName", __XMLFileName);
    }
    if (__CDFFileName != null) {
      addInput("CDFFileName", __CDFFileName);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the InvoiceDetailBulkAdjustmentUpdateRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
