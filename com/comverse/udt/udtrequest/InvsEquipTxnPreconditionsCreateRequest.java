/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPreconditionsCreateRequest.java
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
 * Class used to create a InvsEquipTxnPreconditionsCreateRequest Udt Request
 *
 */

public class InvsEquipTxnPreconditionsCreateRequest extends InvsEquipTxnPreconditionsSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipTxnPreconditionsCreateRequest
 * @param id Unique request name
 * @param IETPCreateIn InvsEquipTxnPreconditionsObjectData for InvsEquipTxnPreconditionsCreateRequest
 *
 */
@JsonCreator
  public InvsEquipTxnPreconditionsCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipTxnPreconditions")InvsEquipTxnPreconditionsObjectData IETPCreateIn) {
    super(id, "InvsEquipTxnPreconditionsCreate");
    if (IETPCreateIn != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(IETPCreateIn, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }

/**
 *
 * Retrieves the InvsEquipTxnPreconditionsObjectData that results from the InvsEquipTxnPreconditionsCreateRequest call
 * @return InvsEquipTxnPreconditionsObjectData resulting from udt call
 *
 */

  public InvsEquipTxnPreconditionsObjectData getOutput() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPreconditions");
  }
}
