/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePostpaidBilledUsageTotalRequest.java
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
 * Class used to create a InvoicePostpaidBilledUsageTotalRequest Udt Request
 *
 */

public class InvoicePostpaidBilledUsageTotalRequest extends InvoiceRequest {
/**
 *
 * Constructor to create a  InvoicePostpaidBilledUsageTotalRequest
 * @param id Unique request name
 * @param totalBUIn InvoiceObjectKeyData for InvoicePostpaidBilledUsageTotalRequest
 *
 */
@JsonCreator
  public InvoicePostpaidBilledUsageTotalRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectKeyData totalBUIn) {
    super(id, "InvoicePostpaidBilledUsageTotal");
    if (totalBUIn != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(totalBUIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the InvoicePostpaidBilledUsageTotalRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("TotalPostpaidBilledUsage");
  }
}
