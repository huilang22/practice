/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleDeleteRequest.java
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
 * Class used to create a RbrXmlRuleDeleteRequest Udt Request
 *
 */

public class RbrXmlRuleDeleteRequest extends RbrXmlRuleSubRequestParent {
/**
 *
 * Constructor to create a  RbrXmlRuleDeleteRequest
 * @param id Unique request name
 * @param RbrXmlRuleDeleteIn RbrXmlRuleObjectKeyData for RbrXmlRuleDeleteRequest
 *
 */
@JsonCreator
  public RbrXmlRuleDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrXmlRule")RbrXmlRuleObjectKeyData RbrXmlRuleDeleteIn) {
    super(id, "RbrXmlRuleDelete");
    if (RbrXmlRuleDeleteIn != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectKeyHelper.toMap(RbrXmlRuleDeleteIn, new HashMap(), "RbrXmlRuleObjectKeyData").get("RbrXmlRuleObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrXmlRuleObjectData that results from the RbrXmlRuleDeleteRequest call
 * @return RbrXmlRuleObjectData resulting from udt call
 *
 */

  public RbrXmlRuleObjectData getOutput() {
    return RbrXmlRuleObjectHelper.fromMap(outputMap, "RbrXmlRule");
  }
}
