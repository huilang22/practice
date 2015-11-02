/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstryGetRequest.java
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
 * Class used to create a MilestoneInstHstryGetRequest Udt Request
 *
 */

public class MilestoneInstHstryGetRequest extends MilestoneInstHstrySubRequestParent {
/**
 *
 * Constructor to create a  MilestoneInstHstryGetRequest
 * @param id Unique request name
 * @param MilestoneInstHstryGetIn MilestoneInstHstryObjectKeyData for MilestoneInstHstryGetRequest
 *
 */
@JsonCreator
  public MilestoneInstHstryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneInstHstry")MilestoneInstHstryObjectKeyData MilestoneInstHstryGetIn) {
    super(id, "MilestoneInstHstryGet");
    if (MilestoneInstHstryGetIn != null) {
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectKeyHelper.toMap(MilestoneInstHstryGetIn, new HashMap(), "MilestoneInstHstryObjectKeyData").get("MilestoneInstHstryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the MilestoneInstHstryObjectData that results from the MilestoneInstHstryGetRequest call
 * @return MilestoneInstHstryObjectData resulting from udt call
 *
 */

  public MilestoneInstHstryObjectData getOutput() {
    return MilestoneInstHstryObjectHelper.fromMap(outputMap, "MilestoneInstHstry");
  }
}
