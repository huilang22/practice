/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrUpdateRequest.java
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
 * Class used to create a InvsHlrUpdateRequest Udt Request
 *
 */

public class InvsHlrUpdateRequest extends InvsHlrSubRequestParent {
/**
 *
 * Constructor to create a  InvsHlrUpdateRequest
 * @param id Unique request name
 * @param InvsHlrUpdateIn InvsHlrObjectData for InvsHlrUpdateRequest
 *
 */
@JsonCreator
  public InvsHlrUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsHlr")InvsHlrObjectData InvsHlrUpdateIn) {
    super(id, "InvsHlrUpdate");
    if (InvsHlrUpdateIn != null) {
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(InvsHlrUpdateIn, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }

/**
 *
 * Retrieves the InvsHlrObjectData that results from the InvsHlrUpdateRequest call
 * @return InvsHlrObjectData resulting from udt call
 *
 */

  public InvsHlrObjectData getOutput() {
    return InvsHlrObjectHelper.fromMap(outputMap, "InvsHlr");
  }
}
