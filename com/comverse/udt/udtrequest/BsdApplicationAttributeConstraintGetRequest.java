/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeConstraintGetRequest.java
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
 * Class used to create a BsdApplicationAttributeConstraintGetRequest Udt Request
 *
 */

public class BsdApplicationAttributeConstraintGetRequest extends BsdApplicationAttributeConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationAttributeConstraintGetRequest
 * @param id Unique request name
 * @param bsdApplicationAttributeConstraintGetIn BsdApplicationAttributeConstraintObjectKeyData for BsdApplicationAttributeConstraintGetRequest
 *
 */
@JsonCreator
  public BsdApplicationAttributeConstraintGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationAttributeConstraint")BsdApplicationAttributeConstraintObjectKeyData bsdApplicationAttributeConstraintGetIn) {
    super(id, "BsdApplicationAttributeConstraintGet");
    if (bsdApplicationAttributeConstraintGetIn != null) {
      addInput("BsdApplicationAttributeConstraint", BsdApplicationAttributeConstraintObjectKeyHelper.toMap(bsdApplicationAttributeConstraintGetIn, new HashMap(), "BsdApplicationAttributeConstraintObjectKeyData").get("BsdApplicationAttributeConstraintObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationAttributeConstraintObjectData that results from the BsdApplicationAttributeConstraintGetRequest call
 * @return BsdApplicationAttributeConstraintObjectData resulting from udt call
 *
 */

  public BsdApplicationAttributeConstraintObjectData getOutput() {
    return BsdApplicationAttributeConstraintObjectHelper.fromMap(outputMap, "BsdApplicationAttributeConstraint");
  }
}
