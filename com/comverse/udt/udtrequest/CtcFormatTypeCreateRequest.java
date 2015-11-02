/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeCreateRequest.java
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
 * Class used to create a CtcFormatTypeCreateRequest Udt Request
 *
 */

public class CtcFormatTypeCreateRequest extends CtcFormatTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcFormatTypeCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcFormatTypeObjectData for CtcFormatTypeCreateRequest
 *
 */
@JsonCreator
  public CtcFormatTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFormatType")CtcFormatTypeObjectData CreateIn) {
    super(id, "CtcFormatTypeCreate");
    if (CreateIn != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(CreateIn, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }

/**
 *
 * Retrieves the CtcFormatTypeObjectData that results from the CtcFormatTypeCreateRequest call
 * @return CtcFormatTypeObjectData resulting from udt call
 *
 */

  public CtcFormatTypeObjectData getOutput() {
    return CtcFormatTypeObjectHelper.fromMap(outputMap, "CtcFormatType");
  }
}
