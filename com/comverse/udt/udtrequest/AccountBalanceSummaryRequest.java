/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalanceSummaryRequest.java
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
 * Class used to create a AccountBalanceSummaryRequest Udt Request
 *
 */

public class AccountBalanceSummaryRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a  AccountBalanceSummaryRequest
 * @param id Unique request name
 * @param agbsIn AccountObjectKeyData for AccountBalanceSummaryRequest
 *
 */
@JsonCreator
  public AccountBalanceSummaryRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountObjectKeyData agbsIn) {
    super(id, "AccountBalanceSummary");
    if (agbsIn != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(agbsIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountBalanceSummaryOutputData that results from the AccountBalanceSummaryRequest call
 * @return AccountBalanceSummaryOutputData resulting from udt call
 *
 */

  public AccountBalanceSummaryOutputData getOutput() {
    return AccountBalanceSummaryOutputHelper.fromMap(outputMap);
  }
}
