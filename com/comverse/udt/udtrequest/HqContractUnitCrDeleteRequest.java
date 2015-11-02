/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrDeleteRequest.java
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
 * Class used to create a HqContractUnitCrDeleteRequest Udt Request
 *
 */

public class HqContractUnitCrDeleteRequest extends HqContractUnitCrSubRequestParent {
/**
 *
 * Constructor to create a  HqContractUnitCrDeleteRequest
 * @param id Unique request name
 * @param HqContractUnitCrdelete_In HqContractUnitCrObjectKeyData for HqContractUnitCrDeleteRequest
 *
 */
@JsonCreator
  public HqContractUnitCrDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqContractUnitCr")HqContractUnitCrObjectKeyData HqContractUnitCrdelete_In) {
    super(id, "HqContractUnitCrDelete");
    if (HqContractUnitCrdelete_In != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectKeyHelper.toMap(HqContractUnitCrdelete_In, new HashMap(), "HqContractUnitCrObjectKeyData").get("HqContractUnitCrObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the HqContractUnitCrObjectData that results from the HqContractUnitCrDeleteRequest call
 * @return HqContractUnitCrObjectData resulting from udt call
 *
 */

  public HqContractUnitCrObjectData getOutput() {
    return HqContractUnitCrObjectHelper.fromMap(outputMap, "HqContractUnitCr");
  }
}
