/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonGetRequest.java
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
 * Class used to create a InvsReasonGetRequest Udt Request
 *
 */

public class InvsReasonGetRequest extends InvsReasonSubRequestParent {
/**
 *
 * Constructor to create a  InvsReasonGetRequest
 * @param id Unique request name
 * @param InvsReasonGetIn InvsReasonObjectKeyData for InvsReasonGetRequest
 *
 */
@JsonCreator
  public InvsReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsReason")InvsReasonObjectKeyData InvsReasonGetIn) {
    super(id, "InvsReasonGet");
    if (InvsReasonGetIn != null) {
      addInput("InvsReason", InvsReasonObjectKeyHelper.toMap(InvsReasonGetIn, new HashMap(), "InvsReasonObjectKeyData").get("InvsReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsReasonObjectData that results from the InvsReasonGetRequest call
 * @return InvsReasonObjectData resulting from udt call
 *
 */

  public InvsReasonObjectData getOutput() {
    return InvsReasonObjectHelper.fromMap(outputMap, "InvsReason");
  }
}
