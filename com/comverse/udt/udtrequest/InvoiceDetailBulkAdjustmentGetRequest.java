/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailBulkAdjustmentGetRequest.java
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
 * Class used to create a InvoiceDetailBulkAdjustmentGetRequest Udt Request
 *
 */

public class InvoiceDetailBulkAdjustmentGetRequest extends InvoiceDetailBulkAdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  InvoiceDetailBulkAdjustmentGetRequest
 * @param id Unique request name
 * @param ___BatchRequest BatchRequestObjectKeyData for InvoiceDetailBulkAdjustmentGetRequest
 *
 */
@JsonCreator
  public InvoiceDetailBulkAdjustmentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData ___BatchRequest) {
    super(id, "InvoiceDetailBulkAdjustmentGet");
    if (___BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(___BatchRequest, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvoiceDetailBulkAdjustmentGetOutputData that results from the InvoiceDetailBulkAdjustmentGetRequest call
 * @return InvoiceDetailBulkAdjustmentGetOutputData resulting from udt call
 *
 */

  public InvoiceDetailBulkAdjustmentGetOutputData getOutput() {
    return InvoiceDetailBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
}
