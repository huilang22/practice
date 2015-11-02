/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnUpdateRequest.java
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
 * Class used to create a InvsEquipmentTxnUpdateRequest Udt Request
 *
 */

public class InvsEquipmentTxnUpdateRequest extends InvsEquipmentTxnSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentTxnUpdateRequest
 * @param id Unique request name
 * @param IETUpdateIn InvsEquipmentTxnObjectData for InvsEquipmentTxnUpdateRequest
 *
 */
@JsonCreator
  public InvsEquipmentTxnUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentTxn")InvsEquipmentTxnObjectData IETUpdateIn) {
    super(id, "InvsEquipmentTxnUpdate");
    if (IETUpdateIn != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(IETUpdateIn, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentTxnObjectData that results from the InvsEquipmentTxnUpdateRequest call
 * @return InvsEquipmentTxnObjectData resulting from udt call
 *
 */

  public InvsEquipmentTxnObjectData getOutput() {
    return InvsEquipmentTxnObjectHelper.fromMap(outputMap, "InvsEquipmentTxn");
  }
}
