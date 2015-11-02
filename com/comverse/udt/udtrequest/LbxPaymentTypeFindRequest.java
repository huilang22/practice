/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LbxPaymentTypeFindRequest.java
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
 * Class used to create a LbxPaymentTypeFindRequest Udt Request
 *
 */

public class LbxPaymentTypeFindRequest extends LbxPaymentTypeRequest {
/**
 *
 * Constructor to create a  LbxPaymentTypeFindRequest
 * @param id Unique request name
 * @param LSFindIn LbxPaymentTypeObjectFilter for LbxPaymentTypeFindRequest
 *
 */
@JsonCreator
  public LbxPaymentTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("LbxPaymentType")LbxPaymentTypeObjectFilter LSFindIn) {
    super(id, "LbxPaymentTypeFind");
    if (LSFindIn != null) {
      Integer index =  LSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LbxPaymentType", LbxPaymentTypeObjectHelper.toMap(LSFindIn, new HashMap(), "LbxPaymentType").get("LbxPaymentType"));
    }
  }

/**
 *
 * Retrieves the LbxPaymentTypeObjectDataList that results from the LbxPaymentTypeFindRequest call
 * @return LbxPaymentTypeObjectDataList resulting from udt call
 *
 */

  public LbxPaymentTypeObjectDataList getOutput() {
    return LbxPaymentTypeObjectHelper.fromMapList(outputMap, "LbxPaymentTypeList");
  }
}
