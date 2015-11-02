/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstateGetRequest.java
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
 * Class used to create a InvsJobstateGetRequest Udt Request
 *
 */

public class InvsJobstateGetRequest extends InvsJobstateSubRequestParent {
/**
 *
 * Constructor to create a  InvsJobstateGetRequest
 * @param id Unique request name
 * @param InvsJobstateGetIn InvsJobstateObjectKeyData for InvsJobstateGetRequest
 *
 */
@JsonCreator
  public InvsJobstateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsJobstate")InvsJobstateObjectKeyData InvsJobstateGetIn) {
    super(id, "InvsJobstateGet");
    if (InvsJobstateGetIn != null) {
      addInput("InvsJobstate", InvsJobstateObjectKeyHelper.toMap(InvsJobstateGetIn, new HashMap(), "InvsJobstateObjectKeyData").get("InvsJobstateObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsJobstateObjectData that results from the InvsJobstateGetRequest call
 * @return InvsJobstateObjectData resulting from udt call
 *
 */

  public InvsJobstateObjectData getOutput() {
    return InvsJobstateObjectHelper.fromMap(outputMap, "InvsJobstate");
  }
}
