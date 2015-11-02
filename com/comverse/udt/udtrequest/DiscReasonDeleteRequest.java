/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscReasonDeleteRequest.java
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
 * Class used to create a DiscReasonDeleteRequest Udt Request
 *
 */

public class DiscReasonDeleteRequest extends DiscReasonSubRequestParent {
/**
 *
 * Constructor to create a  DiscReasonDeleteRequest
 * @param id Unique request name
 * @param DRDeleteIn DiscReasonObjectKeyData for DiscReasonDeleteRequest
 *
 */
@JsonCreator
  public DiscReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscReason")DiscReasonObjectKeyData DRDeleteIn) {
    super(id, "DiscReasonDelete");
    if (DRDeleteIn != null) {
      addInput("DiscReason", DiscReasonObjectKeyHelper.toMap(DRDeleteIn, new HashMap(), "DiscReasonObjectKeyData").get("DiscReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DiscReasonObjectData that results from the DiscReasonDeleteRequest call
 * @return DiscReasonObjectData resulting from udt call
 *
 */

  public DiscReasonObjectData getOutput() {
    return DiscReasonObjectHelper.fromMap(outputMap, "DiscReason");
  }
}
