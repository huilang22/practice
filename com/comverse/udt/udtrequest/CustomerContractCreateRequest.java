/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractCreateRequest.java
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
 * Class used to create a CustomerContractCreateRequest Udt Request
 *
 */

public class CustomerContractCreateRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  CustomerContractCreateRequest
 * @param id Unique request name
 * @param CustomerContractCreateExternalIn CustomerContractObjectBaseData for CustomerContractCreateRequest
 *
 */
@JsonCreator
  public CustomerContractCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseData CustomerContractCreateExternalIn) {
    super(id, "CustomerContractCreate");
    if (CustomerContractCreateExternalIn != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractCreateExternalIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectBaseData that results from the CustomerContractCreateRequest call
 * @return CustomerContractObjectBaseData resulting from udt call
 *
 */

  public CustomerContractObjectBaseData getOutput() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
}
