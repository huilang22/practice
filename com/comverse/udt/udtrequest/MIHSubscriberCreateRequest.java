/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberCreateRequest.java
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
 * Class used to create a MIHSubscriberCreateRequest Udt Request
 *
 */

public class MIHSubscriberCreateRequest extends MIHSubscriberRequest {
/**
 *
 * Constructor to create a  MIHSubscriberCreateRequest
 * @param id Unique request name
 * @param MIHSCIn MIHSubscriberObjectData for MIHSubscriberCreateRequest
 *
 */
@JsonCreator
  public MIHSubscriberCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MIHSubscriber")MIHSubscriberObjectData MIHSCIn) {
    super(id, "MIHSubscriberCreate");
    if (MIHSCIn != null) {
      addInput("MIHSubscriber", MIHSubscriberObjectHelper.toMap(MIHSCIn, new HashMap(), "Output").get("Output"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the MIHSubscriberCreateRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("Output");
  }
}
