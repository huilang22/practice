/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsOperatorUpdateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsOperatorUpdateRequest Udt Request
 *
 */

public class InvsOperatorUpdateRequest extends InvsOperatorSubRequestParent {
/**
 *
 * Constructor to create a  InvsOperatorUpdateRequest
 * @param id Unique request name
 * @param InvsOperatorUpdateIn InvsOperatorObjectData for InvsOperatorUpdateRequest
 *
 */
@JsonCreator
  public InvsOperatorUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsOperator")InvsOperatorObjectData InvsOperatorUpdateIn) {
    super(id, "InvsOperatorUpdate");
    if (InvsOperatorUpdateIn != null) {
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(InvsOperatorUpdateIn, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }

/**
 *
 * Retrieves the InvsOperatorObjectData that results from the InvsOperatorUpdateRequest call
 * @return InvsOperatorObjectData resulting from udt call
 *
 */

  public InvsOperatorObjectData getOutput() {
    return InvsOperatorObjectHelper.fromMap(outputMap, "InvsOperator");
  }
}
