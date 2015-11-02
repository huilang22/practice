/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndUpdateRequest.java
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
 * Class used to create a InvdReserveEndUpdateRequest Udt Request
 *
 */

public class InvdReserveEndUpdateRequest extends InvdReserveEndSubRequestParent {
/**
 *
 * Constructor to create a  InvdReserveEndUpdateRequest
 * @param id Unique request name
 * @param InvdReserveEndUpdateIn InvdReserveEndObjectData for InvdReserveEndUpdateRequest
 *
 */
@JsonCreator
  public InvdReserveEndUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdReserveEnd")InvdReserveEndObjectData InvdReserveEndUpdateIn) {
    super(id, "InvdReserveEndUpdate");
    if (InvdReserveEndUpdateIn != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(InvdReserveEndUpdateIn, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }

/**
 *
 * Retrieves the InvdReserveEndObjectData that results from the InvdReserveEndUpdateRequest call
 * @return InvdReserveEndObjectData resulting from udt call
 *
 */

  public InvdReserveEndObjectData getOutput() {
    return InvdReserveEndObjectHelper.fromMap(outputMap, "InvdReserveEnd");
  }
}
