/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusGetRequest.java
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
 * Class used to create a InvsStatusGetRequest Udt Request
 *
 */

public class InvsStatusGetRequest extends InvsStatusSubRequestParent {
/**
 *
 * Constructor to create a  InvsStatusGetRequest
 * @param id Unique request name
 * @param InvsStatusGetIn InvsStatusObjectKeyData for InvsStatusGetRequest
 *
 */
@JsonCreator
  public InvsStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStatus")InvsStatusObjectKeyData InvsStatusGetIn) {
    super(id, "InvsStatusGet");
    if (InvsStatusGetIn != null) {
      addInput("InvsStatus", InvsStatusObjectKeyHelper.toMap(InvsStatusGetIn, new HashMap(), "InvsStatusObjectKeyData").get("InvsStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsStatusObjectData that results from the InvsStatusGetRequest call
 * @return InvsStatusObjectData resulting from udt call
 *
 */

  public InvsStatusObjectData getOutput() {
    return InvsStatusObjectHelper.fromMap(outputMap, "InvsStatus");
  }
}
