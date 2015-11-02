/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerUpdateRequest.java
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
 * Class used to create a InvsSimResellerUpdateRequest Udt Request
 *
 */

public class InvsSimResellerUpdateRequest extends InvsSimResellerSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimResellerUpdateRequest
 * @param id Unique request name
 * @param InvsSimResellerUpdateIn InvsSimResellerObjectData for InvsSimResellerUpdateRequest
 *
 */
@JsonCreator
  public InvsSimResellerUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimReseller")InvsSimResellerObjectData InvsSimResellerUpdateIn) {
    super(id, "InvsSimResellerUpdate");
    if (InvsSimResellerUpdateIn != null) {
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(InvsSimResellerUpdateIn, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }

/**
 *
 * Retrieves the InvsSimResellerObjectData that results from the InvsSimResellerUpdateRequest call
 * @return InvsSimResellerObjectData resulting from udt call
 *
 */

  public InvsSimResellerObjectData getOutput() {
    return InvsSimResellerObjectHelper.fromMap(outputMap, "InvsSimReseller");
  }
}
