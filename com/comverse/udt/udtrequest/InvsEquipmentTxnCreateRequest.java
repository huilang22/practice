/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnCreateRequest.java
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
 * Class used to create a InvsEquipmentTxnCreateRequest Udt Request
 *
 */

public class InvsEquipmentTxnCreateRequest extends InvsEquipmentTxnSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentTxnCreateRequest
 * @param id Unique request name
 * @param IETCreateIn InvsEquipmentTxnObjectData for InvsEquipmentTxnCreateRequest
 *
 */
@JsonCreator
  public InvsEquipmentTxnCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentTxn")InvsEquipmentTxnObjectData IETCreateIn) {
    super(id, "InvsEquipmentTxnCreate");
    if (IETCreateIn != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(IETCreateIn, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentTxnObjectData that results from the InvsEquipmentTxnCreateRequest call
 * @return InvsEquipmentTxnObjectData resulting from udt call
 *
 */

  public InvsEquipmentTxnObjectData getOutput() {
    return InvsEquipmentTxnObjectHelper.fromMap(outputMap, "InvsEquipmentTxn");
  }
}
