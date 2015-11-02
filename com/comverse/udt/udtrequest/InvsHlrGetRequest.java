/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrGetRequest.java
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
 * Class used to create a InvsHlrGetRequest Udt Request
 *
 */

public class InvsHlrGetRequest extends InvsHlrSubRequestParent {
/**
 *
 * Constructor to create a  InvsHlrGetRequest
 * @param id Unique request name
 * @param InvsHlrGetIn InvsHlrObjectKeyData for InvsHlrGetRequest
 *
 */
@JsonCreator
  public InvsHlrGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsHlr")InvsHlrObjectKeyData InvsHlrGetIn) {
    super(id, "InvsHlrGet");
    if (InvsHlrGetIn != null) {
      addInput("InvsHlr", InvsHlrObjectKeyHelper.toMap(InvsHlrGetIn, new HashMap(), "InvsHlrObjectKeyData").get("InvsHlrObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsHlrObjectData that results from the InvsHlrGetRequest call
 * @return InvsHlrObjectData resulting from udt call
 *
 */

  public InvsHlrObjectData getOutput() {
    return InvsHlrObjectHelper.fromMap(outputMap, "InvsHlr");
  }
}
