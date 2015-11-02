/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffGetRequest.java
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
 * Class used to create a BalanceXferDiffGetRequest Udt Request
 *
 */

public class BalanceXferDiffGetRequest extends BalanceXferDiffSubRequestParent {
/**
 *
 * Constructor to create a  BalanceXferDiffGetRequest
 * @param id Unique request name
 * @param BXDGetIn BXDObjectKeyData for BalanceXferDiffGetRequest
 *
 */
@JsonCreator
  public BalanceXferDiffGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BalanceXferDiff")BXDObjectKeyData BXDGetIn) {
    super(id, "BalanceXferDiffGet");
    if (BXDGetIn != null) {
      addInput("BalanceXferDiff", BXDObjectKeyHelper.toMap(BXDGetIn, new HashMap(), "BXDObjectKeyData").get("BXDObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BXDObjectData that results from the BalanceXferDiffGetRequest call
 * @return BXDObjectData resulting from udt call
 *
 */

  public BXDObjectData getOutput() {
    return BXDObjectHelper.fromMap(outputMap, "BalanceXferDiff");
  }
}
