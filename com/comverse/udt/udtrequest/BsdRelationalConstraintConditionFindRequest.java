/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionFindRequest.java
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

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdRelationalConstraintConditionFindRequest Udt Request
 *
 */

public class BsdRelationalConstraintConditionFindRequest extends BsdRelationalConstraintConditionRequest {
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionFindRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintConditionFindIn BsdRelationalConstraintConditionObjectFilter for BsdRelationalConstraintConditionFindRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintConditionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraintCondition")BsdRelationalConstraintConditionObjectFilter bsdRelationalConstraintConditionFindIn) {
    super(id, "BsdRelationalConstraintConditionFind");
    if (bsdRelationalConstraintConditionFindIn != null) {
      Integer index =  bsdRelationalConstraintConditionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(bsdRelationalConstraintConditionFindIn, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintConditionObjectDataList that results from the BsdRelationalConstraintConditionFindRequest call
 * @return BsdRelationalConstraintConditionObjectDataList resulting from udt call
 *
 */

  public BsdRelationalConstraintConditionObjectDataList getOutput() {
    return BsdRelationalConstraintConditionObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintConditionList");
  }
}
