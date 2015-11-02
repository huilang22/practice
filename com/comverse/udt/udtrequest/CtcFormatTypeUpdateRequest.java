/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeUpdateRequest.java
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
 * Class used to create a CtcFormatTypeUpdateRequest Udt Request
 *
 */

public class CtcFormatTypeUpdateRequest extends CtcFormatTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcFormatTypeUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcFormatTypeObjectData for CtcFormatTypeUpdateRequest
 *
 */
@JsonCreator
  public CtcFormatTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFormatType")CtcFormatTypeObjectData UpdateIn) {
    super(id, "CtcFormatTypeUpdate");
    if (UpdateIn != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(UpdateIn, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }

/**
 *
 * Retrieves the CtcFormatTypeObjectData that results from the CtcFormatTypeUpdateRequest call
 * @return CtcFormatTypeObjectData resulting from udt call
 *
 */

  public CtcFormatTypeObjectData getOutput() {
    return CtcFormatTypeObjectHelper.fromMap(outputMap, "CtcFormatType");
  }
}
