/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractDiscountGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ContractDiscountGetRequest Udt Request
 *
 */

public class ContractDiscountGetRequest extends ContractDiscountSubRequestParent {
/**
 *
 * Constructor to create a  ContractDiscountGetRequest
 * @param id Unique request name
 * @param CDGetIn ContractDiscountObjectKeyData for ContractDiscountGetRequest
 *
 */
@JsonCreator
  public ContractDiscountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractDiscount")ContractDiscountObjectKeyData CDGetIn) {
    super(id, "ContractDiscountGet");
    if (CDGetIn != null) {
      addInput("ContractDiscount", ContractDiscountObjectKeyHelper.toMap(CDGetIn, new HashMap(), "ContractDiscountObjectKeyData").get("ContractDiscountObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ContractDiscountObjectData that results from the ContractDiscountGetRequest call
 * @return ContractDiscountObjectData resulting from udt call
 *
 */

  public ContractDiscountObjectData getOutput() {
    return ContractDiscountObjectHelper.fromMap(outputMap, "ContractDiscount");
  }
}
