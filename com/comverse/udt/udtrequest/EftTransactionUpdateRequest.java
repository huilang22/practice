/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionUpdateRequest.java
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
 * Class used to create a EftTransactionUpdateRequest Udt Request
 *
 */

public class EftTransactionUpdateRequest extends EftTransactionSubRequestParent {
/**
 *
 * Constructor to create a  EftTransactionUpdateRequest
 * @param id Unique request name
 * @param eftUpdateIn EftTransactionObjectData for EftTransactionUpdateRequest
 *
 */
@JsonCreator
  public EftTransactionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EftTransaction")EftTransactionObjectData eftUpdateIn) {
    super(id, "EftTransactionUpdate");
    if (eftUpdateIn != null) {
      addInput("EftTransaction", EftTransactionObjectHelper.toMap(eftUpdateIn, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }

/**
 *
 * Retrieves the EftTransactionObjectData that results from the EftTransactionUpdateRequest call
 * @return EftTransactionObjectData resulting from udt call
 *
 */

  public EftTransactionObjectData getOutput() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
}
