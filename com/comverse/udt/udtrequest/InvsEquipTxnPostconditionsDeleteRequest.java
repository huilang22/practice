/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsDeleteRequest.java
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
 * Class used to create a InvsEquipTxnPostconditionsDeleteRequest Udt Request
 *
 */

public class InvsEquipTxnPostconditionsDeleteRequest extends InvsEquipTxnPostconditionsRequest {
/**
 *
 * Constructor to create a  InvsEquipTxnPostconditionsDeleteRequest
 * @param id Unique request name
 * @param IETPDeleteIn InvsEquipTxnPostconditionsObjectKeyData for InvsEquipTxnPostconditionsDeleteRequest
 *
 */
@JsonCreator
  public InvsEquipTxnPostconditionsDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipTxnPostconditions")InvsEquipTxnPostconditionsObjectKeyData IETPDeleteIn) {
    super(id, "InvsEquipTxnPostconditionsDelete");
    if (IETPDeleteIn != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectKeyHelper.toMap(IETPDeleteIn, new HashMap(), "InvsEquipTxnPostconditionsObjectKeyData").get("InvsEquipTxnPostconditionsObjectKeyData"));
    }
  }

}
