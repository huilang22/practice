/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnDeleteRequest.java
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
 * Class used to create a InvsEquipmentTxnDeleteRequest Udt Request
 *
 */

public class InvsEquipmentTxnDeleteRequest extends InvsEquipmentTxnSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentTxnDeleteRequest
 * @param id Unique request name
 * @param IETDeleteIn InvsEquipmentTxnObjectKeyData for InvsEquipmentTxnDeleteRequest
 *
 */
@JsonCreator
  public InvsEquipmentTxnDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentTxn")InvsEquipmentTxnObjectKeyData IETDeleteIn) {
    super(id, "InvsEquipmentTxnDelete");
    if (IETDeleteIn != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectKeyHelper.toMap(IETDeleteIn, new HashMap(), "InvsEquipmentTxnObjectKeyData").get("InvsEquipmentTxnObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentTxnObjectData that results from the InvsEquipmentTxnDeleteRequest call
 * @return InvsEquipmentTxnObjectData resulting from udt call
 *
 */

  public InvsEquipmentTxnObjectData getOutput() {
    return InvsEquipmentTxnObjectHelper.fromMap(outputMap, "InvsEquipmentTxn");
  }
}
