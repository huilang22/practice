/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintFindRequest.java
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
 * Class used to create a BsdRelationalConstraintFindRequest Udt Request
 *
 */

public class BsdRelationalConstraintFindRequest extends BsdRelationalConstraintRequest {
/**
 *
 * Constructor to create a  BsdRelationalConstraintFindRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintFindIn BsdRelationalConstraintObjectFilter for BsdRelationalConstraintFindRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraint")BsdRelationalConstraintObjectFilter bsdRelationalConstraintFindIn) {
    super(id, "BsdRelationalConstraintFind");
    if (bsdRelationalConstraintFindIn != null) {
      Integer index =  bsdRelationalConstraintFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectHelper.toMap(bsdRelationalConstraintFindIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintObjectDataList that results from the BsdRelationalConstraintFindRequest call
 * @return BsdRelationalConstraintObjectDataList resulting from udt call
 *
 */

  public BsdRelationalConstraintObjectDataList getOutput() {
    return BsdRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintList");
  }
}
