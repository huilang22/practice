/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractAlternateGetRequest.java
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
 * Class used to create a CustomerContractAlternateGetRequest Udt Request
 *
 */

public class CustomerContractAlternateGetRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  CustomerContractAlternateGetRequest
 * @param id Unique request name
 * @param CustomerContractAlternateGetIn CustomerContractObjectBaseData for CustomerContractAlternateGetRequest
 *
 */
@JsonCreator
  public CustomerContractAlternateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseData CustomerContractAlternateGetIn) {
    super(id, "CustomerContractAlternateGet");
    if (CustomerContractAlternateGetIn != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractAlternateGetIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectBaseData that results from the CustomerContractAlternateGetRequest call
 * @return CustomerContractObjectBaseData resulting from udt call
 *
 */

  public CustomerContractObjectBaseData getOutput() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
}
