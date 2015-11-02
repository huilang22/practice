/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionUpdateRequest.java
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
 * Class used to create a InvsEquipmentActionUpdateRequest Udt Request
 *
 */

public class InvsEquipmentActionUpdateRequest extends InvsEquipmentActionSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentActionUpdateRequest
 * @param id Unique request name
 * @param InvsEquipmentActionUpdateIn InvsEquipmentActionObjectData for InvsEquipmentActionUpdateRequest
 *
 */
@JsonCreator
  public InvsEquipmentActionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentAction")InvsEquipmentActionObjectData InvsEquipmentActionUpdateIn) {
    super(id, "InvsEquipmentActionUpdate");
    if (InvsEquipmentActionUpdateIn != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(InvsEquipmentActionUpdateIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentActionObjectData that results from the InvsEquipmentActionUpdateRequest call
 * @return InvsEquipmentActionObjectData resulting from udt call
 *
 */

  public InvsEquipmentActionObjectData getOutput() {
    return InvsEquipmentActionObjectHelper.fromMap(outputMap, "InvsEquipmentAction");
  }
}
