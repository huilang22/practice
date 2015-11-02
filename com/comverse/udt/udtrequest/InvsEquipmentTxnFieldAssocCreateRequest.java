/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFieldAssocCreateRequest.java
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
 * Class used to create a InvsEquipmentTxnFieldAssocCreateRequest Udt Request
 *
 */

public class InvsEquipmentTxnFieldAssocCreateRequest extends InvsEquipmentTxnFieldAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentTxnFieldAssocCreateRequest
 * @param id Unique request name
 * @param IETFACreateIn InvsEquipmentTxnFieldAssocObjectData for InvsEquipmentTxnFieldAssocCreateRequest
 *
 */
@JsonCreator
  public InvsEquipmentTxnFieldAssocCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentTxnFieldAssoc")InvsEquipmentTxnFieldAssocObjectData IETFACreateIn) {
    super(id, "InvsEquipmentTxnFieldAssocCreate");
    if (IETFACreateIn != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectHelper.toMap(IETFACreateIn, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentTxnFieldAssocObjectData that results from the InvsEquipmentTxnFieldAssocCreateRequest call
 * @return InvsEquipmentTxnFieldAssocObjectData resulting from udt call
 *
 */

  public InvsEquipmentTxnFieldAssocObjectData getOutput() {
    return InvsEquipmentTxnFieldAssocObjectHelper.fromMap(outputMap, "InvsEquipmentTxnFieldAssoc");
  }
}
