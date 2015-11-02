/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpUpdateRequest.java
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
 * Class used to create a ConditionGrpUpdateRequest Udt Request
 *
 */

public class ConditionGrpUpdateRequest extends ConditionGrpSubRequestParent {
/**
 *
 * Constructor to create a  ConditionGrpUpdateRequest
 * @param id Unique request name
 * @param updateIn CondGrpObjData for ConditionGrpUpdateRequest
 *
 */
@JsonCreator
  public ConditionGrpUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionGrp")CondGrpObjData updateIn) {
    super(id, "ConditionGrpUpdate");
    if (updateIn != null) {
      addInput("ConditionGrp", CondGrpObjHelper.toMap(updateIn, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }

/**
 *
 * Retrieves the CondGrpObjData that results from the ConditionGrpUpdateRequest call
 * @return CondGrpObjData resulting from udt call
 *
 */

  public CondGrpObjData getOutput() {
    return CondGrpObjHelper.fromMap(outputMap, "ConditionGrp");
  }
}
