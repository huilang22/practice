/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionCreateRequest.java
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
 * Class used to create a InvsEquipmentActionCreateRequest Udt Request
 *
 */

public class InvsEquipmentActionCreateRequest extends InvsEquipmentActionSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentActionCreateRequest
 * @param id Unique request name
 * @param InvsEquipmentActionCreateIn InvsEquipmentActionObjectData for InvsEquipmentActionCreateRequest
 *
 */
@JsonCreator
  public InvsEquipmentActionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentAction")InvsEquipmentActionObjectData InvsEquipmentActionCreateIn) {
    super(id, "InvsEquipmentActionCreate");
    if (InvsEquipmentActionCreateIn != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(InvsEquipmentActionCreateIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentActionObjectData that results from the InvsEquipmentActionCreateRequest call
 * @return InvsEquipmentActionObjectData resulting from udt call
 *
 */

  public InvsEquipmentActionObjectData getOutput() {
    return InvsEquipmentActionObjectHelper.fromMap(outputMap, "InvsEquipmentAction");
  }
}
