/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceUpdateExpiryDateRequest.java
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
 * Class used to create a PolicyInstanceUpdateExpiryDateRequest Udt Request
 *
 */

public class PolicyInstanceUpdateExpiryDateRequest extends PolicyInstanceRequest {
/**
 *
 * Constructor to create a  PolicyInstanceUpdateExpiryDateRequest
 * @param id Unique request name
 * @param UpdateExpDtIn UpdateSubscriberObjectData for PolicyInstanceUpdateExpiryDateRequest
 *
 */
@JsonCreator
  public PolicyInstanceUpdateExpiryDateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PolicyInstance")UpdateSubscriberObjectData UpdateExpDtIn) {
    super(id, "PolicyInstanceUpdateExpiryDate");
    if (UpdateExpDtIn != null) {
      addInput("PolicyInstance", UpdateSubscriberObjectHelper.toMap(UpdateExpDtIn, new HashMap(), "Result").get("Result"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the PolicyInstanceUpdateExpiryDateRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("Result");
  }
}
