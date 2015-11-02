/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeGetRequest.java
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
 * Class used to create a BsdAttributeConstraintTypeGetRequest Udt Request
 *
 */

public class BsdAttributeConstraintTypeGetRequest extends BsdAttributeConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeGetRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintTypeGetIn BsdAttributeConstraintTypeObjectKeyData for BsdAttributeConstraintTypeGetRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraintType")BsdAttributeConstraintTypeObjectKeyData bsdAttributeConstraintTypeGetIn) {
    super(id, "BsdAttributeConstraintTypeGet");
    if (bsdAttributeConstraintTypeGetIn != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectKeyHelper.toMap(bsdAttributeConstraintTypeGetIn, new HashMap(), "BsdAttributeConstraintTypeObjectKeyData").get("BsdAttributeConstraintTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintTypeObjectData that results from the BsdAttributeConstraintTypeGetRequest call
 * @return BsdAttributeConstraintTypeObjectData resulting from udt call
 *
 */

  public BsdAttributeConstraintTypeObjectData getOutput() {
    return BsdAttributeConstraintTypeObjectHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
}
