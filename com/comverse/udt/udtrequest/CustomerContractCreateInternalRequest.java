/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractCreateInternalRequest.java
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
 * Class used to create a CustomerContractCreateInternalRequest Udt Request
 *
 */

public class CustomerContractCreateInternalRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  CustomerContractCreateInternalRequest
 * @param id Unique request name
 * @param CustomerContractCreateIn CustomerContractObjectBaseData for CustomerContractCreateInternalRequest
 *
 */
@JsonCreator
  public CustomerContractCreateInternalRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseData CustomerContractCreateIn) {
    super(id, "CustomerContractCreateInternal");
    if (CustomerContractCreateIn != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractCreateIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectBaseData that results from the CustomerContractCreateInternalRequest call
 * @return CustomerContractObjectBaseData resulting from udt call
 *
 */

  public CustomerContractObjectBaseData getOutput() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
}
