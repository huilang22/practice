/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypePriceRequest.java
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
 * Class used to create a ContractTypePriceRequest Udt Request
 *
 */

public class ContractTypePriceRequest extends ContractTypeRequest {
/**
 *
 * Constructor to create a  ContractTypePriceRequest
 * @param id Unique request name
 * @param ctpContractTypeIn ContractTypeObjectKeyData for ContractTypePriceRequest
 * @param ctpRatingKeyIn RatingKeyObjectData for ContractTypePriceRequest
 *
 */
@JsonCreator
  public ContractTypePriceRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractType")ContractTypeObjectKeyData ctpContractTypeIn, @JsonProperty("RatingKey")RatingKeyObjectData ctpRatingKeyIn) {
    super(id, "ContractTypePrice");
    if (ctpContractTypeIn != null) {
      addInput("ContractType", ContractTypeObjectKeyHelper.toMap(ctpContractTypeIn, new HashMap(), "ContractTypeObjectKeyData").get("ContractTypeObjectKeyData"));
    }
    if (ctpRatingKeyIn != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(ctpRatingKeyIn, new HashMap(), "CtPrice").get("CtPrice"));
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the ContractTypePriceRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("CtPrice");
  }
}
