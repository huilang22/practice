/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionFindRequest.java
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
 * Class used to create a ConditionFindRequest Udt Request
 *
 */

public class ConditionFindRequest extends ConditionRequest {
/**
 *
 * Constructor to create a  ConditionFindRequest
 * @param id Unique request name
 * @param findIn CondObjFilter for ConditionFindRequest
 *
 */
@JsonCreator
  public ConditionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Condition")CondObjFilter findIn) {
    super(id, "ConditionFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Condition", CondObjHelper.toMap(findIn, new HashMap(), "Condition").get("Condition"));
    }
  }

/**
 *
 * Retrieves the CondObjDataList that results from the ConditionFindRequest call
 * @return CondObjDataList resulting from udt call
 *
 */

  public CondObjDataList getOutput() {
    return CondObjHelper.fromMapList(outputMap, "ConditionList");
  }
}
