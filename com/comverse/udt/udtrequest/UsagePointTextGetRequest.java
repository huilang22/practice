/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointTextGetRequest.java
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
 * Class used to create a UsagePointTextGetRequest Udt Request
 *
 */

public class UsagePointTextGetRequest extends UsagePointTextSubRequestParent {
/**
 *
 * Constructor to create a  UsagePointTextGetRequest
 * @param id Unique request name
 * @param UsagePointTextGetIn UsagePointTextObjectKeyData for UsagePointTextGetRequest
 *
 */
@JsonCreator
  public UsagePointTextGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsagePointText")UsagePointTextObjectKeyData UsagePointTextGetIn) {
    super(id, "UsagePointTextGet");
    if (UsagePointTextGetIn != null) {
      addInput("UsagePointText", UsagePointTextObjectKeyHelper.toMap(UsagePointTextGetIn, new HashMap(), "UsagePointTextObjectKeyData").get("UsagePointTextObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsagePointTextObjectData that results from the UsagePointTextGetRequest call
 * @return UsagePointTextObjectData resulting from udt call
 *
 */

  public UsagePointTextObjectData getOutput() {
    return UsagePointTextObjectHelper.fromMap(outputMap, "UsagePointText");
  }
}
