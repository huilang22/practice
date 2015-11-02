/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterDeleteRequest.java
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
 * Class used to create a OwningCostCenterDeleteRequest Udt Request
 *
 */

public class OwningCostCenterDeleteRequest extends OwningCostCenterSubRequestParent {
/**
 *
 * Constructor to create a  OwningCostCenterDeleteRequest
 * @param id Unique request name
 * @param OCCDeleteIn OwningCostCenterObjectKeyData for OwningCostCenterDeleteRequest
 *
 */
@JsonCreator
  public OwningCostCenterDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("OwningCostCenter")OwningCostCenterObjectKeyData OCCDeleteIn) {
    super(id, "OwningCostCenterDelete");
    if (OCCDeleteIn != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectKeyHelper.toMap(OCCDeleteIn, new HashMap(), "OwningCostCenterObjectKeyData").get("OwningCostCenterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OwningCostCenterObjectData that results from the OwningCostCenterDeleteRequest call
 * @return OwningCostCenterObjectData resulting from udt call
 *
 */

  public OwningCostCenterObjectData getOutput() {
    return OwningCostCenterObjectHelper.fromMap(outputMap, "OwningCostCenter");
  }
}
