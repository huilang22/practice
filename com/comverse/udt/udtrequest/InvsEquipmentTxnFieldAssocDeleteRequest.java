/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFieldAssocDeleteRequest.java
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
 * Class used to create a InvsEquipmentTxnFieldAssocDeleteRequest Udt Request
 *
 */

public class InvsEquipmentTxnFieldAssocDeleteRequest extends InvsEquipmentTxnFieldAssocRequest {
/**
 *
 * Constructor to create a  InvsEquipmentTxnFieldAssocDeleteRequest
 * @param id Unique request name
 * @param IETFADeleteIn InvsEquipmentTxnFieldAssocObjectKeyData for InvsEquipmentTxnFieldAssocDeleteRequest
 *
 */
@JsonCreator
  public InvsEquipmentTxnFieldAssocDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentTxnFieldAssoc")InvsEquipmentTxnFieldAssocObjectKeyData IETFADeleteIn) {
    super(id, "InvsEquipmentTxnFieldAssocDelete");
    if (IETFADeleteIn != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectKeyHelper.toMap(IETFADeleteIn, new HashMap(), "InvsEquipmentTxnFieldAssocObjectKeyData").get("InvsEquipmentTxnFieldAssocObjectKeyData"));
    }
  }

}
