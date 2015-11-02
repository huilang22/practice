/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceReissueGetRequest.java
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
 * Class used to create a InvoiceReissueGetRequest Udt Request
 *
 */

public class InvoiceReissueGetRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a  InvoiceReissueGetRequest
 * @param id Unique request name
 * @param InvoiceRgetIn InvoiceObjectKeyData for InvoiceReissueGetRequest
 *
 */
@JsonCreator
  public InvoiceReissueGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectKeyData InvoiceRgetIn) {
    super(id, "InvoiceReissueGet");
    if (InvoiceRgetIn != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoiceRgetIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvoiceObjectData that results from the InvoiceReissueGetRequest call
 * @return InvoiceObjectData resulting from udt call
 *
 */

  public InvoiceObjectData getOutput() {
    return InvoiceObjectHelper.fromMap(outputMap, "Invoice");
  }
}
