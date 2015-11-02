/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondUpdateRequest.java
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
 * Class used to create a InvsEquipmentCondUpdateRequest Udt Request
 *
 */

public class InvsEquipmentCondUpdateRequest extends InvsEquipmentCondSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentCondUpdateRequest
 * @param id Unique request name
 * @param IECUpdateIn InvsEquipmentCondObjectData for InvsEquipmentCondUpdateRequest
 *
 */
@JsonCreator
  public InvsEquipmentCondUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentCond")InvsEquipmentCondObjectData IECUpdateIn) {
    super(id, "InvsEquipmentCondUpdate");
    if (IECUpdateIn != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(IECUpdateIn, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentCondObjectData that results from the InvsEquipmentCondUpdateRequest call
 * @return InvsEquipmentCondObjectData resulting from udt call
 *
 */

  public InvsEquipmentCondObjectData getOutput() {
    return InvsEquipmentCondObjectHelper.fromMap(outputMap, "InvsEquipmentCond");
  }
}
