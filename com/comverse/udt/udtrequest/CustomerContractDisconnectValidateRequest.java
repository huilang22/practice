/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractDisconnectValidateRequest.java
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
 * Class used to create a CustomerContractDisconnectValidateRequest Udt Request
 *
 */

public class CustomerContractDisconnectValidateRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a  CustomerContractDisconnectValidateRequest
 * @param id Unique request name
 * @param ContractDisconnectValidateIn CustomerContractObjectBaseData for CustomerContractDisconnectValidateRequest
 *
 */
@JsonCreator
  public CustomerContractDisconnectValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseData ContractDisconnectValidateIn) {
    super(id, "CustomerContractDisconnectValidate");
    if (ContractDisconnectValidateIn != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(ContractDisconnectValidateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
