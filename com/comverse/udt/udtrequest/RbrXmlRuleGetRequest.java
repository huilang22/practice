/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleGetRequest.java
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
 * Class used to create a RbrXmlRuleGetRequest Udt Request
 *
 */

public class RbrXmlRuleGetRequest extends RbrXmlRuleSubRequestParent {
/**
 *
 * Constructor to create a  RbrXmlRuleGetRequest
 * @param id Unique request name
 * @param RbrXmlRuleGetIn RbrXmlRuleObjectKeyData for RbrXmlRuleGetRequest
 *
 */
@JsonCreator
  public RbrXmlRuleGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrXmlRule")RbrXmlRuleObjectKeyData RbrXmlRuleGetIn) {
    super(id, "RbrXmlRuleGet");
    if (RbrXmlRuleGetIn != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectKeyHelper.toMap(RbrXmlRuleGetIn, new HashMap(), "RbrXmlRuleObjectKeyData").get("RbrXmlRuleObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrXmlRuleObjectData that results from the RbrXmlRuleGetRequest call
 * @return RbrXmlRuleObjectData resulting from udt call
 *
 */

  public RbrXmlRuleObjectData getOutput() {
    return RbrXmlRuleObjectHelper.fromMap(outputMap, "RbrXmlRule");
  }
}
