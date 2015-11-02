/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceGetRequest.java
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
 * Class used to create a InvoiceGetRequest Udt Request
 *
 */

public class InvoiceGetRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a  InvoiceGetRequest
 * @param id Unique request name
 * @param InvoicegetIn InvoiceObjectKeyData for InvoiceGetRequest
 *
 */
@JsonCreator
  public InvoiceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectKeyData InvoicegetIn) {
    super(id, "InvoiceGet");
    if (InvoicegetIn != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoicegetIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvoiceObjectData that results from the InvoiceGetRequest call
 * @return InvoiceObjectData resulting from udt call
 *
 */

  public InvoiceObjectData getOutput() {
    return InvoiceObjectHelper.fromMap(outputMap, "Invoice");
  }
}
