/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndCreateRequest.java
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
 * Class used to create a InvdReserveEndCreateRequest Udt Request
 *
 */

public class InvdReserveEndCreateRequest extends InvdReserveEndSubRequestParent {
/**
 *
 * Constructor to create a  InvdReserveEndCreateRequest
 * @param id Unique request name
 * @param InvdReserveEndCreateIn InvdReserveEndObjectData for InvdReserveEndCreateRequest
 *
 */
@JsonCreator
  public InvdReserveEndCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdReserveEnd")InvdReserveEndObjectData InvdReserveEndCreateIn) {
    super(id, "InvdReserveEndCreate");
    if (InvdReserveEndCreateIn != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(InvdReserveEndCreateIn, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }

/**
 *
 * Retrieves the InvdReserveEndObjectData that results from the InvdReserveEndCreateRequest call
 * @return InvdReserveEndObjectData resulting from udt call
 *
 */

  public InvdReserveEndObjectData getOutput() {
    return InvdReserveEndObjectHelper.fromMap(outputMap, "InvdReserveEnd");
  }
}
