/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountGetRequest.java
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
 * Class used to create a CsrGroupAmountGetRequest Udt Request
 *
 */

public class CsrGroupAmountGetRequest extends CsrGroupAmountSubRequestParent {
/**
 *
 * Constructor to create a  CsrGroupAmountGetRequest
 * @param id Unique request name
 * @param GAGetIn CsrGroupAmountObjectKeyData for CsrGroupAmountGetRequest
 *
 */
@JsonCreator
  public CsrGroupAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrGroupAmount")CsrGroupAmountObjectKeyData GAGetIn) {
    super(id, "CsrGroupAmountGet");
    if (GAGetIn != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectKeyHelper.toMap(GAGetIn, new HashMap(), "CsrGroupAmountObjectKeyData").get("CsrGroupAmountObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CsrGroupAmountObjectData that results from the CsrGroupAmountGetRequest call
 * @return CsrGroupAmountObjectData resulting from udt call
 *
 */

  public CsrGroupAmountObjectData getOutput() {
    return CsrGroupAmountObjectHelper.fromMap(outputMap, "CsrGroupAmount");
  }
}
