/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFieldAssocGetRequest.java
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
 * Class used to create a InvsEquipmentTxnFieldAssocGetRequest Udt Request
 *
 */

public class InvsEquipmentTxnFieldAssocGetRequest extends InvsEquipmentTxnFieldAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentTxnFieldAssocGetRequest
 * @param id Unique request name
 * @param IETFAGetIn InvsEquipmentTxnFieldTablesObjectKeyData for InvsEquipmentTxnFieldAssocGetRequest
 *
 */
@JsonCreator
  public InvsEquipmentTxnFieldAssocGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentTxnFieldAssoc")InvsEquipmentTxnFieldTablesObjectKeyData IETFAGetIn) {
    super(id, "InvsEquipmentTxnFieldAssocGet");
    if (IETFAGetIn != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldTablesObjectKeyHelper.toMap(IETFAGetIn, new HashMap(), "InvsEquipmentTxnFieldTablesObjectKeyData").get("InvsEquipmentTxnFieldTablesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentTxnFieldTablesObjectData that results from the InvsEquipmentTxnFieldAssocGetRequest call
 * @return InvsEquipmentTxnFieldTablesObjectData resulting from udt call
 *
 */

  public InvsEquipmentTxnFieldTablesObjectData getOutput() {
    return InvsEquipmentTxnFieldTablesObjectHelper.fromMap(outputMap, "InvsEquipmentTxnFieldAssoc");
  }
}
