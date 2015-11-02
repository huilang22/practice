/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionCreateRequest.java
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
 * Class used to create a CsrGroupFunctionCreateRequest Udt Request
 *
 */

public class CsrGroupFunctionCreateRequest extends CsrGroupFunctionSubRequestParent {
/**
 *
 * Constructor to create a  CsrGroupFunctionCreateRequest
 * @param id Unique request name
 * @param GFCreateIn CsrGroupFunctionObjectData for CsrGroupFunctionCreateRequest
 *
 */
@JsonCreator
  public CsrGroupFunctionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrGroupFunction")CsrGroupFunctionObjectData GFCreateIn) {
    super(id, "CsrGroupFunctionCreate");
    if (GFCreateIn != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(GFCreateIn, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }

/**
 *
 * Retrieves the CsrGroupFunctionObjectData that results from the CsrGroupFunctionCreateRequest call
 * @return CsrGroupFunctionObjectData resulting from udt call
 *
 */

  public CsrGroupFunctionObjectData getOutput() {
    return CsrGroupFunctionObjectHelper.fromMap(outputMap, "CsrGroupFunction");
  }
}
