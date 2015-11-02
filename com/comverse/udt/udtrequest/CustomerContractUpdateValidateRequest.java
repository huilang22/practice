/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractUpdateValidateRequest.java
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
 * Class used to create a CustomerContractUpdateValidateRequest Udt Request
 *
 */

public class CustomerContractUpdateValidateRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a  CustomerContractUpdateValidateRequest
 * @param id Unique request name
 * @param ContractUpdateValidateIn CustomerContractObjectBaseData for CustomerContractUpdateValidateRequest
 * @param EffectiveDt Date for CustomerContractUpdateValidateRequest
 *
 */
@JsonCreator
  public CustomerContractUpdateValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseData ContractUpdateValidateIn, @JsonProperty("EffectiveDt")Date EffectiveDt) {
    super(id, "CustomerContractUpdateValidate");
    if (ContractUpdateValidateIn != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(ContractUpdateValidateIn, new HashMap(), "Void").get("Void"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
  }

}
