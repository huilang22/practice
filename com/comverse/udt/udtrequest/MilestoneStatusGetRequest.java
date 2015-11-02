/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusGetRequest.java
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
 * Class used to create a MilestoneStatusGetRequest Udt Request
 *
 */

public class MilestoneStatusGetRequest extends MilestoneStatusSubRequestParent {
/**
 *
 * Constructor to create a  MilestoneStatusGetRequest
 * @param id Unique request name
 * @param MilestoneStatusGetIn MilestoneStatusObjectKeyData for MilestoneStatusGetRequest
 *
 */
@JsonCreator
  public MilestoneStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneStatus")MilestoneStatusObjectKeyData MilestoneStatusGetIn) {
    super(id, "MilestoneStatusGet");
    if (MilestoneStatusGetIn != null) {
      addInput("MilestoneStatus", MilestoneStatusObjectKeyHelper.toMap(MilestoneStatusGetIn, new HashMap(), "MilestoneStatusObjectKeyData").get("MilestoneStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the MilestoneStatusObjectData that results from the MilestoneStatusGetRequest call
 * @return MilestoneStatusObjectData resulting from udt call
 *
 */

  public MilestoneStatusObjectData getOutput() {
    return MilestoneStatusObjectHelper.fromMap(outputMap, "MilestoneStatus");
  }
}
