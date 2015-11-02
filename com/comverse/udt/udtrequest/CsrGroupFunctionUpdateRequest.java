/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionUpdateRequest.java
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
 * Class used to create a CsrGroupFunctionUpdateRequest Udt Request
 *
 */

public class CsrGroupFunctionUpdateRequest extends CsrGroupFunctionSubRequestParent {
/**
 *
 * Constructor to create a  CsrGroupFunctionUpdateRequest
 * @param id Unique request name
 * @param GFUpdateIn CsrGroupFunctionObjectData for CsrGroupFunctionUpdateRequest
 *
 */
@JsonCreator
  public CsrGroupFunctionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrGroupFunction")CsrGroupFunctionObjectData GFUpdateIn) {
    super(id, "CsrGroupFunctionUpdate");
    if (GFUpdateIn != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(GFUpdateIn, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }

/**
 *
 * Retrieves the CsrGroupFunctionObjectData that results from the CsrGroupFunctionUpdateRequest call
 * @return CsrGroupFunctionObjectData resulting from udt call
 *
 */

  public CsrGroupFunctionObjectData getOutput() {
    return CsrGroupFunctionObjectHelper.fromMap(outputMap, "CsrGroupFunction");
  }
}
