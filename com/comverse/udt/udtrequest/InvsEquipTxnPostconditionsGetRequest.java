/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsGetRequest.java
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
 * Class used to create a InvsEquipTxnPostconditionsGetRequest Udt Request
 *
 */

public class InvsEquipTxnPostconditionsGetRequest extends InvsEquipTxnPostconditionsSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipTxnPostconditionsGetRequest
 * @param id Unique request name
 * @param IETPGetIn InvsEquipTxnPostconditionsObjectKeyData for InvsEquipTxnPostconditionsGetRequest
 *
 */
@JsonCreator
  public InvsEquipTxnPostconditionsGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipTxnPostconditions")InvsEquipTxnPostconditionsObjectKeyData IETPGetIn) {
    super(id, "InvsEquipTxnPostconditionsGet");
    if (IETPGetIn != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectKeyHelper.toMap(IETPGetIn, new HashMap(), "InvsEquipTxnPostconditionsObjectKeyData").get("InvsEquipTxnPostconditionsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsEquipTxnPostconditionsObjectData that results from the InvsEquipTxnPostconditionsGetRequest call
 * @return InvsEquipTxnPostconditionsObjectData resulting from udt call
 *
 */

  public InvsEquipTxnPostconditionsObjectData getOutput() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPostconditions");
  }
}
