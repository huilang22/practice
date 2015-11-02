/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentFindRequest.java
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
 * Class used to create a PrepaymentFindRequest Udt Request
 *
 */

public class PrepaymentFindRequest extends PrepaymentRequest {
/**
 *
 * Constructor to create a  PrepaymentFindRequest
 * @param id Unique request name
 * @param findIn PrepaymentObjectFilter for PrepaymentFindRequest
 *
 */
@JsonCreator
  public PrepaymentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Prepayment")PrepaymentObjectFilter findIn) {
    super(id, "PrepaymentFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Prepayment", PrepaymentObjectHelper.toMap(findIn, new HashMap(), "Prepayment").get("Prepayment"));
    }
  }

/**
 *
 * Retrieves the PrepaymentObjectDataList that results from the PrepaymentFindRequest call
 * @return PrepaymentObjectDataList resulting from udt call
 *
 */

  public PrepaymentObjectDataList getOutput() {
    return PrepaymentObjectHelper.fromMapList(outputMap, "PrepaymentList");
  }
}
