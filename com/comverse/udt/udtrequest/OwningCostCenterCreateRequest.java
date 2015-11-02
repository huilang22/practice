/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterCreateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OwningCostCenterCreateRequest Udt Request
 *
 */

public class OwningCostCenterCreateRequest extends OwningCostCenterSubRequestParent {
/**
 *
 * Constructor to create a  OwningCostCenterCreateRequest
 * @param id Unique request name
 * @param OCCCreateIn OwningCostCenterObjectData for OwningCostCenterCreateRequest
 *
 */
@JsonCreator
  public OwningCostCenterCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OwningCostCenter")OwningCostCenterObjectData OCCCreateIn) {
    super(id, "OwningCostCenterCreate");
    if (OCCCreateIn != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(OCCCreateIn, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }

/**
 *
 * Retrieves the OwningCostCenterObjectData that results from the OwningCostCenterCreateRequest call
 * @return OwningCostCenterObjectData resulting from udt call
 *
 */

  public OwningCostCenterObjectData getOutput() {
    return OwningCostCenterObjectHelper.fromMap(outputMap, "OwningCostCenter");
  }
}
