/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintGetRequest.java
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
 * Class used to create a BsdRelationalConstraintGetRequest Udt Request
 *
 */

public class BsdRelationalConstraintGetRequest extends BsdRelationalConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintGetRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintGetIn BsdRelationalConstraintObjectBaseKeyData for BsdRelationalConstraintGetRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraint")BsdRelationalConstraintObjectBaseKeyData bsdRelationalConstraintGetIn) {
    super(id, "BsdRelationalConstraintGet");
    if (bsdRelationalConstraintGetIn != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseKeyHelper.toMap(bsdRelationalConstraintGetIn, new HashMap(), "BsdRelationalConstraintObjectBaseKeyData").get("BsdRelationalConstraintObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintObjectData that results from the BsdRelationalConstraintGetRequest call
 * @return BsdRelationalConstraintObjectData resulting from udt call
 *
 */

  public BsdRelationalConstraintObjectData getOutput() {
    return BsdRelationalConstraintObjectHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
}
