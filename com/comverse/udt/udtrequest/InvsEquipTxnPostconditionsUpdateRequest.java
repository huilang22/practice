/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsUpdateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsEquipTxnPostconditionsUpdateRequest Udt Request
 *
 */

public class InvsEquipTxnPostconditionsUpdateRequest extends InvsEquipTxnPostconditionsSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipTxnPostconditionsUpdateRequest
 * @param id Unique request name
 * @param IETPUpdateIn InvsEquipTxnPostconditionsObjectData for InvsEquipTxnPostconditionsUpdateRequest
 *
 */
@JsonCreator
  public InvsEquipTxnPostconditionsUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipTxnPostconditions")InvsEquipTxnPostconditionsObjectData IETPUpdateIn) {
    super(id, "InvsEquipTxnPostconditionsUpdate");
    if (IETPUpdateIn != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(IETPUpdateIn, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }

/**
 *
 * Retrieves the InvsEquipTxnPostconditionsObjectData that results from the InvsEquipTxnPostconditionsUpdateRequest call
 * @return InvsEquipTxnPostconditionsObjectData resulting from udt call
 *
 */

  public InvsEquipTxnPostconditionsObjectData getOutput() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPostconditions");
  }
}
