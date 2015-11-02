/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrCreateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsHlrCreateRequest Udt Request
 *
 */

public class InvsHlrCreateRequest extends InvsHlrSubRequestParent {
/**
 *
 * Constructor to create a  InvsHlrCreateRequest
 * @param id Unique request name
 * @param InvsHlrCreateIn InvsHlrObjectData for InvsHlrCreateRequest
 *
 */
@JsonCreator
  public InvsHlrCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsHlr")InvsHlrObjectData InvsHlrCreateIn) {
    super(id, "InvsHlrCreate");
    if (InvsHlrCreateIn != null) {
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(InvsHlrCreateIn, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }

/**
 *
 * Retrieves the InvsHlrObjectData that results from the InvsHlrCreateRequest call
 * @return InvsHlrObjectData resulting from udt call
 *
 */

  public InvsHlrObjectData getOutput() {
    return InvsHlrObjectHelper.fromMap(outputMap, "InvsHlr");
  }
}
