/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeFindRequest.java
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
 * Class used to create a DepositTypeFindRequest Udt Request
 *
 */

public class DepositTypeFindRequest extends DepositTypeRequest {
/**
 *
 * Constructor to create a  DepositTypeFindRequest
 * @param id Unique request name
 * @param DTFindIn DepositTypeObjectFilter for DepositTypeFindRequest
 *
 */
@JsonCreator
  public DepositTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DepositType")DepositTypeObjectFilter DTFindIn) {
    super(id, "DepositTypeFind");
    if (DTFindIn != null) {
      Integer index =  DTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DepositType", DepositTypeObjectHelper.toMap(DTFindIn, new HashMap(), "DepositType").get("DepositType"));
    }
  }

/**
 *
 * Retrieves the DepositTypeObjectDataList that results from the DepositTypeFindRequest call
 * @return DepositTypeObjectDataList resulting from udt call
 *
 */

  public DepositTypeObjectDataList getOutput() {
    return DepositTypeObjectHelper.fromMapList(outputMap, "DepositTypeList");
  }
}
