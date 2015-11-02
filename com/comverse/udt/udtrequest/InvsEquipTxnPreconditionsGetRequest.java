/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPreconditionsGetRequest.java
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
 * Class used to create a InvsEquipTxnPreconditionsGetRequest Udt Request
 *
 */

public class InvsEquipTxnPreconditionsGetRequest extends InvsEquipTxnPreconditionsSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipTxnPreconditionsGetRequest
 * @param id Unique request name
 * @param IETPGetIn InvsEquipTxnPreconditionsObjectKeyData for InvsEquipTxnPreconditionsGetRequest
 *
 */
@JsonCreator
  public InvsEquipTxnPreconditionsGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipTxnPreconditions")InvsEquipTxnPreconditionsObjectKeyData IETPGetIn) {
    super(id, "InvsEquipTxnPreconditionsGet");
    if (IETPGetIn != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectKeyHelper.toMap(IETPGetIn, new HashMap(), "InvsEquipTxnPreconditionsObjectKeyData").get("InvsEquipTxnPreconditionsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsEquipTxnPreconditionsObjectData that results from the InvsEquipTxnPreconditionsGetRequest call
 * @return InvsEquipTxnPreconditionsObjectData resulting from udt call
 *
 */

  public InvsEquipTxnPreconditionsObjectData getOutput() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPreconditions");
  }
}
