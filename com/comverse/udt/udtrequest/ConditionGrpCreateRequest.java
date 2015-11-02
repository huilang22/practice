/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpCreateRequest.java
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
 * Class used to create a ConditionGrpCreateRequest Udt Request
 *
 */

public class ConditionGrpCreateRequest extends ConditionGrpSubRequestParent {
/**
 *
 * Constructor to create a  ConditionGrpCreateRequest
 * @param id Unique request name
 * @param createIn CondGrpObjBaseData for ConditionGrpCreateRequest
 *
 */
@JsonCreator
  public ConditionGrpCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionGrp")CondGrpObjBaseData createIn) {
    super(id, "ConditionGrpCreate");
    if (createIn != null) {
      addInput("ConditionGrp", CondGrpObjBaseHelper.toMap(createIn, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }

/**
 *
 * Retrieves the CondGrpObjBaseData that results from the ConditionGrpCreateRequest call
 * @return CondGrpObjBaseData resulting from udt call
 *
 */

  public CondGrpObjBaseData getOutput() {
    return CondGrpObjBaseHelper.fromMap(outputMap, "ConditionGrp");
  }
}
