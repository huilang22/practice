/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillFindRequest.java
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
 * Class used to create a InterimBillFindRequest Udt Request
 *
 */

public class InterimBillFindRequest extends InterimBillRequest {
/**
 *
 * Constructor to create a  InterimBillFindRequest
 * @param id Unique request name
 * @param findIn InterimBillObjectFilter for InterimBillFindRequest
 *
 */
@JsonCreator
  public InterimBillFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InterimBill")InterimBillObjectFilter findIn) {
    super(id, "InterimBillFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InterimBill", InterimBillObjectHelper.toMap(findIn, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }

/**
 *
 * Retrieves the InterimBillObjectDataList that results from the InterimBillFindRequest call
 * @return InterimBillObjectDataList resulting from udt call
 *
 */

  public InterimBillObjectDataList getOutput() {
    return InterimBillObjectHelper.fromMapList(outputMap, "InterimBillList");
  }
}
