/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrFindRequest.java
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
 * Class used to create a HqContractUnitCrFindRequest Udt Request
 *
 */

public class HqContractUnitCrFindRequest extends HqContractUnitCrRequest {
/**
 *
 * Constructor to create a  HqContractUnitCrFindRequest
 * @param id Unique request name
 * @param HqContractUnitCrFindIn HqContractUnitCrObjectFilter for HqContractUnitCrFindRequest
 *
 */
@JsonCreator
  public HqContractUnitCrFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqContractUnitCr")HqContractUnitCrObjectFilter HqContractUnitCrFindIn) {
    super(id, "HqContractUnitCrFind");
    if (HqContractUnitCrFindIn != null) {
      Integer index =  HqContractUnitCrFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(HqContractUnitCrFindIn, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }

/**
 *
 * Retrieves the HqContractUnitCrObjectDataList that results from the HqContractUnitCrFindRequest call
 * @return HqContractUnitCrObjectDataList resulting from udt call
 *
 */

  public HqContractUnitCrObjectDataList getOutput() {
    return HqContractUnitCrObjectHelper.fromMapList(outputMap, "HqContractUnitCrList");
  }
}
