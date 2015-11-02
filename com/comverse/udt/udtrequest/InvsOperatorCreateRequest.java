/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsOperatorCreateRequest.java
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
 * Class used to create a InvsOperatorCreateRequest Udt Request
 *
 */

public class InvsOperatorCreateRequest extends InvsOperatorSubRequestParent {
/**
 *
 * Constructor to create a  InvsOperatorCreateRequest
 * @param id Unique request name
 * @param InvsOperatorCreateIn InvsOperatorObjectData for InvsOperatorCreateRequest
 *
 */
@JsonCreator
  public InvsOperatorCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsOperator")InvsOperatorObjectData InvsOperatorCreateIn) {
    super(id, "InvsOperatorCreate");
    if (InvsOperatorCreateIn != null) {
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(InvsOperatorCreateIn, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }

/**
 *
 * Retrieves the InvsOperatorObjectData that results from the InvsOperatorCreateRequest call
 * @return InvsOperatorObjectData resulting from udt call
 *
 */

  public InvsOperatorObjectData getOutput() {
    return InvsOperatorObjectHelper.fromMap(outputMap, "InvsOperator");
  }
}
