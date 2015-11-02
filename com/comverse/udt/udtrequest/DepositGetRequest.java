/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositGetRequest.java
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
 * Class used to create a DepositGetRequest Udt Request
 *
 */

public class DepositGetRequest extends DepositSubRequestParent {
/**
 *
 * Constructor to create a  DepositGetRequest
 * @param id Unique request name
 * @param depositGetIn DepositObjectKeyData for DepositGetRequest
 *
 */
@JsonCreator
  public DepositGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Deposit")DepositObjectKeyData depositGetIn) {
    super(id, "DepositGet");
    if (depositGetIn != null) {
      addInput("Deposit", DepositObjectKeyHelper.toMap(depositGetIn, new HashMap(), "DepositObjectKeyData").get("DepositObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DepositObjectData that results from the DepositGetRequest call
 * @return DepositObjectData resulting from udt call
 *
 */

  public DepositObjectData getOutput() {
    return DepositObjectHelper.fromMap(outputMap, "Deposit");
  }
}
