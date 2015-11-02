/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractExtendedDataFindRequest.java
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
 * Class used to create a CustomerContractExtendedDataFindRequest Udt Request
 *
 */

public class CustomerContractExtendedDataFindRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a  CustomerContractExtendedDataFindRequest
 * @param id Unique request name
 * @param ccedfIn CustomerContractObjectBaseKeyData for CustomerContractExtendedDataFindRequest
 *
 */
@JsonCreator
  public CustomerContractExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseKeyData ccedfIn) {
    super(id, "CustomerContractExtendedDataFind");
    if (ccedfIn != null) {
      addInput("CustomerContract", CustomerContractObjectBaseKeyHelper.toMap(ccedfIn, new HashMap(), "CustomerContractObjectBaseKeyData").get("CustomerContractObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the CustomerContractEDObjectDataList that results from the CustomerContractExtendedDataFindRequest call
 * @return CustomerContractEDObjectDataList resulting from udt call
 *
 */

  public CustomerContractEDObjectDataList getOutput() {
    return CustomerContractEDObjectHelper.fromMapList(outputMap, "CustomerContractExtendedDataList");
  }
}
