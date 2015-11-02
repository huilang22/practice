/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeUpdateRequest.java
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
 * Class used to create a BsdRelationalConstraintTypeUpdateRequest Udt Request
 *
 */

public class BsdRelationalConstraintTypeUpdateRequest extends BsdRelationalConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeUpdateRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintTypeUpdateIn BsdRelationalConstraintTypeObjectData for BsdRelationalConstraintTypeUpdateRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraintType")BsdRelationalConstraintTypeObjectData bsdRelationalConstraintTypeUpdateIn) {
    super(id, "BsdRelationalConstraintTypeUpdate");
    if (bsdRelationalConstraintTypeUpdateIn != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(bsdRelationalConstraintTypeUpdateIn, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintTypeObjectData that results from the BsdRelationalConstraintTypeUpdateRequest call
 * @return BsdRelationalConstraintTypeObjectData resulting from udt call
 *
 */

  public BsdRelationalConstraintTypeObjectData getOutput() {
    return BsdRelationalConstraintTypeObjectHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
}
