/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintDeleteRequest.java
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
 * Class used to create a BsdRelationalConstraintDeleteRequest Udt Request
 *
 */

public class BsdRelationalConstraintDeleteRequest extends BsdRelationalConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintDeleteRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintDeleteIn BsdRelationalConstraintObjectBaseKeyData for BsdRelationalConstraintDeleteRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraint")BsdRelationalConstraintObjectBaseKeyData bsdRelationalConstraintDeleteIn) {
    super(id, "BsdRelationalConstraintDelete");
    if (bsdRelationalConstraintDeleteIn != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseKeyHelper.toMap(bsdRelationalConstraintDeleteIn, new HashMap(), "BsdRelationalConstraintObjectBaseKeyData").get("BsdRelationalConstraintObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintObjectBaseData that results from the BsdRelationalConstraintDeleteRequest call
 * @return BsdRelationalConstraintObjectBaseData resulting from udt call
 *
 */

  public BsdRelationalConstraintObjectBaseData getOutput() {
    return BsdRelationalConstraintObjectBaseHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
}
