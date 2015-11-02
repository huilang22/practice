/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsOperatorGetRequest.java
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
 * Class used to create a InvsOperatorGetRequest Udt Request
 *
 */

public class InvsOperatorGetRequest extends InvsOperatorSubRequestParent {
/**
 *
 * Constructor to create a  InvsOperatorGetRequest
 * @param id Unique request name
 * @param InvsOperatorGetIn InvsOperatorObjectKeyData for InvsOperatorGetRequest
 *
 */
@JsonCreator
  public InvsOperatorGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsOperator")InvsOperatorObjectKeyData InvsOperatorGetIn) {
    super(id, "InvsOperatorGet");
    if (InvsOperatorGetIn != null) {
      addInput("InvsOperator", InvsOperatorObjectKeyHelper.toMap(InvsOperatorGetIn, new HashMap(), "InvsOperatorObjectKeyData").get("InvsOperatorObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsOperatorObjectData that results from the InvsOperatorGetRequest call
 * @return InvsOperatorObjectData resulting from udt call
 *
 */

  public InvsOperatorObjectData getOutput() {
    return InvsOperatorObjectHelper.fromMap(outputMap, "InvsOperator");
  }
}
