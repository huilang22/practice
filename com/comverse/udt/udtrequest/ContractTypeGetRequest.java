/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeGetRequest.java
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
 * Class used to create a ContractTypeGetRequest Udt Request
 *
 */

public class ContractTypeGetRequest extends ContractTypeSubRequestParent {
/**
 *
 * Constructor to create a  ContractTypeGetRequest
 * @param id Unique request name
 * @param CTGetIn ContractTypeObjectKeyData for ContractTypeGetRequest
 *
 */
@JsonCreator
  public ContractTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractType")ContractTypeObjectKeyData CTGetIn) {
    super(id, "ContractTypeGet");
    if (CTGetIn != null) {
      addInput("ContractType", ContractTypeObjectKeyHelper.toMap(CTGetIn, new HashMap(), "ContractTypeObjectKeyData").get("ContractTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ContractTypeObjectData that results from the ContractTypeGetRequest call
 * @return ContractTypeObjectData resulting from udt call
 *
 */

  public ContractTypeObjectData getOutput() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractType");
  }
}
