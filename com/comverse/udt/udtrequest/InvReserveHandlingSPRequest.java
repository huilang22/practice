/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvReserveHandlingSPRequest.java
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
 * Class used to create a InvReserveHandlingSPRequest Udt Request
 *
 */

public class InvReserveHandlingSPRequest extends InvdReserveEndRequest {
/**
 *
 * Constructor to create a  InvReserveHandlingSPRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public InvReserveHandlingSPRequest(@JsonProperty("RequestId") String id) {
    super(id, "InvReserveHandlingSP");
  }

/**
 *
 * Retrieves the Integer that results from the InvReserveHandlingSPRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("VCount");
  }
}
