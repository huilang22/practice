/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrGetRequest.java
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
 * Class used to create a HqContractUnitCrGetRequest Udt Request
 *
 */

public class HqContractUnitCrGetRequest extends HqContractUnitCrSubRequestParent {
/**
 *
 * Constructor to create a  HqContractUnitCrGetRequest
 * @param id Unique request name
 * @param HqContractUnitCrGetIn HqContractUnitCrObjectKeyData for HqContractUnitCrGetRequest
 *
 */
@JsonCreator
  public HqContractUnitCrGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqContractUnitCr")HqContractUnitCrObjectKeyData HqContractUnitCrGetIn) {
    super(id, "HqContractUnitCrGet");
    if (HqContractUnitCrGetIn != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectKeyHelper.toMap(HqContractUnitCrGetIn, new HashMap(), "HqContractUnitCrObjectKeyData").get("HqContractUnitCrObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the HqContractUnitCrObjectData that results from the HqContractUnitCrGetRequest call
 * @return HqContractUnitCrObjectData resulting from udt call
 *
 */

  public HqContractUnitCrObjectData getOutput() {
    return HqContractUnitCrObjectHelper.fromMap(outputMap, "HqContractUnitCr");
  }
}
