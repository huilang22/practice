/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SubscriberGetRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SubscriberGetRequest Udt Request
 *
 */

public class SubscriberGetRequest extends PolicyInstanceSubRequestParent {
/**
 *
 * Constructor to create a  SubscriberGetRequest
 * @param id Unique request name
 * @param SubGetIn GetSubscriberObjectData for SubscriberGetRequest
 *
 */
@JsonCreator
  public SubscriberGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PolicyInstance")GetSubscriberObjectData SubGetIn) {
    super(id, "SubscriberGet");
    if (SubGetIn != null) {
      addInput("PolicyInstance", GetSubscriberObjectHelper.toMap(SubGetIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }

/**
 *
 * Retrieves the SubscriberObjectData that results from the SubscriberGetRequest call
 * @return SubscriberObjectData resulting from udt call
 *
 */

  public SubscriberObjectData getOutput() {
    return SubscriberObjectHelper.fromMap(outputMap, "PolicyInstance");
  }
}
