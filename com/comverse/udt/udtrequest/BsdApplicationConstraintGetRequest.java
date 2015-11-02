/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintGetRequest.java
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
 * Class used to create a BsdApplicationConstraintGetRequest Udt Request
 *
 */

public class BsdApplicationConstraintGetRequest extends BsdApplicationConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationConstraintGetRequest
 * @param id Unique request name
 * @param bsdApplicationConstraintGetIn BsdApplicationConstraintObjectKeyData for BsdApplicationConstraintGetRequest
 *
 */
@JsonCreator
  public BsdApplicationConstraintGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationConstraint")BsdApplicationConstraintObjectKeyData bsdApplicationConstraintGetIn) {
    super(id, "BsdApplicationConstraintGet");
    if (bsdApplicationConstraintGetIn != null) {
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectKeyHelper.toMap(bsdApplicationConstraintGetIn, new HashMap(), "BsdApplicationConstraintObjectKeyData").get("BsdApplicationConstraintObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationConstraintObjectData that results from the BsdApplicationConstraintGetRequest call
 * @return BsdApplicationConstraintObjectData resulting from udt call
 *
 */

  public BsdApplicationConstraintObjectData getOutput() {
    return BsdApplicationConstraintObjectHelper.fromMap(outputMap, "BsdApplicationConstraint");
  }
}
