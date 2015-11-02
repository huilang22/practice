/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePrepaidBilledUsageTotalRequest.java
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
 * Class used to create a InvoicePrepaidBilledUsageTotalRequest Udt Request
 *
 */

public class InvoicePrepaidBilledUsageTotalRequest extends InvoiceRequest {
/**
 *
 * Constructor to create a  InvoicePrepaidBilledUsageTotalRequest
 * @param id Unique request name
 * @param totalBUPIn InvoiceObjectKeyData for InvoicePrepaidBilledUsageTotalRequest
 *
 */
@JsonCreator
  public InvoicePrepaidBilledUsageTotalRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectKeyData totalBUPIn) {
    super(id, "InvoicePrepaidBilledUsageTotal");
    if (totalBUPIn != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(totalBUPIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the InvoicePrepaidBilledUsageTotalRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("TotalPrepaidBilledUsage");
  }
}
