/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatDeleteRequest.java
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
 * Class used to create a CtcFormatDeleteRequest Udt Request
 *
 */

public class CtcFormatDeleteRequest extends CtcFormatSubRequestParent {
/**
 *
 * Constructor to create a  CtcFormatDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcFormatObjectKeyData for CtcFormatDeleteRequest
 *
 */
@JsonCreator
  public CtcFormatDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFormat")CtcFormatObjectKeyData DeleteIn) {
    super(id, "CtcFormatDelete");
    if (DeleteIn != null) {
      addInput("CtcFormat", CtcFormatObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcFormatObjectKeyData").get("CtcFormatObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcFormatObjectData that results from the CtcFormatDeleteRequest call
 * @return CtcFormatObjectData resulting from udt call
 *
 */

  public CtcFormatObjectData getOutput() {
    return CtcFormatObjectHelper.fromMap(outputMap, "CtcFormat");
  }
}
