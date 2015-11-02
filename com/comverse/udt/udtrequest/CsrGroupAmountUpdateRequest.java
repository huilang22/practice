/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountUpdateRequest.java
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
 * Class used to create a CsrGroupAmountUpdateRequest Udt Request
 *
 */

public class CsrGroupAmountUpdateRequest extends CsrGroupAmountSubRequestParent {
/**
 *
 * Constructor to create a  CsrGroupAmountUpdateRequest
 * @param id Unique request name
 * @param GAUpdateIn CsrGroupAmountObjectData for CsrGroupAmountUpdateRequest
 *
 */
@JsonCreator
  public CsrGroupAmountUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrGroupAmount")CsrGroupAmountObjectData GAUpdateIn) {
    super(id, "CsrGroupAmountUpdate");
    if (GAUpdateIn != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(GAUpdateIn, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }

/**
 *
 * Retrieves the CsrGroupAmountObjectData that results from the CsrGroupAmountUpdateRequest call
 * @return CsrGroupAmountObjectData resulting from udt call
 *
 */

  public CsrGroupAmountObjectData getOutput() {
    return CsrGroupAmountObjectHelper.fromMap(outputMap, "CsrGroupAmount");
  }
}
