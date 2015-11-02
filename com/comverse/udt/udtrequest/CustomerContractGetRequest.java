/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractGetRequest.java
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
 * Class used to create a CustomerContractGetRequest Udt Request
 *
 */

public class CustomerContractGetRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  CustomerContractGetRequest
 * @param id Unique request name
 * @param CustomerContractGetIn CustomerContractObjectBaseKeyData for CustomerContractGetRequest
 *
 */
@JsonCreator
  public CustomerContractGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseKeyData CustomerContractGetIn) {
    super(id, "CustomerContractGet");
    if (CustomerContractGetIn != null) {
      addInput("CustomerContract", CustomerContractObjectBaseKeyHelper.toMap(CustomerContractGetIn, new HashMap(), "CustomerContractObjectBaseKeyData").get("CustomerContractObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectBaseData that results from the CustomerContractGetRequest call
 * @return CustomerContractObjectBaseData resulting from udt call
 *
 */

  public CustomerContractObjectBaseData getOutput() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
}
