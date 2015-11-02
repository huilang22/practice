/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountCreateRequest.java
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
 * Class used to create a CsrGroupAmountCreateRequest Udt Request
 *
 */

public class CsrGroupAmountCreateRequest extends CsrGroupAmountSubRequestParent {
/**
 *
 * Constructor to create a  CsrGroupAmountCreateRequest
 * @param id Unique request name
 * @param GACreateIn CsrGroupAmountObjectData for CsrGroupAmountCreateRequest
 *
 */
@JsonCreator
  public CsrGroupAmountCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrGroupAmount")CsrGroupAmountObjectData GACreateIn) {
    super(id, "CsrGroupAmountCreate");
    if (GACreateIn != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(GACreateIn, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }

/**
 *
 * Retrieves the CsrGroupAmountObjectData that results from the CsrGroupAmountCreateRequest call
 * @return CsrGroupAmountObjectData resulting from udt call
 *
 */

  public CsrGroupAmountObjectData getOutput() {
    return CsrGroupAmountObjectHelper.fromMap(outputMap, "CsrGroupAmount");
  }
}
