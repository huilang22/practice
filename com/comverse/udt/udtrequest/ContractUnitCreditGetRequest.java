/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractUnitCreditGetRequest.java
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
 * Class used to create a ContractUnitCreditGetRequest Udt Request
 *
 */

public class ContractUnitCreditGetRequest extends ContractUnitCreditSubRequestParent {
/**
 *
 * Constructor to create a  ContractUnitCreditGetRequest
 * @param id Unique request name
 * @param getIn ContractUnitCreditObjectKeyData for ContractUnitCreditGetRequest
 *
 */
@JsonCreator
  public ContractUnitCreditGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractUnitCredit")ContractUnitCreditObjectKeyData getIn) {
    super(id, "ContractUnitCreditGet");
    if (getIn != null) {
      addInput("ContractUnitCredit", ContractUnitCreditObjectKeyHelper.toMap(getIn, new HashMap(), "ContractUnitCreditObjectKeyData").get("ContractUnitCreditObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ContractUnitCreditObjectData that results from the ContractUnitCreditGetRequest call
 * @return ContractUnitCreditObjectData resulting from udt call
 *
 */

  public ContractUnitCreditObjectData getOutput() {
    return ContractUnitCreditObjectHelper.fromMap(outputMap, "ContractUnitCredit");
  }
}
