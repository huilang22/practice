/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalConstraintGetRequest.java
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
 * Class used to create a BsdApplicationRelationalConstraintGetRequest Udt Request
 *
 */

public class BsdApplicationRelationalConstraintGetRequest extends BsdApplicationRelationalConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationRelationalConstraintGetRequest
 * @param id Unique request name
 * @param bsdApplicationRelationalConstraintGetIn BsdApplicationRelationalConstraintObjectKeyData for BsdApplicationRelationalConstraintGetRequest
 *
 */
@JsonCreator
  public BsdApplicationRelationalConstraintGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationRelationalConstraint")BsdApplicationRelationalConstraintObjectKeyData bsdApplicationRelationalConstraintGetIn) {
    super(id, "BsdApplicationRelationalConstraintGet");
    if (bsdApplicationRelationalConstraintGetIn != null) {
      addInput("BsdApplicationRelationalConstraint", BsdApplicationRelationalConstraintObjectKeyHelper.toMap(bsdApplicationRelationalConstraintGetIn, new HashMap(), "BsdApplicationRelationalConstraintObjectKeyData").get("BsdApplicationRelationalConstraintObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationRelationalConstraintObjectData that results from the BsdApplicationRelationalConstraintGetRequest call
 * @return BsdApplicationRelationalConstraintObjectData resulting from udt call
 *
 */

  public BsdApplicationRelationalConstraintObjectData getOutput() {
    return BsdApplicationRelationalConstraintObjectHelper.fromMap(outputMap, "BsdApplicationRelationalConstraint");
  }
}
