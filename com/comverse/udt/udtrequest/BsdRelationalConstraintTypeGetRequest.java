/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeGetRequest.java
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
 * Class used to create a BsdRelationalConstraintTypeGetRequest Udt Request
 *
 */

public class BsdRelationalConstraintTypeGetRequest extends BsdRelationalConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeGetRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintTypeGetIn BsdRelationalConstraintTypeObjectKeyData for BsdRelationalConstraintTypeGetRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraintType")BsdRelationalConstraintTypeObjectKeyData bsdRelationalConstraintTypeGetIn) {
    super(id, "BsdRelationalConstraintTypeGet");
    if (bsdRelationalConstraintTypeGetIn != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectKeyHelper.toMap(bsdRelationalConstraintTypeGetIn, new HashMap(), "BsdRelationalConstraintTypeObjectKeyData").get("BsdRelationalConstraintTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintTypeObjectData that results from the BsdRelationalConstraintTypeGetRequest call
 * @return BsdRelationalConstraintTypeObjectData resulting from udt call
 *
 */

  public BsdRelationalConstraintTypeObjectData getOutput() {
    return BsdRelationalConstraintTypeObjectHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
}
