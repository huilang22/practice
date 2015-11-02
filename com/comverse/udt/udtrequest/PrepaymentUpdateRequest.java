/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentUpdateRequest.java
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
 * Class used to create a PrepaymentUpdateRequest Udt Request
 *
 */

public class PrepaymentUpdateRequest extends PrepaymentSubRequestParent {
/**
 *
 * Constructor to create a  PrepaymentUpdateRequest
 * @param id Unique request name
 * @param prepaymentUpdateIn1 PrepaymentObjectData for PrepaymentUpdateRequest
 * @param _WaiveEpg Integer for PrepaymentUpdateRequest
 *
 */
@JsonCreator
  public PrepaymentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Prepayment")PrepaymentObjectData prepaymentUpdateIn1, @JsonProperty("WaiveEpg")Integer _WaiveEpg) {
    super(id, "PrepaymentUpdate");
    if (prepaymentUpdateIn1 != null) {
      addInput("Prepayment", PrepaymentObjectHelper.toMap(prepaymentUpdateIn1, new HashMap(), "Prepayment").get("Prepayment"));
    }
    if (_WaiveEpg != null) {
      addInput("WaiveEpg", _WaiveEpg);
    }
  }

/**
 *
 * Retrieves the PrepaymentObjectData that results from the PrepaymentUpdateRequest call
 * @return PrepaymentObjectData resulting from udt call
 *
 */

  public PrepaymentObjectData getOutput() {
    return PrepaymentObjectHelper.fromMap(outputMap, "Prepayment");
  }
}
