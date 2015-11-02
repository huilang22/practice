/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HierarchyRTUnitCreditBalanceQueryRequest.java
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
 * Class used to create a HierarchyRTUnitCreditBalanceQueryRequest Udt Request
 *
 */

public class HierarchyRTUnitCreditBalanceQueryRequest extends RTUnitCreditBalanceSubRequestParent {
/**
 *
 * Constructor to create a  HierarchyRTUnitCreditBalanceQueryRequest
 * @param id Unique request name
 * @param account_internal_id Integer for HierarchyRTUnitCreditBalanceQueryRequest
 * @param Granularity Integer for HierarchyRTUnitCreditBalanceQueryRequest
 *
 */
@JsonCreator
  public HierarchyRTUnitCreditBalanceQueryRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer account_internal_id, @JsonProperty("Granularity")Integer Granularity) {
    super(id, "HierarchyRTUnitCreditBalanceQuery");
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (Granularity != null) {
      addInput("Granularity", Granularity);
    }
  }

/**
 *
 * Retrieves the HierarchyRTUnitCreditBalanceQueryOutputData that results from the HierarchyRTUnitCreditBalanceQueryRequest call
 * @return HierarchyRTUnitCreditBalanceQueryOutputData resulting from udt call
 *
 */

  public HierarchyRTUnitCreditBalanceQueryOutputData getOutput() {
    return HierarchyRTUnitCreditBalanceQueryOutputHelper.fromMap(outputMap);
  }
}
