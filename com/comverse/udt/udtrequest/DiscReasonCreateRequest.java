/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscReasonCreateRequest.java
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
 * Class used to create a DiscReasonCreateRequest Udt Request
 *
 */

public class DiscReasonCreateRequest extends DiscReasonSubRequestParent {
/**
 *
 * Constructor to create a  DiscReasonCreateRequest
 * @param id Unique request name
 * @param DRCreateIn DiscReasonObjectData for DiscReasonCreateRequest
 *
 */
@JsonCreator
  public DiscReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscReason")DiscReasonObjectData DRCreateIn) {
    super(id, "DiscReasonCreate");
    if (DRCreateIn != null) {
      addInput("DiscReason", DiscReasonObjectHelper.toMap(DRCreateIn, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }

/**
 *
 * Retrieves the DiscReasonObjectData that results from the DiscReasonCreateRequest call
 * @return DiscReasonObjectData resulting from udt call
 *
 */

  public DiscReasonObjectData getOutput() {
    return DiscReasonObjectHelper.fromMap(outputMap, "DiscReason");
  }
}
