/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountDeleteRequest.java
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
 * Class used to create a CsrGroupAmountDeleteRequest Udt Request
 *
 */

public class CsrGroupAmountDeleteRequest extends CsrGroupAmountSubRequestParent {
/**
 *
 * Constructor to create a  CsrGroupAmountDeleteRequest
 * @param id Unique request name
 * @param GADeleteIn CsrGroupAmountObjectKeyData for CsrGroupAmountDeleteRequest
 *
 */
@JsonCreator
  public CsrGroupAmountDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrGroupAmount")CsrGroupAmountObjectKeyData GADeleteIn) {
    super(id, "CsrGroupAmountDelete");
    if (GADeleteIn != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectKeyHelper.toMap(GADeleteIn, new HashMap(), "CsrGroupAmountObjectKeyData").get("CsrGroupAmountObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CsrGroupAmountObjectData that results from the CsrGroupAmountDeleteRequest call
 * @return CsrGroupAmountObjectData resulting from udt call
 *
 */

  public CsrGroupAmountObjectData getOutput() {
    return CsrGroupAmountObjectHelper.fromMap(outputMap, "CsrGroupAmount");
  }
}
