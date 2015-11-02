/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePostpaidUnbilledUsageTotalRequest.java
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
 * Class used to create a InvoicePostpaidUnbilledUsageTotalRequest Udt Request
 *
 */

public class InvoicePostpaidUnbilledUsageTotalRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a  InvoicePostpaidUnbilledUsageTotalRequest
 * @param id Unique request name
 * @param account_internalId Integer for InvoicePostpaidUnbilledUsageTotalRequest
 *
 */
@JsonCreator
  public InvoicePostpaidUnbilledUsageTotalRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer account_internalId) {
    super(id, "InvoicePostpaidUnbilledUsageTotal");
    if (account_internalId != null) {
      addInput("AccountInternalId", account_internalId);
    }
  }

/**
 *
 * Retrieves the InvoicePostpaidUnbilledUsageTotalOutputData that results from the InvoicePostpaidUnbilledUsageTotalRequest call
 * @return InvoicePostpaidUnbilledUsageTotalOutputData resulting from udt call
 *
 */

  public InvoicePostpaidUnbilledUsageTotalOutputData getOutput() {
    return InvoicePostpaidUnbilledUsageTotalOutputHelper.fromMap(outputMap);
  }
}
