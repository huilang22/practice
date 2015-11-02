/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalanceSummaryNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a AccountBalanceSummaryNoOpRequest Udt Request/Response
 *
 */
public class AccountBalanceSummaryNoOpRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a   AccountBalanceSummaryNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountBalanceSummaryNoOpRequest(String id, AccountBalanceSummaryOutputData noOpIn) {
    super(id, "AccountBalanceSummaryNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountBalanceSummaryOutputData", AccountBalanceSummaryOutputHelper.toMap(noOpIn).get("AccountBalanceSummaryOutputData"));
    }
  }
/**
 *
 * Retrieves the AccountBalanceSummaryOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBalanceSummaryOutputData getOutput() {
    return AccountBalanceSummaryOutputHelper.fromMap(outputMap);
  }
}
