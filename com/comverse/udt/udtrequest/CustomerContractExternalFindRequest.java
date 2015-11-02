/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractExternalFindRequest.java
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
 * Class used to create a CustomerContractExternalFindRequest Udt Request
 *
 */

public class CustomerContractExternalFindRequest extends CustomerContractRequest {
/**
 *
 * Constructor to create a  CustomerContractExternalFindRequest
 * @param id Unique request name
 * @param ContractXIDFindIn CustomerContractObjectFilter for CustomerContractExternalFindRequest
 *
 */
@JsonCreator
  public CustomerContractExternalFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectFilter ContractXIDFindIn) {
    super(id, "CustomerContractExternalFind");
    if (ContractXIDFindIn != null) {
      Integer index =  ContractXIDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(ContractXIDFindIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectDataList that results from the CustomerContractExternalFindRequest call
 * @return CustomerContractObjectDataList resulting from udt call
 *
 */

  public CustomerContractObjectDataList getOutput() {
    return CustomerContractObjectHelper.fromMapList(outputMap, "CustomerContractList");
  }
}
