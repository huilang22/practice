/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractUnitCreditUpdateRequest.java
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
 * Class used to create a ContractUnitCreditUpdateRequest Udt Request
 *
 */

public class ContractUnitCreditUpdateRequest extends ContractUnitCreditSubRequestParent {
/**
 *
 * Constructor to create a  ContractUnitCreditUpdateRequest
 * @param id Unique request name
 * @param ContractUnitCreditUpdateIn ContractUnitCreditObjectData for ContractUnitCreditUpdateRequest
 *
 */
@JsonCreator
  public ContractUnitCreditUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractUnitCredit")ContractUnitCreditObjectData ContractUnitCreditUpdateIn) {
    super(id, "ContractUnitCreditUpdate");
    if (ContractUnitCreditUpdateIn != null) {
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(ContractUnitCreditUpdateIn, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }

/**
 *
 * Retrieves the ContractUnitCreditObjectData that results from the ContractUnitCreditUpdateRequest call
 * @return ContractUnitCreditObjectData resulting from udt call
 *
 */

  public ContractUnitCreditObjectData getOutput() {
    return ContractUnitCreditObjectHelper.fromMap(outputMap, "ContractUnitCredit");
  }
}
