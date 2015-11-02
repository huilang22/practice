/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractFindByServiceOrderRequest.java
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
 * Class used to create a CustomerContractFindByServiceOrderRequest Udt Request
 *
 */

public class CustomerContractFindByServiceOrderRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a  CustomerContractFindByServiceOrderRequest
 * @param id Unique request name
 * @param CustomerContractFindByServiceOrderIn CustomerContractObjectBaseFilter for CustomerContractFindByServiceOrderRequest
 * @param ServiceOrderId String for CustomerContractFindByServiceOrderRequest
 *
 */
@JsonCreator
  public CustomerContractFindByServiceOrderRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseFilter CustomerContractFindByServiceOrderIn, @JsonProperty("ServiceOrderId")String ServiceOrderId) {
    super(id, "CustomerContractFindByServiceOrder");
    if (CustomerContractFindByServiceOrderIn != null) {
      Integer index =  CustomerContractFindByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractFindByServiceOrderIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectBaseDataList that results from the CustomerContractFindByServiceOrderRequest call
 * @return CustomerContractObjectBaseDataList resulting from udt call
 *
 */

  public CustomerContractObjectBaseDataList getOutput() {
    return CustomerContractObjectBaseHelper.fromMapList(outputMap, "CustomerContractList");
  }
}
