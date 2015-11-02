/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberUpdateCosesRequest.java
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
 * Class used to create a MIHSubscriberUpdateCosesRequest Udt Request
 *
 */

public class MIHSubscriberUpdateCosesRequest extends MIHSubscriberRequest {
/**
 *
 * Constructor to create a  MIHSubscriberUpdateCosesRequest
 * @param id Unique request name
 * @param MIHSUIn MIHUpdateSubscriberObjectData for MIHSubscriberUpdateCosesRequest
 * @param ___msisdn String for MIHSubscriberUpdateCosesRequest
 *
 */
@JsonCreator
  public MIHSubscriberUpdateCosesRequest(@JsonProperty("RequestId") String id, @JsonProperty("MIHSubscriber")MIHUpdateSubscriberObjectData MIHSUIn, @JsonProperty("Msisdn")String ___msisdn) {
    super(id, "MIHSubscriberUpdateCoses");
    if (MIHSUIn != null) {
      addInput("MIHSubscriber", MIHUpdateSubscriberObjectHelper.toMap(MIHSUIn, new HashMap(), "Output").get("Output"));
    }
    if (___msisdn != null) {
      addInput("Msisdn", ___msisdn);
    }
  }

/**
 *
 * Retrieves the Integer that results from the MIHSubscriberUpdateCosesRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("Output");
  }
}
