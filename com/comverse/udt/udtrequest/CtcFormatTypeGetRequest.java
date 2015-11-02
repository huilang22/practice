/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeGetRequest.java
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
 * Class used to create a CtcFormatTypeGetRequest Udt Request
 *
 */

public class CtcFormatTypeGetRequest extends CtcFormatTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcFormatTypeGetRequest
 * @param id Unique request name
 * @param GetIn CtcFormatTypeObjectKeyData for CtcFormatTypeGetRequest
 *
 */
@JsonCreator
  public CtcFormatTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFormatType")CtcFormatTypeObjectKeyData GetIn) {
    super(id, "CtcFormatTypeGet");
    if (GetIn != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcFormatTypeObjectKeyData").get("CtcFormatTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcFormatTypeObjectData that results from the CtcFormatTypeGetRequest call
 * @return CtcFormatTypeObjectData resulting from udt call
 *
 */

  public CtcFormatTypeObjectData getOutput() {
    return CtcFormatTypeObjectHelper.fromMap(outputMap, "CtcFormatType");
  }
}
