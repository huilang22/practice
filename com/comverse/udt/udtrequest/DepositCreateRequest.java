/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositCreateRequest.java
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
 * Class used to create a DepositCreateRequest Udt Request
 *
 */

public class DepositCreateRequest extends DepositSubRequestParent {
/**
 *
 * Constructor to create a  DepositCreateRequest
 * @param id Unique request name
 * @param depositCreateIn DepositObjectData for DepositCreateRequest
 *
 */
@JsonCreator
  public DepositCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Deposit")DepositObjectData depositCreateIn) {
    super(id, "DepositCreate");
    if (depositCreateIn != null) {
      addInput("Deposit", DepositObjectHelper.toMap(depositCreateIn, new HashMap(), "Deposit").get("Deposit"));
    }
  }

/**
 *
 * Retrieves the DepositObjectData that results from the DepositCreateRequest call
 * @return DepositObjectData resulting from udt call
 *
 */

  public DepositObjectData getOutput() {
    return DepositObjectHelper.fromMap(outputMap, "Deposit");
  }
}
