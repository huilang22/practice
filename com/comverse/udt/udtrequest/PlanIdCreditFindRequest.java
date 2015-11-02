/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PlanIdCreditFindRequest Udt Request
 *
 */

public class PlanIdCreditFindRequest extends PlanIdCreditRequest {
/**
 *
 * Constructor to create a  PlanIdCreditFindRequest
 * @param id Unique request name
 * @param picFindIn PlanIdCreditObjectFilter for PlanIdCreditFindRequest
 *
 */
@JsonCreator
  public PlanIdCreditFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PlanIdCredit")PlanIdCreditObjectFilter picFindIn) {
    super(id, "PlanIdCreditFind");
    if (picFindIn != null) {
      Integer index =  picFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(picFindIn, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }

/**
 *
 * Retrieves the PlanIdCreditObjectDataList that results from the PlanIdCreditFindRequest call
 * @return PlanIdCreditObjectDataList resulting from udt call
 *
 */

  public PlanIdCreditObjectDataList getOutput() {
    return PlanIdCreditObjectHelper.fromMapList(outputMap, "PlanIdCreditList");
  }
}
