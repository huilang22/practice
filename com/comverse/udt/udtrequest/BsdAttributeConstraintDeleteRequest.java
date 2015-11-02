/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintDeleteRequest.java
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
 * Class used to create a BsdAttributeConstraintDeleteRequest Udt Request
 *
 */

public class BsdAttributeConstraintDeleteRequest extends BsdAttributeConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintDeleteRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintDeleteIn BsdAttributeConstraintObjectBaseKeyData for BsdAttributeConstraintDeleteRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraint")BsdAttributeConstraintObjectBaseKeyData bsdAttributeConstraintDeleteIn) {
    super(id, "BsdAttributeConstraintDelete");
    if (bsdAttributeConstraintDeleteIn != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseKeyHelper.toMap(bsdAttributeConstraintDeleteIn, new HashMap(), "BsdAttributeConstraintObjectBaseKeyData").get("BsdAttributeConstraintObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintObjectBaseData that results from the BsdAttributeConstraintDeleteRequest call
 * @return BsdAttributeConstraintObjectBaseData resulting from udt call
 *
 */

  public BsdAttributeConstraintObjectBaseData getOutput() {
    return BsdAttributeConstraintObjectBaseHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
}
