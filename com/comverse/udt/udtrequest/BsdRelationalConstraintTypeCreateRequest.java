/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeCreateRequest.java
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
 * Class used to create a BsdRelationalConstraintTypeCreateRequest Udt Request
 *
 */

public class BsdRelationalConstraintTypeCreateRequest extends BsdRelationalConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeCreateRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintTypeCreateIn BsdRelationalConstraintTypeObjectData for BsdRelationalConstraintTypeCreateRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraintType")BsdRelationalConstraintTypeObjectData bsdRelationalConstraintTypeCreateIn) {
    super(id, "BsdRelationalConstraintTypeCreate");
    if (bsdRelationalConstraintTypeCreateIn != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(bsdRelationalConstraintTypeCreateIn, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintTypeObjectData that results from the BsdRelationalConstraintTypeCreateRequest call
 * @return BsdRelationalConstraintTypeObjectData resulting from udt call
 *
 */

  public BsdRelationalConstraintTypeObjectData getOutput() {
    return BsdRelationalConstraintTypeObjectHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
}
