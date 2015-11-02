/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPreconditionsUpdateRequest.java
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
 * Class used to create a InvsEquipTxnPreconditionsUpdateRequest Udt Request
 *
 */

public class InvsEquipTxnPreconditionsUpdateRequest extends InvsEquipTxnPreconditionsSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipTxnPreconditionsUpdateRequest
 * @param id Unique request name
 * @param IETPUpdateIn InvsEquipTxnPreconditionsObjectData for InvsEquipTxnPreconditionsUpdateRequest
 *
 */
@JsonCreator
  public InvsEquipTxnPreconditionsUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipTxnPreconditions")InvsEquipTxnPreconditionsObjectData IETPUpdateIn) {
    super(id, "InvsEquipTxnPreconditionsUpdate");
    if (IETPUpdateIn != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(IETPUpdateIn, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }

/**
 *
 * Retrieves the InvsEquipTxnPreconditionsObjectData that results from the InvsEquipTxnPreconditionsUpdateRequest call
 * @return InvsEquipTxnPreconditionsObjectData resulting from udt call
 *
 */

  public InvsEquipTxnPreconditionsObjectData getOutput() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPreconditions");
  }
}
