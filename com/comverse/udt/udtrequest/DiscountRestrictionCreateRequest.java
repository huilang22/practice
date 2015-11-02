/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionCreateRequest.java
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
 * Class used to create a DiscountRestrictionCreateRequest Udt Request
 *
 */

public class DiscountRestrictionCreateRequest extends DiscountRestrictionSubRequestParent {
/**
 *
 * Constructor to create a  DiscountRestrictionCreateRequest
 * @param id Unique request name
 * @param DRCreateIn DRObjectData for DiscountRestrictionCreateRequest
 *
 */
@JsonCreator
  public DiscountRestrictionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountRestriction")DRObjectData DRCreateIn) {
    super(id, "DiscountRestrictionCreate");
    if (DRCreateIn != null) {
      addInput("DiscountRestriction", DRObjectHelper.toMap(DRCreateIn, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }

/**
 *
 * Retrieves the DRObjectData that results from the DiscountRestrictionCreateRequest call
 * @return DRObjectData resulting from udt call
 *
 */

  public DRObjectData getOutput() {
    return DRObjectHelper.fromMap(outputMap, "DiscountRestriction");
  }
}
