/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractDeleteListRequest.java
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
 * Class used to create a CustomerContractDeleteListRequest Udt Request
 *
 */

public class CustomerContractDeleteListRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a  CustomerContractDeleteListRequest
 * @param id Unique request name
 * @param CustomerContractDeleteListIn CustomerContractObjectBaseFilter for CustomerContractDeleteListRequest
 *
 */
@JsonCreator
  public CustomerContractDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseFilter CustomerContractDeleteListIn) {
    super(id, "CustomerContractDeleteList");
    if (CustomerContractDeleteListIn != null) {
      Integer index =  CustomerContractDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractDeleteListIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectBaseDataList that results from the CustomerContractDeleteListRequest call
 * @return CustomerContractObjectBaseDataList resulting from udt call
 *
 */

  public CustomerContractObjectBaseDataList getOutput() {
    return CustomerContractObjectBaseHelper.fromMapList(outputMap, "CustomerContractList");
  }
}
