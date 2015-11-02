/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePrepaidProductChargeTotalRequest.java
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
 * Class used to create a InvoicePrepaidProductChargeTotalRequest Udt Request
 *
 */

public class InvoicePrepaidProductChargeTotalRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a  InvoicePrepaidProductChargeTotalRequest
 * @param id Unique request name
 * @param Bill_ref_no Integer for InvoicePrepaidProductChargeTotalRequest
 * @param Bill_ref_resets Integer for InvoicePrepaidProductChargeTotalRequest
 *
 */
@JsonCreator
  public InvoicePrepaidProductChargeTotalRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillRefNo")Integer Bill_ref_no, @JsonProperty("BillRefResets")Integer Bill_ref_resets) {
    super(id, "InvoicePrepaidProductChargeTotal");
    if (Bill_ref_no != null) {
      addInput("BillRefNo", Bill_ref_no);
    }
    if (Bill_ref_resets != null) {
      addInput("BillRefResets", Bill_ref_resets);
    }
  }

/**
 *
 * Retrieves the InvoicePrepaidProductChargeTotalOutputData that results from the InvoicePrepaidProductChargeTotalRequest call
 * @return InvoicePrepaidProductChargeTotalOutputData resulting from udt call
 *
 */

  public InvoicePrepaidProductChargeTotalOutputData getOutput() {
    return InvoicePrepaidProductChargeTotalOutputHelper.fromMap(outputMap);
  }
}
