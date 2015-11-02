/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneGetRequest.java
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
 * Class used to create a MilestoneGetRequest Udt Request
 *
 */

public class MilestoneGetRequest extends MilestoneSubRequestParent {
/**
 *
 * Constructor to create a  MilestoneGetRequest
 * @param id Unique request name
 * @param MilestoneGetIn MilestoneObjectKeyData for MilestoneGetRequest
 *
 */
@JsonCreator
  public MilestoneGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Milestone")MilestoneObjectKeyData MilestoneGetIn) {
    super(id, "MilestoneGet");
    if (MilestoneGetIn != null) {
      addInput("Milestone", MilestoneObjectKeyHelper.toMap(MilestoneGetIn, new HashMap(), "MilestoneObjectKeyData").get("MilestoneObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the MilestoneObjectData that results from the MilestoneGetRequest call
 * @return MilestoneObjectData resulting from udt call
 *
 */

  public MilestoneObjectData getOutput() {
    return MilestoneObjectHelper.fromMap(outputMap, "Milestone");
  }
}
