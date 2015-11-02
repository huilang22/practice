/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffUpdateRequest.java
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
 * Class used to create a BalanceXferDiffUpdateRequest Udt Request
 *
 */

public class BalanceXferDiffUpdateRequest extends BalanceXferDiffSubRequestParent {
/**
 *
 * Constructor to create a  BalanceXferDiffUpdateRequest
 * @param id Unique request name
 * @param BXDUpdateIn BXDObjectData for BalanceXferDiffUpdateRequest
 *
 */
@JsonCreator
  public BalanceXferDiffUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BalanceXferDiff")BXDObjectData BXDUpdateIn) {
    super(id, "BalanceXferDiffUpdate");
    if (BXDUpdateIn != null) {
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(BXDUpdateIn, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }

/**
 *
 * Retrieves the BXDObjectData that results from the BalanceXferDiffUpdateRequest call
 * @return BXDObjectData resulting from udt call
 *
 */

  public BXDObjectData getOutput() {
    return BXDObjectHelper.fromMap(outputMap, "BalanceXferDiff");
  }
}
