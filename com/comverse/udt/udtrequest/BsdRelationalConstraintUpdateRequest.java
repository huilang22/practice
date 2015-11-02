/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintUpdateRequest.java
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
 * Class used to create a BsdRelationalConstraintUpdateRequest Udt Request
 *
 */

public class BsdRelationalConstraintUpdateRequest extends BsdRelationalConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintUpdateRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintUpdateIn BsdRelationalConstraintObjectBaseData for BsdRelationalConstraintUpdateRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraint")BsdRelationalConstraintObjectBaseData bsdRelationalConstraintUpdateIn) {
    super(id, "BsdRelationalConstraintUpdate");
    if (bsdRelationalConstraintUpdateIn != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseHelper.toMap(bsdRelationalConstraintUpdateIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintObjectData that results from the BsdRelationalConstraintUpdateRequest call
 * @return BsdRelationalConstraintObjectData resulting from udt call
 *
 */

  public BsdRelationalConstraintObjectData getOutput() {
    return BsdRelationalConstraintObjectHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
}
