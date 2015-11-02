/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintGetRequest.java
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
 * Class used to create a BsdAttributeConstraintGetRequest Udt Request
 *
 */

public class BsdAttributeConstraintGetRequest extends BsdAttributeConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintGetRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintGetIn BsdAttributeConstraintObjectBaseKeyData for BsdAttributeConstraintGetRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraint")BsdAttributeConstraintObjectBaseKeyData bsdAttributeConstraintGetIn) {
    super(id, "BsdAttributeConstraintGet");
    if (bsdAttributeConstraintGetIn != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseKeyHelper.toMap(bsdAttributeConstraintGetIn, new HashMap(), "BsdAttributeConstraintObjectBaseKeyData").get("BsdAttributeConstraintObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintObjectData that results from the BsdAttributeConstraintGetRequest call
 * @return BsdAttributeConstraintObjectData resulting from udt call
 *
 */

  public BsdAttributeConstraintObjectData getOutput() {
    return BsdAttributeConstraintObjectHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
}
