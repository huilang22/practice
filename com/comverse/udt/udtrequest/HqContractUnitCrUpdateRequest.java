/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrUpdateRequest.java
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
 * Class used to create a HqContractUnitCrUpdateRequest Udt Request
 *
 */

public class HqContractUnitCrUpdateRequest extends HqContractUnitCrSubRequestParent {
/**
 *
 * Constructor to create a  HqContractUnitCrUpdateRequest
 * @param id Unique request name
 * @param HqContractUnitCrupdate_In HqContractUnitCrObjectData for HqContractUnitCrUpdateRequest
 *
 */
@JsonCreator
  public HqContractUnitCrUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqContractUnitCr")HqContractUnitCrObjectData HqContractUnitCrupdate_In) {
    super(id, "HqContractUnitCrUpdate");
    if (HqContractUnitCrupdate_In != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(HqContractUnitCrupdate_In, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }

/**
 *
 * Retrieves the HqContractUnitCrObjectData that results from the HqContractUnitCrUpdateRequest call
 * @return HqContractUnitCrObjectData resulting from udt call
 *
 */

  public HqContractUnitCrObjectData getOutput() {
    return HqContractUnitCrObjectHelper.fromMap(outputMap, "HqContractUnitCr");
  }
}
