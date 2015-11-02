/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterGetRequest.java
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
 * Class used to create a OwningCostCenterGetRequest Udt Request
 *
 */

public class OwningCostCenterGetRequest extends OwningCostCenterSubRequestParent {
/**
 *
 * Constructor to create a  OwningCostCenterGetRequest
 * @param id Unique request name
 * @param OCCGetIn OwningCostCenterObjectKeyData for OwningCostCenterGetRequest
 *
 */
@JsonCreator
  public OwningCostCenterGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("OwningCostCenter")OwningCostCenterObjectKeyData OCCGetIn) {
    super(id, "OwningCostCenterGet");
    if (OCCGetIn != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectKeyHelper.toMap(OCCGetIn, new HashMap(), "OwningCostCenterObjectKeyData").get("OwningCostCenterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the OwningCostCenterObjectData that results from the OwningCostCenterGetRequest call
 * @return OwningCostCenterObjectData resulting from udt call
 *
 */

  public OwningCostCenterObjectData getOutput() {
    return OwningCostCenterObjectHelper.fromMap(outputMap, "OwningCostCenter");
  }
}
