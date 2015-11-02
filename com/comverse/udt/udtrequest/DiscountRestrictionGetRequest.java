/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionGetRequest.java
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
 * Class used to create a DiscountRestrictionGetRequest Udt Request
 *
 */

public class DiscountRestrictionGetRequest extends DiscountRestrictionSubRequestParent {
/**
 *
 * Constructor to create a  DiscountRestrictionGetRequest
 * @param id Unique request name
 * @param DRGetIn DRObjectKeyData for DiscountRestrictionGetRequest
 *
 */
@JsonCreator
  public DiscountRestrictionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountRestriction")DRObjectKeyData DRGetIn) {
    super(id, "DiscountRestrictionGet");
    if (DRGetIn != null) {
      addInput("DiscountRestriction", DRObjectKeyHelper.toMap(DRGetIn, new HashMap(), "DRObjectKeyData").get("DRObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DRObjectData that results from the DiscountRestrictionGetRequest call
 * @return DRObjectData resulting from udt call
 *
 */

  public DRObjectData getOutput() {
    return DRObjectHelper.fromMap(outputMap, "DiscountRestriction");
  }
}
