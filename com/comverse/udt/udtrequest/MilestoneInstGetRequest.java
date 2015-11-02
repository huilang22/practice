/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstGetRequest.java
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
 * Class used to create a MilestoneInstGetRequest Udt Request
 *
 */

public class MilestoneInstGetRequest extends MilestoneInstSubRequestParent {
/**
 *
 * Constructor to create a  MilestoneInstGetRequest
 * @param id Unique request name
 * @param MilestoneInstGetIn MilestoneInstObjectKeyData for MilestoneInstGetRequest
 *
 */
@JsonCreator
  public MilestoneInstGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneInst")MilestoneInstObjectKeyData MilestoneInstGetIn) {
    super(id, "MilestoneInstGet");
    if (MilestoneInstGetIn != null) {
      addInput("MilestoneInst", MilestoneInstObjectKeyHelper.toMap(MilestoneInstGetIn, new HashMap(), "MilestoneInstObjectKeyData").get("MilestoneInstObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the MilestoneInstObjectData that results from the MilestoneInstGetRequest call
 * @return MilestoneInstObjectData resulting from udt call
 *
 */

  public MilestoneInstObjectData getOutput() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
}
