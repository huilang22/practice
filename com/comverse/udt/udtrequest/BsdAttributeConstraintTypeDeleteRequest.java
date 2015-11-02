/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeDeleteRequest.java
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
 * Class used to create a BsdAttributeConstraintTypeDeleteRequest Udt Request
 *
 */

public class BsdAttributeConstraintTypeDeleteRequest extends BsdAttributeConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeDeleteRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintTypeDeleteIn BsdAttributeConstraintTypeObjectKeyData for BsdAttributeConstraintTypeDeleteRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraintType")BsdAttributeConstraintTypeObjectKeyData bsdAttributeConstraintTypeDeleteIn) {
    super(id, "BsdAttributeConstraintTypeDelete");
    if (bsdAttributeConstraintTypeDeleteIn != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectKeyHelper.toMap(bsdAttributeConstraintTypeDeleteIn, new HashMap(), "BsdAttributeConstraintTypeObjectKeyData").get("BsdAttributeConstraintTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintTypeObjectData that results from the BsdAttributeConstraintTypeDeleteRequest call
 * @return BsdAttributeConstraintTypeObjectData resulting from udt call
 *
 */

  public BsdAttributeConstraintTypeObjectData getOutput() {
    return BsdAttributeConstraintTypeObjectHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
}
