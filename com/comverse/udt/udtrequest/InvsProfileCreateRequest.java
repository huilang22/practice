/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsProfileCreateRequest.java
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
 * Class used to create a InvsProfileCreateRequest Udt Request
 *
 */

public class InvsProfileCreateRequest extends InvsProfileSubRequestParent {
/**
 *
 * Constructor to create a  InvsProfileCreateRequest
 * @param id Unique request name
 * @param InvsProfileCreateIn InvsProfileObjectData for InvsProfileCreateRequest
 *
 */
@JsonCreator
  public InvsProfileCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsProfile")InvsProfileObjectData InvsProfileCreateIn) {
    super(id, "InvsProfileCreate");
    if (InvsProfileCreateIn != null) {
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(InvsProfileCreateIn, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }

/**
 *
 * Retrieves the InvsProfileObjectData that results from the InvsProfileCreateRequest call
 * @return InvsProfileObjectData resulting from udt call
 *
 */

  public InvsProfileObjectData getOutput() {
    return InvsProfileObjectHelper.fromMap(outputMap, "InvsProfile");
  }
}
