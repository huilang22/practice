/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnGetRequest.java
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
 * Class used to create a InvsEquipmentTxnGetRequest Udt Request
 *
 */

public class InvsEquipmentTxnGetRequest extends InvsEquipmentTxnSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentTxnGetRequest
 * @param id Unique request name
 * @param IETGetIn InvsEquipmentTxnObjectKeyData for InvsEquipmentTxnGetRequest
 *
 */
@JsonCreator
  public InvsEquipmentTxnGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentTxn")InvsEquipmentTxnObjectKeyData IETGetIn) {
    super(id, "InvsEquipmentTxnGet");
    if (IETGetIn != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectKeyHelper.toMap(IETGetIn, new HashMap(), "InvsEquipmentTxnObjectKeyData").get("InvsEquipmentTxnObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentTxnObjectData that results from the InvsEquipmentTxnGetRequest call
 * @return InvsEquipmentTxnObjectData resulting from udt call
 *
 */

  public InvsEquipmentTxnObjectData getOutput() {
    return InvsEquipmentTxnObjectHelper.fromMap(outputMap, "InvsEquipmentTxn");
  }
}
