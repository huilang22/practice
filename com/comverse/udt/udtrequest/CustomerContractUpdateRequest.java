/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractUpdateRequest.java
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
 * Class used to create a CustomerContractUpdateRequest Udt Request
 *
 */

public class CustomerContractUpdateRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  CustomerContractUpdateRequest
 * @param id Unique request name
 * @param CustomerContractUpdateIn CustomerContractObjectBaseData for CustomerContractUpdateRequest
 *
 */
@JsonCreator
  public CustomerContractUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseData CustomerContractUpdateIn) {
    super(id, "CustomerContractUpdate");
    if (CustomerContractUpdateIn != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractUpdateIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectBaseData that results from the CustomerContractUpdateRequest call
 * @return CustomerContractObjectBaseData resulting from udt call
 *
 */

  public CustomerContractObjectBaseData getOutput() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
}
