/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceAdjustmentTotalGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvoiceAdjustmentTotalGetRequest Udt Request
 *
 */

public class InvoiceAdjustmentTotalGetRequest extends AdjustmentRequest {
/**
 *
 * Constructor to create a  InvoiceAdjustmentTotalGetRequest
 * @param id Unique request name
 * @param bill_ref_no Integer for InvoiceAdjustmentTotalGetRequest
 * @param bill_ref_resets Integer for InvoiceAdjustmentTotalGetRequest
 * @param open_item_id Integer for InvoiceAdjustmentTotalGetRequest
 *
 */
@JsonCreator
  public InvoiceAdjustmentTotalGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillRefNo")Integer bill_ref_no, @JsonProperty("BillRefResets")Integer bill_ref_resets, @JsonProperty("OpenItemId")Integer open_item_id) {
    super(id, "InvoiceAdjustmentTotalGet");
    if (bill_ref_no != null) {
      addInput("BillRefNo", bill_ref_no);
    }
    if (bill_ref_resets != null) {
      addInput("BillRefResets", bill_ref_resets);
    }
    if (open_item_id != null) {
      addInput("OpenItemId", open_item_id);
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the InvoiceAdjustmentTotalGetRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("TotalAmount");
  }
}
