/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractHqFindRequest.java
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
 * Class used to create a CustomerContractHqFindRequest Udt Request
 *
 */

public class CustomerContractHqFindRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a  CustomerContractHqFindRequest
 * @param id Unique request name
 * @param CustomerContractHqFindIn CustomerContractObjectBaseFilter for CustomerContractHqFindRequest
 *
 */
@JsonCreator
  public CustomerContractHqFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseFilter CustomerContractHqFindIn) {
    super(id, "CustomerContractHqFind");
    if (CustomerContractHqFindIn != null) {
      Integer index =  CustomerContractHqFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractHqFindIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectBaseDataList that results from the CustomerContractHqFindRequest call
 * @return CustomerContractObjectBaseDataList resulting from udt call
 *
 */

  public CustomerContractObjectBaseDataList getOutput() {
    return CustomerContractObjectBaseHelper.fromMapList(outputMap, "CustomerContractList");
  }
}
