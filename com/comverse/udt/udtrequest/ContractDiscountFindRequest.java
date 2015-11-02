/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractDiscountFindRequest.java
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
 * Class used to create a ContractDiscountFindRequest Udt Request
 *
 */

public class ContractDiscountFindRequest extends ContractDiscountRequest {
/**
 *
 * Constructor to create a  ContractDiscountFindRequest
 * @param id Unique request name
 * @param CDFindIn ContractDiscountObjectFilter for ContractDiscountFindRequest
 *
 */
@JsonCreator
  public ContractDiscountFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractDiscount")ContractDiscountObjectFilter CDFindIn) {
    super(id, "ContractDiscountFind");
    if (CDFindIn != null) {
      Integer index =  CDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ContractDiscount", ContractDiscountObjectHelper.toMap(CDFindIn, new HashMap(), "ContractDiscount").get("ContractDiscount"));
    }
  }

/**
 *
 * Retrieves the ContractDiscountObjectDataList that results from the ContractDiscountFindRequest call
 * @return ContractDiscountObjectDataList resulting from udt call
 *
 */

  public ContractDiscountObjectDataList getOutput() {
    return ContractDiscountObjectHelper.fromMapList(outputMap, "ContractDiscountList");
  }
}
