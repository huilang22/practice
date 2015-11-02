/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeDeleteRequest.java
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
 * Class used to create a CtcFormatTypeDeleteRequest Udt Request
 *
 */

public class CtcFormatTypeDeleteRequest extends CtcFormatTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcFormatTypeDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcFormatTypeObjectKeyData for CtcFormatTypeDeleteRequest
 *
 */
@JsonCreator
  public CtcFormatTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFormatType")CtcFormatTypeObjectKeyData DeleteIn) {
    super(id, "CtcFormatTypeDelete");
    if (DeleteIn != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcFormatTypeObjectKeyData").get("CtcFormatTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcFormatTypeObjectData that results from the CtcFormatTypeDeleteRequest call
 * @return CtcFormatTypeObjectData resulting from udt call
 *
 */

  public CtcFormatTypeObjectData getOutput() {
    return CtcFormatTypeObjectHelper.fromMap(outputMap, "CtcFormatType");
  }
}
