/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeCreateRequest.java
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
 * Class used to create a BsdAttributeConstraintTypeCreateRequest Udt Request
 *
 */

public class BsdAttributeConstraintTypeCreateRequest extends BsdAttributeConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeCreateRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintTypeCreateIn BsdAttributeConstraintTypeObjectData for BsdAttributeConstraintTypeCreateRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraintType")BsdAttributeConstraintTypeObjectData bsdAttributeConstraintTypeCreateIn) {
    super(id, "BsdAttributeConstraintTypeCreate");
    if (bsdAttributeConstraintTypeCreateIn != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(bsdAttributeConstraintTypeCreateIn, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintTypeObjectData that results from the BsdAttributeConstraintTypeCreateRequest call
 * @return BsdAttributeConstraintTypeObjectData resulting from udt call
 *
 */

  public BsdAttributeConstraintTypeObjectData getOutput() {
    return BsdAttributeConstraintTypeObjectHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
}
