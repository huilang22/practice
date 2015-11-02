/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionGetRequest.java
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
 * Class used to create a EftTransactionGetRequest Udt Request
 *
 */

public class EftTransactionGetRequest extends EftTransactionSubRequestParent {
/**
 *
 * Constructor to create a  EftTransactionGetRequest
 * @param id Unique request name
 * @param eftGetIn EftTransactionObjectKeyData for EftTransactionGetRequest
 *
 */
@JsonCreator
  public EftTransactionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EftTransaction")EftTransactionObjectKeyData eftGetIn) {
    super(id, "EftTransactionGet");
    if (eftGetIn != null) {
      addInput("EftTransaction", EftTransactionObjectKeyHelper.toMap(eftGetIn, new HashMap(), "EftTransactionObjectKeyData").get("EftTransactionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EftTransactionObjectData that results from the EftTransactionGetRequest call
 * @return EftTransactionObjectData resulting from udt call
 *
 */

  public EftTransactionObjectData getOutput() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
}
