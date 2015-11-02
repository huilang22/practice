/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionFindRequest.java
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
 * Class used to create a DiscountRestrictionFindRequest Udt Request
 *
 */

public class DiscountRestrictionFindRequest extends DiscountRestrictionRequest {
/**
 *
 * Constructor to create a  DiscountRestrictionFindRequest
 * @param id Unique request name
 * @param DRFindIn DRObjectFilter for DiscountRestrictionFindRequest
 *
 */
@JsonCreator
  public DiscountRestrictionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountRestriction")DRObjectFilter DRFindIn) {
    super(id, "DiscountRestrictionFind");
    if (DRFindIn != null) {
      Integer index =  DRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscountRestriction", DRObjectHelper.toMap(DRFindIn, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }

/**
 *
 * Retrieves the DRObjectDataList that results from the DiscountRestrictionFindRequest call
 * @return DRObjectDataList resulting from udt call
 *
 */

  public DRObjectDataList getOutput() {
    return DRObjectHelper.fromMapList(outputMap, "DiscountRestrictionList");
  }
}
