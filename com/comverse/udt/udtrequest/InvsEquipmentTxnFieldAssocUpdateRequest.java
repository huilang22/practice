/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFieldAssocUpdateRequest.java
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
 * Class used to create a InvsEquipmentTxnFieldAssocUpdateRequest Udt Request
 *
 */

public class InvsEquipmentTxnFieldAssocUpdateRequest extends InvsEquipmentTxnFieldAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentTxnFieldAssocUpdateRequest
 * @param id Unique request name
 * @param IETFAUpdateIn InvsEquipmentTxnFieldAssocObjectData for InvsEquipmentTxnFieldAssocUpdateRequest
 *
 */
@JsonCreator
  public InvsEquipmentTxnFieldAssocUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentTxnFieldAssoc")InvsEquipmentTxnFieldAssocObjectData IETFAUpdateIn) {
    super(id, "InvsEquipmentTxnFieldAssocUpdate");
    if (IETFAUpdateIn != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectHelper.toMap(IETFAUpdateIn, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentTxnFieldAssocObjectData that results from the InvsEquipmentTxnFieldAssocUpdateRequest call
 * @return InvsEquipmentTxnFieldAssocObjectData resulting from udt call
 *
 */

  public InvsEquipmentTxnFieldAssocObjectData getOutput() {
    return InvsEquipmentTxnFieldAssocObjectHelper.fromMap(outputMap, "InvsEquipmentTxnFieldAssoc");
  }
}
