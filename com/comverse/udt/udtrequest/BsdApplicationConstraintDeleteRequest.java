/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintDeleteRequest.java
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
 * Class used to create a BsdApplicationConstraintDeleteRequest Udt Request
 *
 */

public class BsdApplicationConstraintDeleteRequest extends BsdApplicationConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationConstraintDeleteRequest
 * @param id Unique request name
 * @param bsdApplicationConstraintDeleteIn BsdApplicationConstraintObjectKeyData for BsdApplicationConstraintDeleteRequest
 *
 */
@JsonCreator
  public BsdApplicationConstraintDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationConstraint")BsdApplicationConstraintObjectKeyData bsdApplicationConstraintDeleteIn) {
    super(id, "BsdApplicationConstraintDelete");
    if (bsdApplicationConstraintDeleteIn != null) {
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectKeyHelper.toMap(bsdApplicationConstraintDeleteIn, new HashMap(), "BsdApplicationConstraintObjectKeyData").get("BsdApplicationConstraintObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationConstraintObjectData that results from the BsdApplicationConstraintDeleteRequest call
 * @return BsdApplicationConstraintObjectData resulting from udt call
 *
 */

  public BsdApplicationConstraintObjectData getOutput() {
    return BsdApplicationConstraintObjectHelper.fromMap(outputMap, "BsdApplicationConstraint");
  }
}
