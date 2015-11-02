/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatUpdateRequest.java
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
 * Class used to create a CtcFormatUpdateRequest Udt Request
 *
 */

public class CtcFormatUpdateRequest extends CtcFormatSubRequestParent {
/**
 *
 * Constructor to create a  CtcFormatUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcFormatObjectData for CtcFormatUpdateRequest
 *
 */
@JsonCreator
  public CtcFormatUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFormat")CtcFormatObjectData UpdateIn) {
    super(id, "CtcFormatUpdate");
    if (UpdateIn != null) {
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(UpdateIn, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }

/**
 *
 * Retrieves the CtcFormatObjectData that results from the CtcFormatUpdateRequest call
 * @return CtcFormatObjectData resulting from udt call
 *
 */

  public CtcFormatObjectData getOutput() {
    return CtcFormatObjectHelper.fromMap(outputMap, "CtcFormat");
  }
}
