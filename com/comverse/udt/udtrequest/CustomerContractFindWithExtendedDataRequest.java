/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractFindWithExtendedDataRequest.java
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
 * Class used to create a CustomerContractFindWithExtendedDataRequest Udt Request
 *
 */

public class CustomerContractFindWithExtendedDataRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a  CustomerContractFindWithExtendedDataRequest
 * @param id Unique request name
 * @param CCFindWithIn CustomerContractObjectFilter for CustomerContractFindWithExtendedDataRequest
 *
 */
@JsonCreator
  public CustomerContractFindWithExtendedDataRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectFilter CCFindWithIn) {
    super(id, "CustomerContractFindWithExtendedData");
    if (CCFindWithIn != null) {
      Integer index =  CCFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(CCFindWithIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectDataList that results from the CustomerContractFindWithExtendedDataRequest call
 * @return CustomerContractObjectDataList resulting from udt call
 *
 */

  public CustomerContractObjectDataList getOutput() {
    return CustomerContractObjectHelper.fromMapList(outputMap, "CustomerContractList");
  }
}
