/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsCreateRequest.java
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
 * Class used to create a InvsEquipTxnPostconditionsCreateRequest Udt Request
 *
 */

public class InvsEquipTxnPostconditionsCreateRequest extends InvsEquipTxnPostconditionsSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipTxnPostconditionsCreateRequest
 * @param id Unique request name
 * @param IETPCreateIn InvsEquipTxnPostconditionsObjectData for InvsEquipTxnPostconditionsCreateRequest
 *
 */
@JsonCreator
  public InvsEquipTxnPostconditionsCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipTxnPostconditions")InvsEquipTxnPostconditionsObjectData IETPCreateIn) {
    super(id, "InvsEquipTxnPostconditionsCreate");
    if (IETPCreateIn != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(IETPCreateIn, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }

/**
 *
 * Retrieves the InvsEquipTxnPostconditionsObjectData that results from the InvsEquipTxnPostconditionsCreateRequest call
 * @return InvsEquipTxnPostconditionsObjectData resulting from udt call
 *
 */

  public InvsEquipTxnPostconditionsObjectData getOutput() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPostconditions");
  }
}
