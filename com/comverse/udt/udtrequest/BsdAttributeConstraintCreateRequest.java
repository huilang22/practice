/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintCreateRequest.java
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
 * Class used to create a BsdAttributeConstraintCreateRequest Udt Request
 *
 */

public class BsdAttributeConstraintCreateRequest extends BsdAttributeConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintCreateRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintCreateIn BsdAttributeConstraintObjectBaseData for BsdAttributeConstraintCreateRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraint")BsdAttributeConstraintObjectBaseData bsdAttributeConstraintCreateIn) {
    super(id, "BsdAttributeConstraintCreate");
    if (bsdAttributeConstraintCreateIn != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseHelper.toMap(bsdAttributeConstraintCreateIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintObjectData that results from the BsdAttributeConstraintCreateRequest call
 * @return BsdAttributeConstraintObjectData resulting from udt call
 *
 */

  public BsdAttributeConstraintObjectData getOutput() {
    return BsdAttributeConstraintObjectHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
}
