/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeFindRequest.java
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

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdAttributeConstraintTypeFindRequest Udt Request
 *
 */

public class BsdAttributeConstraintTypeFindRequest extends BsdAttributeConstraintTypeRequest {
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeFindRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintTypeFindIn BsdAttributeConstraintTypeObjectFilter for BsdAttributeConstraintTypeFindRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraintType")BsdAttributeConstraintTypeObjectFilter bsdAttributeConstraintTypeFindIn) {
    super(id, "BsdAttributeConstraintTypeFind");
    if (bsdAttributeConstraintTypeFindIn != null) {
      Integer index =  bsdAttributeConstraintTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(bsdAttributeConstraintTypeFindIn, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintTypeObjectDataList that results from the BsdAttributeConstraintTypeFindRequest call
 * @return BsdAttributeConstraintTypeObjectDataList resulting from udt call
 *
 */

  public BsdAttributeConstraintTypeObjectDataList getOutput() {
    return BsdAttributeConstraintTypeObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintTypeList");
  }
}
