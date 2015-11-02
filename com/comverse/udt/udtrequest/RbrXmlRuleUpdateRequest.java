/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleUpdateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a RbrXmlRuleUpdateRequest Udt Request
 *
 */

public class RbrXmlRuleUpdateRequest extends RbrXmlRuleSubRequestParent {
/**
 *
 * Constructor to create a  RbrXmlRuleUpdateRequest
 * @param id Unique request name
 * @param RbrXmlRuleUpdateIn RbrXmlRuleObjectData for RbrXmlRuleUpdateRequest
 *
 */
@JsonCreator
  public RbrXmlRuleUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrXmlRule")RbrXmlRuleObjectData RbrXmlRuleUpdateIn) {
    super(id, "RbrXmlRuleUpdate");
    if (RbrXmlRuleUpdateIn != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(RbrXmlRuleUpdateIn, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }

/**
 *
 * Retrieves the RbrXmlRuleObjectData that results from the RbrXmlRuleUpdateRequest call
 * @return RbrXmlRuleObjectData resulting from udt call
 *
 */

  public RbrXmlRuleObjectData getOutput() {
    return RbrXmlRuleObjectHelper.fromMap(outputMap, "RbrXmlRule");
  }
}
