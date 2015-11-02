/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeDeleteRequest.java
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
 * Class used to create a BsdRelationalConstraintTypeDeleteRequest Udt Request
 *
 */

public class BsdRelationalConstraintTypeDeleteRequest extends BsdRelationalConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeDeleteRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintTypeDeleteIn BsdRelationalConstraintTypeObjectKeyData for BsdRelationalConstraintTypeDeleteRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraintType")BsdRelationalConstraintTypeObjectKeyData bsdRelationalConstraintTypeDeleteIn) {
    super(id, "BsdRelationalConstraintTypeDelete");
    if (bsdRelationalConstraintTypeDeleteIn != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectKeyHelper.toMap(bsdRelationalConstraintTypeDeleteIn, new HashMap(), "BsdRelationalConstraintTypeObjectKeyData").get("BsdRelationalConstraintTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintTypeObjectData that results from the BsdRelationalConstraintTypeDeleteRequest call
 * @return BsdRelationalConstraintTypeObjectData resulting from udt call
 *
 */

  public BsdRelationalConstraintTypeObjectData getOutput() {
    return BsdRelationalConstraintTypeObjectHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
}
