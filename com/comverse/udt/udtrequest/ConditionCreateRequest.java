/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionCreateRequest.java
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
 * Class used to create a ConditionCreateRequest Udt Request
 *
 */

public class ConditionCreateRequest extends ConditionSubRequestParent {
/**
 *
 * Constructor to create a  ConditionCreateRequest
 * @param id Unique request name
 * @param createIn CondObjData for ConditionCreateRequest
 *
 */
@JsonCreator
  public ConditionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Condition")CondObjData createIn) {
    super(id, "ConditionCreate");
    if (createIn != null) {
      addInput("Condition", CondObjHelper.toMap(createIn, new HashMap(), "Condition").get("Condition"));
    }
  }

/**
 *
 * Retrieves the CondObjData that results from the ConditionCreateRequest call
 * @return CondObjData resulting from udt call
 *
 */

  public CondObjData getOutput() {
    return CondObjHelper.fromMap(outputMap, "Condition");
  }
}
