/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffCreateRequest.java
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
 * Class used to create a BalanceXferDiffCreateRequest Udt Request
 *
 */

public class BalanceXferDiffCreateRequest extends BalanceXferDiffSubRequestParent {
/**
 *
 * Constructor to create a  BalanceXferDiffCreateRequest
 * @param id Unique request name
 * @param BXDCreateIn BXDObjectData for BalanceXferDiffCreateRequest
 *
 */
@JsonCreator
  public BalanceXferDiffCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BalanceXferDiff")BXDObjectData BXDCreateIn) {
    super(id, "BalanceXferDiffCreate");
    if (BXDCreateIn != null) {
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(BXDCreateIn, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }

/**
 *
 * Retrieves the BXDObjectData that results from the BalanceXferDiffCreateRequest call
 * @return BXDObjectData resulting from udt call
 *
 */

  public BXDObjectData getOutput() {
    return BXDObjectHelper.fromMap(outputMap, "BalanceXferDiff");
  }
}
