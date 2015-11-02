/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPreconditionsDeleteRequest.java
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
 * Class used to create a InvsEquipTxnPreconditionsDeleteRequest Udt Request
 *
 */

public class InvsEquipTxnPreconditionsDeleteRequest extends InvsEquipTxnPreconditionsRequest {
/**
 *
 * Constructor to create a  InvsEquipTxnPreconditionsDeleteRequest
 * @param id Unique request name
 * @param IETPDeleteIn InvsEquipTxnPreconditionsObjectKeyData for InvsEquipTxnPreconditionsDeleteRequest
 *
 */
@JsonCreator
  public InvsEquipTxnPreconditionsDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipTxnPreconditions")InvsEquipTxnPreconditionsObjectKeyData IETPDeleteIn) {
    super(id, "InvsEquipTxnPreconditionsDelete");
    if (IETPDeleteIn != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectKeyHelper.toMap(IETPDeleteIn, new HashMap(), "InvsEquipTxnPreconditionsObjectKeyData").get("InvsEquipTxnPreconditionsObjectKeyData"));
    }
  }

}
