/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillCycleGetRequest.java
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
 * Class used to create a BillCycleGetRequest Udt Request
 *
 */

public class BillCycleGetRequest extends BillCycleSubRequestParent {
/**
 *
 * Constructor to create a  BillCycleGetRequest
 * @param id Unique request name
 * @param BillCyclegetIn BillCycleObjectKeyData for BillCycleGetRequest
 *
 */
@JsonCreator
  public BillCycleGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillCycle")BillCycleObjectKeyData BillCyclegetIn) {
    super(id, "BillCycleGet");
    if (BillCyclegetIn != null) {
      addInput("BillCycle", BillCycleObjectKeyHelper.toMap(BillCyclegetIn, new HashMap(), "BillCycleObjectKeyData").get("BillCycleObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillCycleObjectData that results from the BillCycleGetRequest call
 * @return BillCycleObjectData resulting from udt call
 *
 */

  public BillCycleObjectData getOutput() {
    return BillCycleObjectHelper.fromMap(outputMap, "BillCycle");
  }
}
