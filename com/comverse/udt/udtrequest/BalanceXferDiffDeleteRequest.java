/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffDeleteRequest.java
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
 * Class used to create a BalanceXferDiffDeleteRequest Udt Request
 *
 */

public class BalanceXferDiffDeleteRequest extends BalanceXferDiffSubRequestParent {
/**
 *
 * Constructor to create a  BalanceXferDiffDeleteRequest
 * @param id Unique request name
 * @param BXDDeleteIn BXDObjectKeyData for BalanceXferDiffDeleteRequest
 *
 */
@JsonCreator
  public BalanceXferDiffDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BalanceXferDiff")BXDObjectKeyData BXDDeleteIn) {
    super(id, "BalanceXferDiffDelete");
    if (BXDDeleteIn != null) {
      addInput("BalanceXferDiff", BXDObjectKeyHelper.toMap(BXDDeleteIn, new HashMap(), "BXDObjectKeyData").get("BXDObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BXDObjectData that results from the BalanceXferDiffDeleteRequest call
 * @return BXDObjectData resulting from udt call
 *
 */

  public BXDObjectData getOutput() {
    return BXDObjectHelper.fromMap(outputMap, "BalanceXferDiff");
  }
}
