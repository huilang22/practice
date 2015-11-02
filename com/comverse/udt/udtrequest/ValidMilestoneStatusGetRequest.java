/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusGetRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ValidMilestoneStatusGetRequest Udt Request
 *
 */

public class ValidMilestoneStatusGetRequest extends ValidMilestoneStatusSubRequestParent {
/**
 *
 * Constructor to create a  ValidMilestoneStatusGetRequest
 * @param id Unique request name
 * @param ValidMilestoneStatusGetIn ValidMilestoneStatusObjectKeyData for ValidMilestoneStatusGetRequest
 *
 */
@JsonCreator
  public ValidMilestoneStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ValidMilestoneStatus")ValidMilestoneStatusObjectKeyData ValidMilestoneStatusGetIn) {
    super(id, "ValidMilestoneStatusGet");
    if (ValidMilestoneStatusGetIn != null) {
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectKeyHelper.toMap(ValidMilestoneStatusGetIn, new HashMap(), "ValidMilestoneStatusObjectKeyData").get("ValidMilestoneStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ValidMilestoneStatusObjectData that results from the ValidMilestoneStatusGetRequest call
 * @return ValidMilestoneStatusObjectData resulting from udt call
 *
 */

  public ValidMilestoneStatusObjectData getOutput() {
    return ValidMilestoneStatusObjectHelper.fromMap(outputMap, "ValidMilestoneStatus");
  }
}
