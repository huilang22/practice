/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceSummaryGetRequest.java
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
 * Class used to create a InvoiceSummaryGetRequest Udt Request
 *
 */

public class InvoiceSummaryGetRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a  InvoiceSummaryGetRequest
 * @param id Unique request name
 * @param InvoiceSumgetIn InvoiceObjectKeyData for InvoiceSummaryGetRequest
 *
 */
@JsonCreator
  public InvoiceSummaryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectKeyData InvoiceSumgetIn) {
    super(id, "InvoiceSummaryGet");
    if (InvoiceSumgetIn != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoiceSumgetIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvoiceSummaryObjectData that results from the InvoiceSummaryGetRequest call
 * @return InvoiceSummaryObjectData resulting from udt call
 *
 */

  public InvoiceSummaryObjectData getOutput() {
    return InvoiceSummaryObjectHelper.fromMap(outputMap, "InvoiceSummary");
  }
}
