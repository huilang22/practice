/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpGetRequest.java
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
 * Class used to create a ConditionGrpGetRequest Udt Request
 *
 */

public class ConditionGrpGetRequest extends ConditionGrpSubRequestParent {
/**
 *
 * Constructor to create a  ConditionGrpGetRequest
 * @param id Unique request name
 * @param getIn CondGrpObjBaseKeyData for ConditionGrpGetRequest
 *
 */
@JsonCreator
  public ConditionGrpGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionGrp")CondGrpObjBaseKeyData getIn) {
    super(id, "ConditionGrpGet");
    if (getIn != null) {
      addInput("ConditionGrp", CondGrpObjBaseKeyHelper.toMap(getIn, new HashMap(), "CondGrpObjBaseKeyData").get("CondGrpObjBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the CondGrpObjData that results from the ConditionGrpGetRequest call
 * @return CondGrpObjData resulting from udt call
 *
 */

  public CondGrpObjData getOutput() {
    return CondGrpObjHelper.fromMap(outputMap, "ConditionGrp");
  }
}
