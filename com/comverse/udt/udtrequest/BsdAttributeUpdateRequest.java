/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeUpdateRequest.java
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
 * Class used to create a BsdAttributeUpdateRequest Udt Request
 *
 */

public class BsdAttributeUpdateRequest extends BsdAttributeSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeUpdateRequest
 * @param id Unique request name
 * @param bsdAttributeUpdateIn BsdAttributeObjectData for BsdAttributeUpdateRequest
 *
 */
@JsonCreator
  public BsdAttributeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttribute")BsdAttributeObjectData bsdAttributeUpdateIn) {
    super(id, "BsdAttributeUpdate");
    if (bsdAttributeUpdateIn != null) {
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(bsdAttributeUpdateIn, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeObjectData that results from the BsdAttributeUpdateRequest call
 * @return BsdAttributeObjectData resulting from udt call
 *
 */

  public BsdAttributeObjectData getOutput() {
    return BsdAttributeObjectHelper.fromMap(outputMap, "BsdAttribute");
  }
}
