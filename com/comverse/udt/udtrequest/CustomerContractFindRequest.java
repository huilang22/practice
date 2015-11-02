/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractFindRequest.java
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
 * Class used to create a CustomerContractFindRequest Udt Request
 *
 */

public class CustomerContractFindRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a  CustomerContractFindRequest
 * @param id Unique request name
 * @param CustomerContractFindIn CustomerContractObjectBaseFilter for CustomerContractFindRequest
 *
 */
@JsonCreator
  public CustomerContractFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseFilter CustomerContractFindIn) {
    super(id, "CustomerContractFind");
    if (CustomerContractFindIn != null) {
      Integer index =  CustomerContractFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractFindIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectBaseDataList that results from the CustomerContractFindRequest call
 * @return CustomerContractObjectBaseDataList resulting from udt call
 *
 */

  public CustomerContractObjectBaseDataList getOutput() {
    return CustomerContractObjectBaseHelper.fromMapList(outputMap, "CustomerContractList");
  }
}
