/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrCreateRequest.java
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
 * Class used to create a HqContractUnitCrCreateRequest Udt Request
 *
 */

public class HqContractUnitCrCreateRequest extends HqContractUnitCrSubRequestParent {
/**
 *
 * Constructor to create a  HqContractUnitCrCreateRequest
 * @param id Unique request name
 * @param HqContractUnitCrCreateIn HqContractUnitCrObjectData for HqContractUnitCrCreateRequest
 *
 */
@JsonCreator
  public HqContractUnitCrCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqContractUnitCr")HqContractUnitCrObjectData HqContractUnitCrCreateIn) {
    super(id, "HqContractUnitCrCreate");
    if (HqContractUnitCrCreateIn != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(HqContractUnitCrCreateIn, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }

/**
 *
 * Retrieves the HqContractUnitCrObjectData that results from the HqContractUnitCrCreateRequest call
 * @return HqContractUnitCrObjectData resulting from udt call
 *
 */

  public HqContractUnitCrObjectData getOutput() {
    return HqContractUnitCrObjectHelper.fromMap(outputMap, "HqContractUnitCr");
  }
}
