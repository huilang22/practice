/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SubscriberCreateRequest.java
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
 * Class used to create a SubscriberCreateRequest Udt Request
 *
 */

public class SubscriberCreateRequest extends PolicyInstanceRequest {
/**
 *
 * Constructor to create a  SubscriberCreateRequest
 * @param id Unique request name
 * @param SubCrIn SubscriberObjectData for SubscriberCreateRequest
 *
 */
@JsonCreator
  public SubscriberCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PolicyInstance")SubscriberObjectData SubCrIn) {
    super(id, "SubscriberCreate");
    if (SubCrIn != null) {
      addInput("PolicyInstance", SubscriberObjectHelper.toMap(SubCrIn, new HashMap(), "Success").get("Success"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the SubscriberCreateRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("Success");
  }
}
