/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionDeleteRequest.java
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
 * Class used to create a DiscountRestrictionDeleteRequest Udt Request
 *
 */

public class DiscountRestrictionDeleteRequest extends DiscountRestrictionSubRequestParent {
/**
 *
 * Constructor to create a  DiscountRestrictionDeleteRequest
 * @param id Unique request name
 * @param DRDeleteIn DRObjectKeyData for DiscountRestrictionDeleteRequest
 *
 */
@JsonCreator
  public DiscountRestrictionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountRestriction")DRObjectKeyData DRDeleteIn) {
    super(id, "DiscountRestrictionDelete");
    if (DRDeleteIn != null) {
      addInput("DiscountRestriction", DRObjectKeyHelper.toMap(DRDeleteIn, new HashMap(), "DRObjectKeyData").get("DRObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DRObjectData that results from the DiscountRestrictionDeleteRequest call
 * @return DRObjectData resulting from udt call
 *
 */

  public DRObjectData getOutput() {
    return DRObjectHelper.fromMap(outputMap, "DiscountRestriction");
  }
}
