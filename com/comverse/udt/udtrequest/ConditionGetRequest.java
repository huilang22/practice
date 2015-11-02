/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGetRequest.java
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
 * Class used to create a ConditionGetRequest Udt Request
 *
 */

public class ConditionGetRequest extends ConditionSubRequestParent {
/**
 *
 * Constructor to create a  ConditionGetRequest
 * @param id Unique request name
 * @param getIn CondObjKeyData for ConditionGetRequest
 *
 */
@JsonCreator
  public ConditionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Condition")CondObjKeyData getIn) {
    super(id, "ConditionGet");
    if (getIn != null) {
      addInput("Condition", CondObjKeyHelper.toMap(getIn, new HashMap(), "CondObjKeyData").get("CondObjKeyData"));
    }
  }

/**
 *
 * Retrieves the CondObjData that results from the ConditionGetRequest call
 * @return CondObjData resulting from udt call
 *
 */

  public CondObjData getOutput() {
    return CondObjHelper.fromMap(outputMap, "Condition");
  }
}
