/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointTextUpdateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a UsagePointTextUpdateRequest Udt Request
 *
 */

public class UsagePointTextUpdateRequest extends UsagePointTextSubRequestParent {
/**
 *
 * Constructor to create a  UsagePointTextUpdateRequest
 * @param id Unique request name
 * @param UsagePointTextUpdateIn UsagePointTextObjectData for UsagePointTextUpdateRequest
 *
 */
@JsonCreator
  public UsagePointTextUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsagePointText")UsagePointTextObjectData UsagePointTextUpdateIn) {
    super(id, "UsagePointTextUpdate");
    if (UsagePointTextUpdateIn != null) {
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(UsagePointTextUpdateIn, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }

/**
 *
 * Retrieves the UsagePointTextObjectData that results from the UsagePointTextUpdateRequest call
 * @return UsagePointTextObjectData resulting from udt call
 *
 */

  public UsagePointTextObjectData getOutput() {
    return UsagePointTextObjectHelper.fromMap(outputMap, "UsagePointText");
  }
}
