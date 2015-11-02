/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRefGetRequest.java
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
 * Class used to create a InvsSimCardConfigRefGetRequest Udt Request
 *
 */

public class InvsSimCardConfigRefGetRequest extends InvsSimCardConfigRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimCardConfigRefGetRequest
 * @param id Unique request name
 * @param InvsSimCardConfigRefGetIn InvsSimCardConfigRefObjectKeyData for InvsSimCardConfigRefGetRequest
 *
 */
@JsonCreator
  public InvsSimCardConfigRefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimCardConfigRef")InvsSimCardConfigRefObjectKeyData InvsSimCardConfigRefGetIn) {
    super(id, "InvsSimCardConfigRefGet");
    if (InvsSimCardConfigRefGetIn != null) {
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectKeyHelper.toMap(InvsSimCardConfigRefGetIn, new HashMap(), "InvsSimCardConfigRefObjectKeyData").get("InvsSimCardConfigRefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsSimCardConfigRefObjectData that results from the InvsSimCardConfigRefGetRequest call
 * @return InvsSimCardConfigRefObjectData resulting from udt call
 *
 */

  public InvsSimCardConfigRefObjectData getOutput() {
    return InvsSimCardConfigRefObjectHelper.fromMap(outputMap, "InvsSimCardConfigRef");
  }
}
