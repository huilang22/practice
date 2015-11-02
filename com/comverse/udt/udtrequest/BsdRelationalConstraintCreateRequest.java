/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintCreateRequest.java
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
 * Class used to create a BsdRelationalConstraintCreateRequest Udt Request
 *
 */

public class BsdRelationalConstraintCreateRequest extends BsdRelationalConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintCreateRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintCreateIn BsdRelationalConstraintObjectBaseData for BsdRelationalConstraintCreateRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraint")BsdRelationalConstraintObjectBaseData bsdRelationalConstraintCreateIn) {
    super(id, "BsdRelationalConstraintCreate");
    if (bsdRelationalConstraintCreateIn != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseHelper.toMap(bsdRelationalConstraintCreateIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintObjectData that results from the BsdRelationalConstraintCreateRequest call
 * @return BsdRelationalConstraintObjectData resulting from udt call
 *
 */

  public BsdRelationalConstraintObjectData getOutput() {
    return BsdRelationalConstraintObjectHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
}
