/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillRequestHotRequest.java
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
 * Class used to create a InterimBillRequestHotRequest Udt Request
 *
 */

public class InterimBillRequestHotRequest extends InterimBillSubRequestParent {
/**
 *
 * Constructor to create a  InterimBillRequestHotRequest
 * @param id Unique request name
 * @param intBillHotIn InterimBillObjectData for InterimBillRequestHotRequest
 * @param Hot_Invoice HotInvoiceObjectData for InterimBillRequestHotRequest
 *
 */
@JsonCreator
  public InterimBillRequestHotRequest(@JsonProperty("RequestId") String id, @JsonProperty("InterimBill")InterimBillObjectData intBillHotIn, @JsonProperty("HotInvoice")HotInvoiceObjectData Hot_Invoice) {
    super(id, "InterimBillRequestHot");
    if (intBillHotIn != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(intBillHotIn, new HashMap(), "InterimBill").get("InterimBill"));
    }
    if (Hot_Invoice != null) {
      addInput("HotInvoice", HotInvoiceObjectHelper.toMap(Hot_Invoice, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }

/**
 *
 * Retrieves the InterimBillObjectData that results from the InterimBillRequestHotRequest call
 * @return InterimBillObjectData resulting from udt call
 *
 */

  public InterimBillObjectData getOutput() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
}
