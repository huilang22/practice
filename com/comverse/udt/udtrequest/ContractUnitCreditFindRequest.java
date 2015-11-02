/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractUnitCreditFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ContractUnitCreditFindRequest Udt Request
 *
 */

public class ContractUnitCreditFindRequest extends ContractUnitCreditRequest {
/**
 *
 * Constructor to create a  ContractUnitCreditFindRequest
 * @param id Unique request name
 * @param findIn ContractUnitCreditObjectFilter for ContractUnitCreditFindRequest
 *
 */
@JsonCreator
  public ContractUnitCreditFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractUnitCredit")ContractUnitCreditObjectFilter findIn) {
    super(id, "ContractUnitCreditFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(findIn, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }

/**
 *
 * Retrieves the ContractUnitCreditObjectDataList that results from the ContractUnitCreditFindRequest call
 * @return ContractUnitCreditObjectDataList resulting from udt call
 *
 */

  public ContractUnitCreditObjectDataList getOutput() {
    return ContractUnitCreditObjectHelper.fromMapList(outputMap, "ContractUnitCreditList");
  }
}
