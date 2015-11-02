/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobtypeUpdateRequest.java
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
 * Class used to create a InvsJobtypeUpdateRequest Udt Request
 *
 */

public class InvsJobtypeUpdateRequest extends InvsJobtypeSubRequestParent {
/**
 *
 * Constructor to create a  InvsJobtypeUpdateRequest
 * @param id Unique request name
 * @param InvsJobtypeUpdateIn InvsJobtypeObjectData for InvsJobtypeUpdateRequest
 *
 */
@JsonCreator
  public InvsJobtypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsJobtype")InvsJobtypeObjectData InvsJobtypeUpdateIn) {
    super(id, "InvsJobtypeUpdate");
    if (InvsJobtypeUpdateIn != null) {
      addInput("InvsJobtype", InvsJobtypeObjectHelper.toMap(InvsJobtypeUpdateIn, new HashMap(), "InvsJobtype").get("InvsJobtype"));
    }
  }

/**
 *
 * Retrieves the InvsJobtypeObjectData that results from the InvsJobtypeUpdateRequest call
 * @return InvsJobtypeObjectData resulting from udt call
 *
 */

  public InvsJobtypeObjectData getOutput() {
    return InvsJobtypeObjectHelper.fromMap(outputMap, "InvsJobtype");
  }
}
