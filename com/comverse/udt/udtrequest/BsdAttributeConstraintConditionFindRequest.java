/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionFindRequest.java
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
 * Class used to create a BsdAttributeConstraintConditionFindRequest Udt Request
 *
 */

public class BsdAttributeConstraintConditionFindRequest extends BsdAttributeConstraintConditionRequest {
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionFindRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintConditionFindIn BsdAttributeConstraintConditionObjectFilter for BsdAttributeConstraintConditionFindRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintConditionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraintCondition")BsdAttributeConstraintConditionObjectFilter bsdAttributeConstraintConditionFindIn) {
    super(id, "BsdAttributeConstraintConditionFind");
    if (bsdAttributeConstraintConditionFindIn != null) {
      Integer index =  bsdAttributeConstraintConditionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(bsdAttributeConstraintConditionFindIn, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintConditionObjectDataList that results from the BsdAttributeConstraintConditionFindRequest call
 * @return BsdAttributeConstraintConditionObjectDataList resulting from udt call
 *
 */

  public BsdAttributeConstraintConditionObjectDataList getOutput() {
    return BsdAttributeConstraintConditionObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintConditionList");
  }
}
