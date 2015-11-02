/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodFindRequest.java
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
 * Class used to create a BillDispatchMethodFindRequest Udt Request
 *
 */

public class BillDispatchMethodFindRequest extends BillDispatchMethodRequest {
/**
 *
 * Constructor to create a  BillDispatchMethodFindRequest
 * @param id Unique request name
 * @param BDMFindIn BillDispatchMethodObjectFilter for BillDispatchMethodFindRequest
 *
 */
@JsonCreator
  public BillDispatchMethodFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillDispatchMethod")BillDispatchMethodObjectFilter BDMFindIn) {
    super(id, "BillDispatchMethodFind");
    if (BDMFindIn != null) {
      Integer index =  BDMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(BDMFindIn, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }

/**
 *
 * Retrieves the BillDispatchMethodObjectDataList that results from the BillDispatchMethodFindRequest call
 * @return BillDispatchMethodObjectDataList resulting from udt call
 *
 */

  public BillDispatchMethodObjectDataList getOutput() {
    return BillDispatchMethodObjectHelper.fromMapList(outputMap, "BillDispatchMethodList");
  }
}
