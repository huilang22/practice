/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionUpdateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DiscountRestrictionUpdateRequest Udt Request
 *
 */

public class DiscountRestrictionUpdateRequest extends DiscountRestrictionSubRequestParent {
/**
 *
 * Constructor to create a  DiscountRestrictionUpdateRequest
 * @param id Unique request name
 * @param DRUpdateIn DRObjectData for DiscountRestrictionUpdateRequest
 * @param DRUpdateFilter DRObjectFilter for DiscountRestrictionUpdateRequest
 * @param DRUpdateGet DRObjectData for DiscountRestrictionUpdateRequest
 *
 */
@JsonCreator
  public DiscountRestrictionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountRestriction")DRObjectData DRUpdateIn, @JsonProperty("DRUpdateFilter")DRObjectFilter DRUpdateFilter, @JsonProperty("DRUpdateGet")DRObjectData DRUpdateGet) {
    super(id, "DiscountRestrictionUpdate");
    if (DRUpdateIn != null) {
      addInput("DiscountRestriction", DRObjectHelper.toMap(DRUpdateIn, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
    if (DRUpdateFilter != null) {
      Integer index =  DRUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DRUpdateFilter", DRObjectHelper.toMap(DRUpdateFilter, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
    if (DRUpdateGet != null) {
      addInput("DRUpdateGet", DRObjectHelper.toMap(DRUpdateGet, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }

/**
 *
 * Retrieves the DRObjectData that results from the DiscountRestrictionUpdateRequest call
 * @return DRObjectData resulting from udt call
 *
 */

  public DRObjectData getOutput() {
    return DRObjectHelper.fromMap(outputMap, "DiscountRestriction");
  }
}
