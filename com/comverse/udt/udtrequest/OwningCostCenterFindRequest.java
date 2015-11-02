/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterFindRequest.java
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
 * Class used to create a OwningCostCenterFindRequest Udt Request
 *
 */

public class OwningCostCenterFindRequest extends OwningCostCenterRequest {
/**
 *
 * Constructor to create a  OwningCostCenterFindRequest
 * @param id Unique request name
 * @param OCCFindIn OwningCostCenterObjectFilter for OwningCostCenterFindRequest
 *
 */
@JsonCreator
  public OwningCostCenterFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("OwningCostCenter")OwningCostCenterObjectFilter OCCFindIn) {
    super(id, "OwningCostCenterFind");
    if (OCCFindIn != null) {
      Integer index =  OCCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(OCCFindIn, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }

/**
 *
 * Retrieves the OwningCostCenterObjectDataList that results from the OwningCostCenterFindRequest call
 * @return OwningCostCenterObjectDataList resulting from udt call
 *
 */

  public OwningCostCenterObjectDataList getOutput() {
    return OwningCostCenterObjectHelper.fromMapList(outputMap, "OwningCostCenterList");
  }
}
