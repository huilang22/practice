/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentCreateRequest.java
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
 * Class used to create a PrepaymentCreateRequest Udt Request
 *
 */

public class PrepaymentCreateRequest extends PrepaymentSubRequestParent {
/**
 *
 * Constructor to create a  PrepaymentCreateRequest
 * @param id Unique request name
 * @param prepaymentCreateIn PrepaymentObjectData for PrepaymentCreateRequest
 * @param WaiveEpg Integer for PrepaymentCreateRequest
 *
 */
@JsonCreator
  public PrepaymentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Prepayment")PrepaymentObjectData prepaymentCreateIn, @JsonProperty("WaiveEpg")Integer WaiveEpg) {
    super(id, "PrepaymentCreate");
    if (prepaymentCreateIn != null) {
      addInput("Prepayment", PrepaymentObjectHelper.toMap(prepaymentCreateIn, new HashMap(), "Prepayment").get("Prepayment"));
    }
    if (WaiveEpg != null) {
      addInput("WaiveEpg", WaiveEpg);
    }
  }

/**
 *
 * Retrieves the PrepaymentObjectData that results from the PrepaymentCreateRequest call
 * @return PrepaymentObjectData resulting from udt call
 *
 */

  public PrepaymentObjectData getOutput() {
    return PrepaymentObjectHelper.fromMap(outputMap, "Prepayment");
  }
}
