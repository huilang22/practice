/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeCreateRequest.java
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
 * Class used to create a ContractTypeCreateRequest Udt Request
 *
 */

public class ContractTypeCreateRequest extends ContractTypeSubRequestParent {
/**
 *
 * Constructor to create a  ContractTypeCreateRequest
 * @param id Unique request name
 * @param CTCrIn ContractTypeObjectData for ContractTypeCreateRequest
 *
 */
@JsonCreator
  public ContractTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractType")ContractTypeObjectData CTCrIn) {
    super(id, "ContractTypeCreate");
    if (CTCrIn != null) {
      addInput("ContractType", ContractTypeObjectHelper.toMap(CTCrIn, new HashMap(), "ContractType").get("ContractType"));
    }
  }

/**
 *
 * Retrieves the ContractTypeObjectData that results from the ContractTypeCreateRequest call
 * @return ContractTypeObjectData resulting from udt call
 *
 */

  public ContractTypeObjectData getOutput() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractType");
  }
}
