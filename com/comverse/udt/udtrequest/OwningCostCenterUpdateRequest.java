/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterUpdateRequest.java
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
 * Class used to create a OwningCostCenterUpdateRequest Udt Request
 *
 */

public class OwningCostCenterUpdateRequest extends OwningCostCenterSubRequestParent {
/**
 *
 * Constructor to create a  OwningCostCenterUpdateRequest
 * @param id Unique request name
 * @param OCCUpdateIn OwningCostCenterObjectData for OwningCostCenterUpdateRequest
 *
 */
@JsonCreator
  public OwningCostCenterUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OwningCostCenter")OwningCostCenterObjectData OCCUpdateIn) {
    super(id, "OwningCostCenterUpdate");
    if (OCCUpdateIn != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(OCCUpdateIn, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }

/**
 *
 * Retrieves the OwningCostCenterObjectData that results from the OwningCostCenterUpdateRequest call
 * @return OwningCostCenterObjectData resulting from udt call
 *
 */

  public OwningCostCenterObjectData getOutput() {
    return OwningCostCenterObjectHelper.fromMap(outputMap, "OwningCostCenter");
  }
}
