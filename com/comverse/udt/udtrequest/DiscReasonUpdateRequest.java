/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscReasonUpdateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DiscReasonUpdateRequest Udt Request
 *
 */

public class DiscReasonUpdateRequest extends DiscReasonSubRequestParent {
/**
 *
 * Constructor to create a  DiscReasonUpdateRequest
 * @param id Unique request name
 * @param DRUpdateIn DiscReasonObjectData for DiscReasonUpdateRequest
 *
 */
@JsonCreator
  public DiscReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscReason")DiscReasonObjectData DRUpdateIn) {
    super(id, "DiscReasonUpdate");
    if (DRUpdateIn != null) {
      addInput("DiscReason", DiscReasonObjectHelper.toMap(DRUpdateIn, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }

/**
 *
 * Retrieves the DiscReasonObjectData that results from the DiscReasonUpdateRequest call
 * @return DiscReasonObjectData resulting from udt call
 *
 */

  public DiscReasonObjectData getOutput() {
    return DiscReasonObjectHelper.fromMap(outputMap, "DiscReason");
  }
}
