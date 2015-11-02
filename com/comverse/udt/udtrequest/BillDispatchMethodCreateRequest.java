/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodCreateRequest.java
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
 * Class used to create a BillDispatchMethodCreateRequest Udt Request
 *
 */

public class BillDispatchMethodCreateRequest extends BillDispatchMethodSubRequestParent {
/**
 *
 * Constructor to create a  BillDispatchMethodCreateRequest
 * @param id Unique request name
 * @param BDMCreateIn BillDispatchMethodObjectData for BillDispatchMethodCreateRequest
 *
 */
@JsonCreator
  public BillDispatchMethodCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillDispatchMethod")BillDispatchMethodObjectData BDMCreateIn) {
    super(id, "BillDispatchMethodCreate");
    if (BDMCreateIn != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(BDMCreateIn, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }

/**
 *
 * Retrieves the BillDispatchMethodObjectData that results from the BillDispatchMethodCreateRequest call
 * @return BillDispatchMethodObjectData resulting from udt call
 *
 */

  public BillDispatchMethodObjectData getOutput() {
    return BillDispatchMethodObjectHelper.fromMap(outputMap, "BillDispatchMethod");
  }
}
