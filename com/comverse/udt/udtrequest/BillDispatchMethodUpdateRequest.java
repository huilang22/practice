/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodUpdateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BillDispatchMethodUpdateRequest Udt Request
 *
 */

public class BillDispatchMethodUpdateRequest extends BillDispatchMethodSubRequestParent {
/**
 *
 * Constructor to create a  BillDispatchMethodUpdateRequest
 * @param id Unique request name
 * @param BDMUpdateIn BillDispatchMethodObjectData for BillDispatchMethodUpdateRequest
 *
 */
@JsonCreator
  public BillDispatchMethodUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillDispatchMethod")BillDispatchMethodObjectData BDMUpdateIn) {
    super(id, "BillDispatchMethodUpdate");
    if (BDMUpdateIn != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(BDMUpdateIn, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }

/**
 *
 * Retrieves the BillDispatchMethodObjectData that results from the BillDispatchMethodUpdateRequest call
 * @return BillDispatchMethodObjectData resulting from udt call
 *
 */

  public BillDispatchMethodObjectData getOutput() {
    return BillDispatchMethodObjectHelper.fromMap(outputMap, "BillDispatchMethod");
  }
}
