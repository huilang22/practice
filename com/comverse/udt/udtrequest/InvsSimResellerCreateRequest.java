/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerCreateRequest.java
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
 * Class used to create a InvsSimResellerCreateRequest Udt Request
 *
 */

public class InvsSimResellerCreateRequest extends InvsSimResellerSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimResellerCreateRequest
 * @param id Unique request name
 * @param InvsSimResellerCreateIn InvsSimResellerObjectData for InvsSimResellerCreateRequest
 *
 */
@JsonCreator
  public InvsSimResellerCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimReseller")InvsSimResellerObjectData InvsSimResellerCreateIn) {
    super(id, "InvsSimResellerCreate");
    if (InvsSimResellerCreateIn != null) {
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(InvsSimResellerCreateIn, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }

/**
 *
 * Retrieves the InvsSimResellerObjectData that results from the InvsSimResellerCreateRequest call
 * @return InvsSimResellerObjectData resulting from udt call
 *
 */

  public InvsSimResellerObjectData getOutput() {
    return InvsSimResellerObjectHelper.fromMap(outputMap, "InvsSimReseller");
  }
}
