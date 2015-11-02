/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemGetRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcItemGetRequest Udt Request
 *
 */

public class CtcItemGetRequest extends CtcItemSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemGetRequest
 * @param id Unique request name
 * @param GetIn CtcItemObjectKeyData for CtcItemGetRequest
 *
 */
@JsonCreator
  public CtcItemGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItem")CtcItemObjectKeyData GetIn) {
    super(id, "CtcItemGet");
    if (GetIn != null) {
      addInput("CtcItem", CtcItemObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemObjectKeyData").get("CtcItemObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemObjectData that results from the CtcItemGetRequest call
 * @return CtcItemObjectData resulting from udt call
 *
 */

  public CtcItemObjectData getOutput() {
    return CtcItemObjectHelper.fromMap(outputMap, "CtcItem");
  }
}
