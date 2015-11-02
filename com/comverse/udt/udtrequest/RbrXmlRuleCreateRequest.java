/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleCreateRequest.java
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
 * Class used to create a RbrXmlRuleCreateRequest Udt Request
 *
 */

public class RbrXmlRuleCreateRequest extends RbrXmlRuleSubRequestParent {
/**
 *
 * Constructor to create a  RbrXmlRuleCreateRequest
 * @param id Unique request name
 * @param RbrXmlRuleCreateIn RbrXmlRuleObjectData for RbrXmlRuleCreateRequest
 *
 */
@JsonCreator
  public RbrXmlRuleCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrXmlRule")RbrXmlRuleObjectData RbrXmlRuleCreateIn) {
    super(id, "RbrXmlRuleCreate");
    if (RbrXmlRuleCreateIn != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(RbrXmlRuleCreateIn, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }

/**
 *
 * Retrieves the RbrXmlRuleObjectData that results from the RbrXmlRuleCreateRequest call
 * @return RbrXmlRuleObjectData resulting from udt call
 *
 */

  public RbrXmlRuleObjectData getOutput() {
    return RbrXmlRuleObjectHelper.fromMap(outputMap, "RbrXmlRule");
  }
}
