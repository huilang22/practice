/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigGetRequest.java
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
 * Class used to create a InvsSimCardConfigGetRequest Udt Request
 *
 */

public class InvsSimCardConfigGetRequest extends InvsSimCardConfigSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimCardConfigGetRequest
 * @param id Unique request name
 * @param InvsSimCardConfigGetIn InvsSimCardConfigObjectKeyData for InvsSimCardConfigGetRequest
 *
 */
@JsonCreator
  public InvsSimCardConfigGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimCardConfig")InvsSimCardConfigObjectKeyData InvsSimCardConfigGetIn) {
    super(id, "InvsSimCardConfigGet");
    if (InvsSimCardConfigGetIn != null) {
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectKeyHelper.toMap(InvsSimCardConfigGetIn, new HashMap(), "InvsSimCardConfigObjectKeyData").get("InvsSimCardConfigObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsSimCardConfigObjectData that results from the InvsSimCardConfigGetRequest call
 * @return InvsSimCardConfigObjectData resulting from udt call
 *
 */

  public InvsSimCardConfigObjectData getOutput() {
    return InvsSimCardConfigObjectHelper.fromMap(outputMap, "InvsSimCardConfig");
  }
}
