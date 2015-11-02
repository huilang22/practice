/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceAmountGetRequest.java
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
 * Class used to create a InvoiceAmountGetRequest Udt Request
 *
 */

public class InvoiceAmountGetRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a  InvoiceAmountGetRequest
 * @param id Unique request name
 * @param InvoiceAmountGetIn InvoiceObjectKeyData for InvoiceAmountGetRequest
 *
 */
@JsonCreator
  public InvoiceAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectKeyData InvoiceAmountGetIn) {
    super(id, "InvoiceAmountGet");
    if (InvoiceAmountGetIn != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoiceAmountGetIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvoiceAmountObjectData that results from the InvoiceAmountGetRequest call
 * @return InvoiceAmountObjectData resulting from udt call
 *
 */

  public InvoiceAmountObjectData getOutput() {
    return InvoiceAmountObjectHelper.fromMap(outputMap, "InvoiceAmount");
  }
}
