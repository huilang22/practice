/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonCreateRequest.java
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
 * Class used to create a InvsReasonCreateRequest Udt Request
 *
 */

public class InvsReasonCreateRequest extends InvsReasonSubRequestParent {
/**
 *
 * Constructor to create a  InvsReasonCreateRequest
 * @param id Unique request name
 * @param InvsReasonCreateIn InvsReasonObjectData for InvsReasonCreateRequest
 *
 */
@JsonCreator
  public InvsReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsReason")InvsReasonObjectData InvsReasonCreateIn) {
    super(id, "InvsReasonCreate");
    if (InvsReasonCreateIn != null) {
      addInput("InvsReason", InvsReasonObjectHelper.toMap(InvsReasonCreateIn, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }

/**
 *
 * Retrieves the InvsReasonObjectData that results from the InvsReasonCreateRequest call
 * @return InvsReasonObjectData resulting from udt call
 *
 */

  public InvsReasonObjectData getOutput() {
    return InvsReasonObjectHelper.fromMap(outputMap, "InvsReason");
  }
}
