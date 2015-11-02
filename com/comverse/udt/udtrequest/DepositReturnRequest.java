/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositReturnRequest.java
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
 * Class used to create a DepositReturnRequest Udt Request
 *
 */

public class DepositReturnRequest extends DepositSubRequestParent {
/**
 *
 * Constructor to create a  DepositReturnRequest
 * @param id Unique request name
 * @param depositReturnIn DepositObjectData for DepositReturnRequest
 *
 */
@JsonCreator
  public DepositReturnRequest(@JsonProperty("RequestId") String id, @JsonProperty("Deposit")DepositObjectData depositReturnIn) {
    super(id, "DepositReturn");
    if (depositReturnIn != null) {
      addInput("Deposit", DepositObjectHelper.toMap(depositReturnIn, new HashMap(), "Deposit").get("Deposit"));
    }
  }

/**
 *
 * Retrieves the DepositObjectData that results from the DepositReturnRequest call
 * @return DepositObjectData resulting from udt call
 *
 */

  public DepositObjectData getOutput() {
    return DepositObjectHelper.fromMap(outputMap, "Deposit");
  }
}
