/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodDeleteRequest.java
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
 * Class used to create a BillDispatchMethodDeleteRequest Udt Request
 *
 */

public class BillDispatchMethodDeleteRequest extends BillDispatchMethodSubRequestParent {
/**
 *
 * Constructor to create a  BillDispatchMethodDeleteRequest
 * @param id Unique request name
 * @param BDMDeleteIn BillDispatchMethodObjectKeyData for BillDispatchMethodDeleteRequest
 *
 */
@JsonCreator
  public BillDispatchMethodDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillDispatchMethod")BillDispatchMethodObjectKeyData BDMDeleteIn) {
    super(id, "BillDispatchMethodDelete");
    if (BDMDeleteIn != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectKeyHelper.toMap(BDMDeleteIn, new HashMap(), "BillDispatchMethodObjectKeyData").get("BillDispatchMethodObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillDispatchMethodObjectData that results from the BillDispatchMethodDeleteRequest call
 * @return BillDispatchMethodObjectData resulting from udt call
 *
 */

  public BillDispatchMethodObjectData getOutput() {
    return BillDispatchMethodObjectHelper.fromMap(outputMap, "BillDispatchMethod");
  }
}
