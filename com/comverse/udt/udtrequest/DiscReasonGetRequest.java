/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscReasonGetRequest.java
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
 * Class used to create a DiscReasonGetRequest Udt Request
 *
 */

public class DiscReasonGetRequest extends DiscReasonSubRequestParent {
/**
 *
 * Constructor to create a  DiscReasonGetRequest
 * @param id Unique request name
 * @param DRGetIn DiscReasonObjectKeyData for DiscReasonGetRequest
 *
 */
@JsonCreator
  public DiscReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscReason")DiscReasonObjectKeyData DRGetIn) {
    super(id, "DiscReasonGet");
    if (DRGetIn != null) {
      addInput("DiscReason", DiscReasonObjectKeyHelper.toMap(DRGetIn, new HashMap(), "DiscReasonObjectKeyData").get("DiscReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DiscReasonObjectData that results from the DiscReasonGetRequest call
 * @return DiscReasonObjectData resulting from udt call
 *
 */

  public DiscReasonObjectData getOutput() {
    return DiscReasonObjectHelper.fromMap(outputMap, "DiscReason");
  }
}
