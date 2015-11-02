/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a HqGroupContractsFindRequest Udt Request
 *
 */

public class HqGroupContractsFindRequest extends HqGroupContractsRequest {
/**
 *
 * Constructor to create a  HqGroupContractsFindRequest
 * @param id Unique request name
 * @param HQGroupContractsfindIn HqGroupContractsObjectFilter for HqGroupContractsFindRequest
 *
 */
@JsonCreator
  public HqGroupContractsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupContracts")HqGroupContractsObjectFilter HQGroupContractsfindIn) {
    super(id, "HqGroupContractsFind");
    if (HQGroupContractsfindIn != null) {
      Integer index =  HQGroupContractsfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(HQGroupContractsfindIn, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }

/**
 *
 * Retrieves the HqGroupContractsObjectDataList that results from the HqGroupContractsFindRequest call
 * @return HqGroupContractsObjectDataList resulting from udt call
 *
 */

  public HqGroupContractsObjectDataList getOutput() {
    return HqGroupContractsObjectHelper.fromMapList(outputMap, "HqGroupContractsList");
  }
}
