/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailGetRequest.java
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
 * Class used to create a InvoiceDetailGetRequest Udt Request
 *
 */

public class InvoiceDetailGetRequest extends InvoiceDetailSubRequestParent {
/**
 *
 * Constructor to create a  InvoiceDetailGetRequest
 * @param id Unique request name
 * @param InvoiceDetailgetIn InvoiceDetailObjectKeyData for InvoiceDetailGetRequest
 *
 */
@JsonCreator
  public InvoiceDetailGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvoiceDetail")InvoiceDetailObjectKeyData InvoiceDetailgetIn) {
    super(id, "InvoiceDetailGet");
    if (InvoiceDetailgetIn != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectKeyHelper.toMap(InvoiceDetailgetIn, new HashMap(), "InvoiceDetailObjectKeyData").get("InvoiceDetailObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvoiceDetailObjectData that results from the InvoiceDetailGetRequest call
 * @return InvoiceDetailObjectData resulting from udt call
 *
 */

  public InvoiceDetailObjectData getOutput() {
    return InvoiceDetailObjectHelper.fromMap(outputMap, "InvoiceDetail");
  }
}
