/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInvoiceDetailAmountGetRequest.java
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
 * Class used to create a BillInvoiceDetailAmountGetRequest Udt Request
 *
 */

public class BillInvoiceDetailAmountGetRequest extends InvoiceDetailSubRequestParent {
/**
 *
 * Constructor to create a  BillInvoiceDetailAmountGetRequest
 * @param id Unique request name
 * @param bill_ref_no Integer for BillInvoiceDetailAmountGetRequest
 * @param bill_ref_resets Integer for BillInvoiceDetailAmountGetRequest
 * @param open_item_id Integer for BillInvoiceDetailAmountGetRequest
 *
 */
@JsonCreator
  public BillInvoiceDetailAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillRefNo")Integer bill_ref_no, @JsonProperty("BillRefResets")Integer bill_ref_resets, @JsonProperty("OpenItemId")Integer open_item_id) {
    super(id, "BillInvoiceDetailAmountGet");
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
 * Retrieves the BillInvoiceDetailAmountObjectData that results from the BillInvoiceDetailAmountGetRequest call
 * @return BillInvoiceDetailAmountObjectData resulting from udt call
 *
 */

  public BillInvoiceDetailAmountObjectData getOutput() {
    return BillInvoiceDetailAmountObjectHelper.fromMap(outputMap, "BillInvoiceDetailAmount");
  }
}
