/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeCreateRequest.java
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
 * Class used to create a CtcUrlTypeCreateRequest Udt Request
 *
 */

public class CtcUrlTypeCreateRequest extends CtcUrlTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcUrlTypeCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcUrlTypeObjectData for CtcUrlTypeCreateRequest
 *
 */
@JsonCreator
  public CtcUrlTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcUrlType")CtcUrlTypeObjectData CreateIn) {
    super(id, "CtcUrlTypeCreate");
    if (CreateIn != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(CreateIn, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }

/**
 *
 * Retrieves the CtcUrlTypeObjectData that results from the CtcUrlTypeCreateRequest call
 * @return CtcUrlTypeObjectData resulting from udt call
 *
 */

  public CtcUrlTypeObjectData getOutput() {
    return CtcUrlTypeObjectHelper.fromMap(outputMap, "CtcUrlType");
  }
}
