/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondCreateRequest.java
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
 * Class used to create a InvsEquipmentCondCreateRequest Udt Request
 *
 */

public class InvsEquipmentCondCreateRequest extends InvsEquipmentCondSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentCondCreateRequest
 * @param id Unique request name
 * @param IECCreateIn InvsEquipmentCondObjectData for InvsEquipmentCondCreateRequest
 *
 */
@JsonCreator
  public InvsEquipmentCondCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentCond")InvsEquipmentCondObjectData IECCreateIn) {
    super(id, "InvsEquipmentCondCreate");
    if (IECCreateIn != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(IECCreateIn, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentCondObjectData that results from the InvsEquipmentCondCreateRequest call
 * @return InvsEquipmentCondObjectData resulting from udt call
 *
 */

  public InvsEquipmentCondObjectData getOutput() {
    return InvsEquipmentCondObjectHelper.fromMap(outputMap, "InvsEquipmentCond");
  }
}
