/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintCreateRequest.java
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
 * Class used to create a BsdApplicationConstraintCreateRequest Udt Request
 *
 */

public class BsdApplicationConstraintCreateRequest extends BsdApplicationConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationConstraintCreateRequest
 * @param id Unique request name
 * @param bsdApplicationConstraintCreateIn BsdApplicationConstraintObjectData for BsdApplicationConstraintCreateRequest
 *
 */
@JsonCreator
  public BsdApplicationConstraintCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationConstraint")BsdApplicationConstraintObjectData bsdApplicationConstraintCreateIn) {
    super(id, "BsdApplicationConstraintCreate");
    if (bsdApplicationConstraintCreateIn != null) {
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectHelper.toMap(bsdApplicationConstraintCreateIn, new HashMap(), "BsdApplicationConstraint").get("BsdApplicationConstraint"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationConstraintObjectData that results from the BsdApplicationConstraintCreateRequest call
 * @return BsdApplicationConstraintObjectData resulting from udt call
 *
 */

  public BsdApplicationConstraintObjectData getOutput() {
    return BsdApplicationConstraintObjectHelper.fromMap(outputMap, "BsdApplicationConstraint");
  }
}
