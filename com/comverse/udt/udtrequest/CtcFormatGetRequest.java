/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatGetRequest.java
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
 * Class used to create a CtcFormatGetRequest Udt Request
 *
 */

public class CtcFormatGetRequest extends CtcFormatSubRequestParent {
/**
 *
 * Constructor to create a  CtcFormatGetRequest
 * @param id Unique request name
 * @param GetIn CtcFormatObjectKeyData for CtcFormatGetRequest
 *
 */
@JsonCreator
  public CtcFormatGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFormat")CtcFormatObjectKeyData GetIn) {
    super(id, "CtcFormatGet");
    if (GetIn != null) {
      addInput("CtcFormat", CtcFormatObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcFormatObjectKeyData").get("CtcFormatObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcFormatObjectData that results from the CtcFormatGetRequest call
 * @return CtcFormatObjectData resulting from udt call
 *
 */

  public CtcFormatObjectData getOutput() {
    return CtcFormatObjectHelper.fromMap(outputMap, "CtcFormat");
  }
}
