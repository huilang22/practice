/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeUpdateRequest.java
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
 * Class used to create a BsdAttributeConstraintTypeUpdateRequest Udt Request
 *
 */

public class BsdAttributeConstraintTypeUpdateRequest extends BsdAttributeConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeUpdateRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintTypeUpdateIn BsdAttributeConstraintTypeObjectData for BsdAttributeConstraintTypeUpdateRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraintType")BsdAttributeConstraintTypeObjectData bsdAttributeConstraintTypeUpdateIn) {
    super(id, "BsdAttributeConstraintTypeUpdate");
    if (bsdAttributeConstraintTypeUpdateIn != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(bsdAttributeConstraintTypeUpdateIn, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintTypeObjectData that results from the BsdAttributeConstraintTypeUpdateRequest call
 * @return BsdAttributeConstraintTypeObjectData resulting from udt call
 *
 */

  public BsdAttributeConstraintTypeObjectData getOutput() {
    return BsdAttributeConstraintTypeObjectHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
}
