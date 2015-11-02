/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatCreateRequest.java
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
 * Class used to create a CtcFormatCreateRequest Udt Request
 *
 */

public class CtcFormatCreateRequest extends CtcFormatSubRequestParent {
/**
 *
 * Constructor to create a  CtcFormatCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcFormatObjectData for CtcFormatCreateRequest
 *
 */
@JsonCreator
  public CtcFormatCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFormat")CtcFormatObjectData CreateIn) {
    super(id, "CtcFormatCreate");
    if (CreateIn != null) {
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(CreateIn, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }

/**
 *
 * Retrieves the CtcFormatObjectData that results from the CtcFormatCreateRequest call
 * @return CtcFormatObjectData resulting from udt call
 *
 */

  public CtcFormatObjectData getOutput() {
    return CtcFormatObjectHelper.fromMap(outputMap, "CtcFormat");
  }
}
