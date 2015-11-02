/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailAmountGetRequest.java
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
 * Class used to create a InvoiceDetailAmountGetRequest Udt Request
 *
 */

public class InvoiceDetailAmountGetRequest extends InvoiceDetailRequest {
/**
 *
 * Constructor to create a  InvoiceDetailAmountGetRequest
 * @param id Unique request name
 * @param InvoiceDetailAmountIn InvoiceDetailObjectKeyData for InvoiceDetailAmountGetRequest
 *
 */
@JsonCreator
  public InvoiceDetailAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvoiceDetail")InvoiceDetailObjectKeyData InvoiceDetailAmountIn) {
    super(id, "InvoiceDetailAmountGet");
    if (InvoiceDetailAmountIn != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectKeyHelper.toMap(InvoiceDetailAmountIn, new HashMap(), "InvoiceDetailObjectKeyData").get("InvoiceDetailObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the InvoiceDetailAmountGetRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("AdjustmentEligibleAmount");
  }
}
