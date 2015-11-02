/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFormatGetRequest.java
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
 * Class used to create a CtcItemFormatGetRequest Udt Request
 *
 */

public class CtcItemFormatGetRequest extends CtcItemFormatSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemFormatGetRequest
 * @param id Unique request name
 * @param GetIn CtcItemFormatObjectKeyData for CtcItemFormatGetRequest
 *
 */
@JsonCreator
  public CtcItemFormatGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemFormat")CtcItemFormatObjectKeyData GetIn) {
    super(id, "CtcItemFormatGet");
    if (GetIn != null) {
      addInput("CtcItemFormat", CtcItemFormatObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemFormatObjectKeyData").get("CtcItemFormatObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemFormatObjectData that results from the CtcItemFormatGetRequest call
 * @return CtcItemFormatObjectData resulting from udt call
 *
 */

  public CtcItemFormatObjectData getOutput() {
    return CtcItemFormatObjectHelper.fromMap(outputMap, "CtcItemFormat");
  }
}
