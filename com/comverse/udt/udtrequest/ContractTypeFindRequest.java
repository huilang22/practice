/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ContractTypeFindRequest Udt Request
 *
 */

public class ContractTypeFindRequest extends ContractTypeRequest {
/**
 *
 * Constructor to create a  ContractTypeFindRequest
 * @param id Unique request name
 * @param CTFndIn ContractTypeObjectFilter for ContractTypeFindRequest
 *
 */
@JsonCreator
  public ContractTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractType")ContractTypeObjectFilter CTFndIn) {
    super(id, "ContractTypeFind");
    if (CTFndIn != null) {
      Integer index =  CTFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ContractType", ContractTypeObjectHelper.toMap(CTFndIn, new HashMap(), "ContractType").get("ContractType"));
    }
  }

/**
 *
 * Retrieves the ContractTypeObjectDataList that results from the ContractTypeFindRequest call
 * @return ContractTypeObjectDataList resulting from udt call
 *
 */

  public ContractTypeObjectDataList getOutput() {
    return ContractTypeObjectHelper.fromMapList(outputMap, "ContractTypeList");
  }
}
