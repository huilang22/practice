/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpFindRequest.java
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
 * Class used to create a ConditionGrpFindRequest Udt Request
 *
 */

public class ConditionGrpFindRequest extends ConditionGrpRequest {
/**
 *
 * Constructor to create a  ConditionGrpFindRequest
 * @param id Unique request name
 * @param findIn CondGrpObjFilter for ConditionGrpFindRequest
 *
 */
@JsonCreator
  public ConditionGrpFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionGrp")CondGrpObjFilter findIn) {
    super(id, "ConditionGrpFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ConditionGrp", CondGrpObjHelper.toMap(findIn, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }

/**
 *
 * Retrieves the CondGrpObjDataList that results from the ConditionGrpFindRequest call
 * @return CondGrpObjDataList resulting from udt call
 *
 */

  public CondGrpObjDataList getOutput() {
    return CondGrpObjHelper.fromMapList(outputMap, "ConditionGrpList");
  }
}
