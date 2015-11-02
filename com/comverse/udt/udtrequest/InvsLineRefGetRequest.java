/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineRefGetRequest.java
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
 * Class used to create a InvsLineRefGetRequest Udt Request
 *
 */

public class InvsLineRefGetRequest extends InvsLineRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsLineRefGetRequest
 * @param id Unique request name
 * @param InvsLineRefGetIn InvsLineRefObjectKeyData for InvsLineRefGetRequest
 *
 */
@JsonCreator
  public InvsLineRefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLineRef")InvsLineRefObjectKeyData InvsLineRefGetIn) {
    super(id, "InvsLineRefGet");
    if (InvsLineRefGetIn != null) {
      addInput("InvsLineRef", InvsLineRefObjectKeyHelper.toMap(InvsLineRefGetIn, new HashMap(), "InvsLineRefObjectKeyData").get("InvsLineRefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsLineRefObjectData that results from the InvsLineRefGetRequest call
 * @return InvsLineRefObjectData resulting from udt call
 *
 */

  public InvsLineRefObjectData getOutput() {
    return InvsLineRefObjectHelper.fromMap(outputMap, "InvsLineRef");
  }
}
