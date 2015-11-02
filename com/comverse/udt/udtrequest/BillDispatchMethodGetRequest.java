/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodGetRequest.java
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
 * Class used to create a BillDispatchMethodGetRequest Udt Request
 *
 */

public class BillDispatchMethodGetRequest extends BillDispatchMethodSubRequestParent {
/**
 *
 * Constructor to create a  BillDispatchMethodGetRequest
 * @param id Unique request name
 * @param BDMGetIn BillDispatchMethodObjectKeyData for BillDispatchMethodGetRequest
 *
 */
@JsonCreator
  public BillDispatchMethodGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillDispatchMethod")BillDispatchMethodObjectKeyData BDMGetIn) {
    super(id, "BillDispatchMethodGet");
    if (BDMGetIn != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectKeyHelper.toMap(BDMGetIn, new HashMap(), "BillDispatchMethodObjectKeyData").get("BillDispatchMethodObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillDispatchMethodObjectData that results from the BillDispatchMethodGetRequest call
 * @return BillDispatchMethodObjectData resulting from udt call
 *
 */

  public BillDispatchMethodObjectData getOutput() {
    return BillDispatchMethodObjectHelper.fromMap(outputMap, "BillDispatchMethod");
  }
}
