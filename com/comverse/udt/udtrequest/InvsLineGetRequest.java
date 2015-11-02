/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineGetRequest.java
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
 * Class used to create a InvsLineGetRequest Udt Request
 *
 */

public class InvsLineGetRequest extends InvsLineSubRequestParent {
/**
 *
 * Constructor to create a  InvsLineGetRequest
 * @param id Unique request name
 * @param InvsLineGetIn InvsLineObjectKeyData for InvsLineGetRequest
 *
 */
@JsonCreator
  public InvsLineGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLine")InvsLineObjectKeyData InvsLineGetIn) {
    super(id, "InvsLineGet");
    if (InvsLineGetIn != null) {
      addInput("InvsLine", InvsLineObjectKeyHelper.toMap(InvsLineGetIn, new HashMap(), "InvsLineObjectKeyData").get("InvsLineObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsLineObjectData that results from the InvsLineGetRequest call
 * @return InvsLineObjectData resulting from udt call
 *
 */

  public InvsLineObjectData getOutput() {
    return InvsLineObjectHelper.fromMap(outputMap, "InvsLine");
  }
}
