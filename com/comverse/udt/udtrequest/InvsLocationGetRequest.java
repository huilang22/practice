/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationGetRequest.java
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
 * Class used to create a InvsLocationGetRequest Udt Request
 *
 */

public class InvsLocationGetRequest extends InvsLocationSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationGetRequest
 * @param id Unique request name
 * @param InvsLocationGetIn InvsLocationObjectKeyData for InvsLocationGetRequest
 *
 */
@JsonCreator
  public InvsLocationGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocation")InvsLocationObjectKeyData InvsLocationGetIn) {
    super(id, "InvsLocationGet");
    if (InvsLocationGetIn != null) {
      addInput("InvsLocation", InvsLocationObjectKeyHelper.toMap(InvsLocationGetIn, new HashMap(), "InvsLocationObjectKeyData").get("InvsLocationObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsLocationObjectData that results from the InvsLocationGetRequest call
 * @return InvsLocationObjectData resulting from udt call
 *
 */

  public InvsLocationObjectData getOutput() {
    return InvsLocationObjectHelper.fromMap(outputMap, "InvsLocation");
  }
}
