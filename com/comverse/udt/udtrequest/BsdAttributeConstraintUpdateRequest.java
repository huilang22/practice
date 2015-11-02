/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintUpdateRequest.java
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
 * Class used to create a BsdAttributeConstraintUpdateRequest Udt Request
 *
 */

public class BsdAttributeConstraintUpdateRequest extends BsdAttributeConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintUpdateRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintUpdateIn BsdAttributeConstraintObjectBaseData for BsdAttributeConstraintUpdateRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraint")BsdAttributeConstraintObjectBaseData bsdAttributeConstraintUpdateIn) {
    super(id, "BsdAttributeConstraintUpdate");
    if (bsdAttributeConstraintUpdateIn != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseHelper.toMap(bsdAttributeConstraintUpdateIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintObjectData that results from the BsdAttributeConstraintUpdateRequest call
 * @return BsdAttributeConstraintObjectData resulting from udt call
 *
 */

  public BsdAttributeConstraintObjectData getOutput() {
    return BsdAttributeConstraintObjectHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
}
