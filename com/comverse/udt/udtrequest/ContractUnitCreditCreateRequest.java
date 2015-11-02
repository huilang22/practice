/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractUnitCreditCreateRequest.java
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
 * Class used to create a ContractUnitCreditCreateRequest Udt Request
 *
 */

public class ContractUnitCreditCreateRequest extends ContractUnitCreditSubRequestParent {
/**
 *
 * Constructor to create a  ContractUnitCreditCreateRequest
 * @param id Unique request name
 * @param ContractUnitCreditCreateIn ContractUnitCreditObjectData for ContractUnitCreditCreateRequest
 *
 */
@JsonCreator
  public ContractUnitCreditCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractUnitCredit")ContractUnitCreditObjectData ContractUnitCreditCreateIn) {
    super(id, "ContractUnitCreditCreate");
    if (ContractUnitCreditCreateIn != null) {
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(ContractUnitCreditCreateIn, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }

/**
 *
 * Retrieves the ContractUnitCreditObjectData that results from the ContractUnitCreditCreateRequest call
 * @return ContractUnitCreditObjectData resulting from udt call
 *
 */

  public ContractUnitCreditObjectData getOutput() {
    return ContractUnitCreditObjectHelper.fromMap(outputMap, "ContractUnitCredit");
  }
}
