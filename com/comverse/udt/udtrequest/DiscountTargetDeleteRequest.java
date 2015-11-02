/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetDeleteRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DiscountTargetDeleteRequest Udt Request
 *
 */

public class DiscountTargetDeleteRequest extends DiscountTargetSubRequestParent {
/**
 *
 * Constructor to create a  DiscountTargetDeleteRequest
 * @param id Unique request name
 * @param DTDeleteIn DTObjectKeyData for DiscountTargetDeleteRequest
 *
 */
@JsonCreator
  public DiscountTargetDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountTarget")DTObjectKeyData DTDeleteIn) {
    super(id, "DiscountTargetDelete");
    if (DTDeleteIn != null) {
      addInput("DiscountTarget", DTObjectKeyHelper.toMap(DTDeleteIn, new HashMap(), "DTObjectKeyData").get("DTObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DTObjectData that results from the DiscountTargetDeleteRequest call
 * @return DTObjectData resulting from udt call
 *
 */

  public DTObjectData getOutput() {
    return DTObjectHelper.fromMap(outputMap, "DiscountTarget");
  }
}
