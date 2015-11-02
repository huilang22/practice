/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractUnitCreditConfigGetRequest.java
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
 * Class used to create a ContractUnitCreditConfigGetRequest Udt Request
 *
 */

public class ContractUnitCreditConfigGetRequest extends ContractUnitCreditSubRequestParent {
/**
 *
 * Constructor to create a  ContractUnitCreditConfigGetRequest
 * @param id Unique request name
 * @param ConfigObjectIn ContractUnitCreditConfigData for ContractUnitCreditConfigGetRequest
 *
 */
@JsonCreator
  public ContractUnitCreditConfigGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractUnitCreditConfig")ContractUnitCreditConfigData ConfigObjectIn) {
    super(id, "ContractUnitCreditConfigGet");
    if (ConfigObjectIn != null) {
      addInput("ContractUnitCreditConfig", ContractUnitCreditConfigHelper.toMap(ConfigObjectIn, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }

/**
 *
 * Retrieves the ContractUnitCreditObjectData that results from the ContractUnitCreditConfigGetRequest call
 * @return ContractUnitCreditObjectData resulting from udt call
 *
 */

  public ContractUnitCreditObjectData getOutput() {
    return ContractUnitCreditObjectHelper.fromMap(outputMap, "ContractUnitCredit");
  }
}
