/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionGetRequest.java
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
 * Class used to create a CsrGroupFunctionGetRequest Udt Request
 *
 */

public class CsrGroupFunctionGetRequest extends CsrGroupFunctionSubRequestParent {
/**
 *
 * Constructor to create a  CsrGroupFunctionGetRequest
 * @param id Unique request name
 * @param GFGetIn CsrGroupFunctionObjectKeyData for CsrGroupFunctionGetRequest
 *
 */
@JsonCreator
  public CsrGroupFunctionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrGroupFunction")CsrGroupFunctionObjectKeyData GFGetIn) {
    super(id, "CsrGroupFunctionGet");
    if (GFGetIn != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectKeyHelper.toMap(GFGetIn, new HashMap(), "CsrGroupFunctionObjectKeyData").get("CsrGroupFunctionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CsrGroupFunctionObjectData that results from the CsrGroupFunctionGetRequest call
 * @return CsrGroupFunctionObjectData resulting from udt call
 *
 */

  public CsrGroupFunctionObjectData getOutput() {
    return CsrGroupFunctionObjectHelper.fromMap(outputMap, "CsrGroupFunction");
  }
}
