/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePostpaidProductChargeTotalRequest.java
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
 * Class used to create a InvoicePostpaidProductChargeTotalRequest Udt Request
 *
 */

public class InvoicePostpaidProductChargeTotalRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a  InvoicePostpaidProductChargeTotalRequest
 * @param id Unique request name
 * @param bill_ref_no Integer for InvoicePostpaidProductChargeTotalRequest
 * @param bill_ref_resets Integer for InvoicePostpaidProductChargeTotalRequest
 *
 */
@JsonCreator
  public InvoicePostpaidProductChargeTotalRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillRefNo")Integer bill_ref_no, @JsonProperty("BillRefResets")Integer bill_ref_resets) {
    super(id, "InvoicePostpaidProductChargeTotal");
    if (bill_ref_no != null) {
      addInput("BillRefNo", bill_ref_no);
    }
    if (bill_ref_resets != null) {
      addInput("BillRefResets", bill_ref_resets);
    }
  }

/**
 *
 * Retrieves the InvoicePostpaidProductChargeTotalOutputData that results from the InvoicePostpaidProductChargeTotalRequest call
 * @return InvoicePostpaidProductChargeTotalOutputData resulting from udt call
 *
 */

  public InvoicePostpaidProductChargeTotalOutputData getOutput() {
    return InvoicePostpaidProductChargeTotalOutputHelper.fromMap(outputMap);
  }
}
