/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndGetRequest.java
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
 * Class used to create a InvdReserveEndGetRequest Udt Request
 *
 */

public class InvdReserveEndGetRequest extends InvdReserveEndSubRequestParent {
/**
 *
 * Constructor to create a  InvdReserveEndGetRequest
 * @param id Unique request name
 * @param InvdReserveEndGetIn InvdReserveEndObjectKeyData for InvdReserveEndGetRequest
 *
 */
@JsonCreator
  public InvdReserveEndGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdReserveEnd")InvdReserveEndObjectKeyData InvdReserveEndGetIn) {
    super(id, "InvdReserveEndGet");
    if (InvdReserveEndGetIn != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectKeyHelper.toMap(InvdReserveEndGetIn, new HashMap(), "InvdReserveEndObjectKeyData").get("InvdReserveEndObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvdReserveEndObjectData that results from the InvdReserveEndGetRequest call
 * @return InvdReserveEndObjectData resulting from udt call
 *
 */

  public InvdReserveEndObjectData getOutput() {
    return InvdReserveEndObjectHelper.fromMap(outputMap, "InvdReserveEnd");
  }
}
