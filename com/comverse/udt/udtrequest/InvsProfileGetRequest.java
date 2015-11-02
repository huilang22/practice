/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsProfileGetRequest.java
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
 * Class used to create a InvsProfileGetRequest Udt Request
 *
 */

public class InvsProfileGetRequest extends InvsProfileSubRequestParent {
/**
 *
 * Constructor to create a  InvsProfileGetRequest
 * @param id Unique request name
 * @param InvsProfileGetIn InvsProfileObjectKeyData for InvsProfileGetRequest
 *
 */
@JsonCreator
  public InvsProfileGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsProfile")InvsProfileObjectKeyData InvsProfileGetIn) {
    super(id, "InvsProfileGet");
    if (InvsProfileGetIn != null) {
      addInput("InvsProfile", InvsProfileObjectKeyHelper.toMap(InvsProfileGetIn, new HashMap(), "InvsProfileObjectKeyData").get("InvsProfileObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsProfileObjectData that results from the InvsProfileGetRequest call
 * @return InvsProfileObjectData resulting from udt call
 *
 */

  public InvsProfileObjectData getOutput() {
    return InvsProfileObjectHelper.fromMap(outputMap, "InvsProfile");
  }
}
