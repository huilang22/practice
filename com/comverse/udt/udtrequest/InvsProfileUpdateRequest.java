/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsProfileUpdateRequest.java
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
 * Class used to create a InvsProfileUpdateRequest Udt Request
 *
 */

public class InvsProfileUpdateRequest extends InvsProfileSubRequestParent {
/**
 *
 * Constructor to create a  InvsProfileUpdateRequest
 * @param id Unique request name
 * @param InvsProfileUpdateIn InvsProfileObjectData for InvsProfileUpdateRequest
 *
 */
@JsonCreator
  public InvsProfileUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsProfile")InvsProfileObjectData InvsProfileUpdateIn) {
    super(id, "InvsProfileUpdate");
    if (InvsProfileUpdateIn != null) {
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(InvsProfileUpdateIn, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }

/**
 *
 * Retrieves the InvsProfileObjectData that results from the InvsProfileUpdateRequest call
 * @return InvsProfileObjectData resulting from udt call
 *
 */

  public InvsProfileObjectData getOutput() {
    return InvsProfileObjectHelper.fromMap(outputMap, "InvsProfile");
  }
}
