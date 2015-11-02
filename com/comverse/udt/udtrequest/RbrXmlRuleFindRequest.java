/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleFindRequest.java
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
 * Class used to create a RbrXmlRuleFindRequest Udt Request
 *
 */

public class RbrXmlRuleFindRequest extends RbrXmlRuleRequest {
/**
 *
 * Constructor to create a  RbrXmlRuleFindRequest
 * @param id Unique request name
 * @param RbrXmlRuleFindIn RbrXmlRuleObjectFilter for RbrXmlRuleFindRequest
 *
 */
@JsonCreator
  public RbrXmlRuleFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrXmlRule")RbrXmlRuleObjectFilter RbrXmlRuleFindIn) {
    super(id, "RbrXmlRuleFind");
    if (RbrXmlRuleFindIn != null) {
      Integer index =  RbrXmlRuleFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(RbrXmlRuleFindIn, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }

/**
 *
 * Retrieves the RbrXmlRuleObjectDataList that results from the RbrXmlRuleFindRequest call
 * @return RbrXmlRuleObjectDataList resulting from udt call
 *
 */

  public RbrXmlRuleObjectDataList getOutput() {
    return RbrXmlRuleObjectHelper.fromMapList(outputMap, "RbrXmlRuleList");
  }
}
