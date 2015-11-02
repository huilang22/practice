/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointTextCreateRequest.java
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
 * Class used to create a UsagePointTextCreateRequest Udt Request
 *
 */

public class UsagePointTextCreateRequest extends UsagePointTextSubRequestParent {
/**
 *
 * Constructor to create a  UsagePointTextCreateRequest
 * @param id Unique request name
 * @param UsagePointTextCreateIn UsagePointTextObjectData for UsagePointTextCreateRequest
 *
 */
@JsonCreator
  public UsagePointTextCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsagePointText")UsagePointTextObjectData UsagePointTextCreateIn) {
    super(id, "UsagePointTextCreate");
    if (UsagePointTextCreateIn != null) {
      addInput("UsagePointText", UsagePointTextObjectHelper.toMap(UsagePointTextCreateIn, new HashMap(), "UsagePointText").get("UsagePointText"));
    }
  }

/**
 *
 * Retrieves the UsagePointTextObjectData that results from the UsagePointTextCreateRequest call
 * @return UsagePointTextObjectData resulting from udt call
 *
 */

  public UsagePointTextObjectData getOutput() {
    return UsagePointTextObjectHelper.fromMap(outputMap, "UsagePointText");
  }
}
