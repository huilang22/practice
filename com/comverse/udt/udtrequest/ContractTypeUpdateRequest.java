/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeUpdateRequest.java
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
 * Class used to create a ContractTypeUpdateRequest Udt Request
 *
 */

public class ContractTypeUpdateRequest extends ContractTypeSubRequestParent {
/**
 *
 * Constructor to create a  ContractTypeUpdateRequest
 * @param id Unique request name
 * @param CTUpdIn ContractTypeObjectData for ContractTypeUpdateRequest
 *
 */
@JsonCreator
  public ContractTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractType")ContractTypeObjectData CTUpdIn) {
    super(id, "ContractTypeUpdate");
    if (CTUpdIn != null) {
      addInput("ContractType", ContractTypeObjectHelper.toMap(CTUpdIn, new HashMap(), "ContractType").get("ContractType"));
    }
  }

/**
 *
 * Retrieves the ContractTypeObjectData that results from the ContractTypeUpdateRequest call
 * @return ContractTypeObjectData resulting from udt call
 *
 */

  public ContractTypeObjectData getOutput() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractType");
  }
}
