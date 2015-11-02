/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePrepaidUnbilledUsageTotalRequest.java
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
 * Class used to create a InvoicePrepaidUnbilledUsageTotalRequest Udt Request
 *
 */

public class InvoicePrepaidUnbilledUsageTotalRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a  InvoicePrepaidUnbilledUsageTotalRequest
 * @param id Unique request name
 * @param account_internal_id Integer for InvoicePrepaidUnbilledUsageTotalRequest
 *
 */
@JsonCreator
  public InvoicePrepaidUnbilledUsageTotalRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer account_internal_id) {
    super(id, "InvoicePrepaidUnbilledUsageTotal");
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
  }

/**
 *
 * Retrieves the InvoicePrepaidUnbilledUsageTotalOutputData that results from the InvoicePrepaidUnbilledUsageTotalRequest call
 * @return InvoicePrepaidUnbilledUsageTotalOutputData resulting from udt call
 *
 */

  public InvoicePrepaidUnbilledUsageTotalOutputData getOutput() {
    return InvoicePrepaidUnbilledUsageTotalOutputHelper.fromMap(outputMap);
  }
}
