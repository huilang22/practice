/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeUpdateRequest.java
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
 * Class used to create a CtcUrlTypeUpdateRequest Udt Request
 *
 */

public class CtcUrlTypeUpdateRequest extends CtcUrlTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcUrlTypeUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcUrlTypeObjectData for CtcUrlTypeUpdateRequest
 *
 */
@JsonCreator
  public CtcUrlTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcUrlType")CtcUrlTypeObjectData UpdateIn) {
    super(id, "CtcUrlTypeUpdate");
    if (UpdateIn != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(UpdateIn, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }

/**
 *
 * Retrieves the CtcUrlTypeObjectData that results from the CtcUrlTypeUpdateRequest call
 * @return CtcUrlTypeObjectData resulting from udt call
 *
 */

  public CtcUrlTypeObjectData getOutput() {
    return CtcUrlTypeObjectHelper.fromMap(outputMap, "CtcUrlType");
  }
}
