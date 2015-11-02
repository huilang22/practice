/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeValidateCreateRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ContractTypeValidateCreateRequest Udt Request
 *
 */

public class ContractTypeValidateCreateRequest extends ContractTypeValidateSubRequestParent {
/**
 *
 * Constructor to create a  ContractTypeValidateCreateRequest
 * @param id Unique request name
 * @param ContractTypeIn ContractTypeObjectData for ContractTypeValidateCreateRequest
 * @param ServiceInternalId Integer for ContractTypeValidateCreateRequest
 * @param ServiceInternalIdResets Integer for ContractTypeValidateCreateRequest
 *
 */
@JsonCreator
  public ContractTypeValidateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractTypeValidate")ContractTypeObjectData ContractTypeIn, @JsonProperty("ServiceInternalId")Integer ServiceInternalId, @JsonProperty("ServiceInternalIdResets")Integer ServiceInternalIdResets) {
    super(id, "ContractTypeValidateCreate");
    if (ContractTypeIn != null) {
      addInput("ContractTypeValidate", ContractTypeObjectHelper.toMap(ContractTypeIn, new HashMap(), "ContractTypeValidate").get("ContractTypeValidate"));
    }
    if (ServiceInternalId != null) {
      addInput("ServiceInternalId", ServiceInternalId);
    }
    if (ServiceInternalIdResets != null) {
      addInput("ServiceInternalIdResets", ServiceInternalIdResets);
    }
  }

/**
 *
 * Retrieves the ContractTypeObjectData that results from the ContractTypeValidateCreateRequest call
 * @return ContractTypeObjectData resulting from udt call
 *
 */

  public ContractTypeObjectData getOutput() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractTypeValidate");
  }
}
