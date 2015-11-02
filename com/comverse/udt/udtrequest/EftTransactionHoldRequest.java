/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionHoldRequest.java
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
 * Class used to create a EftTransactionHoldRequest Udt Request
 *
 */

public class EftTransactionHoldRequest extends EftTransactionSubRequestParent {
/**
 *
 * Constructor to create a  EftTransactionHoldRequest
 * @param id Unique request name
 * @param eftHoldIn EftTransactionObjectKeyData for EftTransactionHoldRequest
 *
 */
@JsonCreator
  public EftTransactionHoldRequest(@JsonProperty("RequestId") String id, @JsonProperty("EftTransaction")EftTransactionObjectKeyData eftHoldIn) {
    super(id, "EftTransactionHold");
    if (eftHoldIn != null) {
      addInput("EftTransaction", EftTransactionObjectKeyHelper.toMap(eftHoldIn, new HashMap(), "EftTransactionObjectKeyData").get("EftTransactionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EftTransactionObjectData that results from the EftTransactionHoldRequest call
 * @return EftTransactionObjectData resulting from udt call
 *
 */

  public EftTransactionObjectData getOutput() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
}
