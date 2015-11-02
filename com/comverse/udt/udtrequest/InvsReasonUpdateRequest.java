/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonUpdateRequest.java
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
 * Class used to create a InvsReasonUpdateRequest Udt Request
 *
 */

public class InvsReasonUpdateRequest extends InvsReasonSubRequestParent {
/**
 *
 * Constructor to create a  InvsReasonUpdateRequest
 * @param id Unique request name
 * @param InvsReasonUpdateIn InvsReasonObjectData for InvsReasonUpdateRequest
 *
 */
@JsonCreator
  public InvsReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsReason")InvsReasonObjectData InvsReasonUpdateIn) {
    super(id, "InvsReasonUpdate");
    if (InvsReasonUpdateIn != null) {
      addInput("InvsReason", InvsReasonObjectHelper.toMap(InvsReasonUpdateIn, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }

/**
 *
 * Retrieves the InvsReasonObjectData that results from the InvsReasonUpdateRequest call
 * @return InvsReasonObjectData resulting from udt call
 *
 */

  public InvsReasonObjectData getOutput() {
    return InvsReasonObjectHelper.fromMap(outputMap, "InvsReason");
  }
}
