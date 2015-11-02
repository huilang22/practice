/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionDeleteRequest.java
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
 * Class used to create a CsrGroupFunctionDeleteRequest Udt Request
 *
 */

public class CsrGroupFunctionDeleteRequest extends CsrGroupFunctionSubRequestParent {
/**
 *
 * Constructor to create a  CsrGroupFunctionDeleteRequest
 * @param id Unique request name
 * @param GFDeleteIn CsrGroupFunctionObjectKeyData for CsrGroupFunctionDeleteRequest
 *
 */
@JsonCreator
  public CsrGroupFunctionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrGroupFunction")CsrGroupFunctionObjectKeyData GFDeleteIn) {
    super(id, "CsrGroupFunctionDelete");
    if (GFDeleteIn != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectKeyHelper.toMap(GFDeleteIn, new HashMap(), "CsrGroupFunctionObjectKeyData").get("CsrGroupFunctionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CsrGroupFunctionObjectData that results from the CsrGroupFunctionDeleteRequest call
 * @return CsrGroupFunctionObjectData resulting from udt call
 *
 */

  public CsrGroupFunctionObjectData getOutput() {
    return CsrGroupFunctionObjectHelper.fromMap(outputMap, "CsrGroupFunction");
  }
}
