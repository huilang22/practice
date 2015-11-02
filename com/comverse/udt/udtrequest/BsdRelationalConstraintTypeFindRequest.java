/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeFindRequest.java
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
 * Class used to create a BsdRelationalConstraintTypeFindRequest Udt Request
 *
 */

public class BsdRelationalConstraintTypeFindRequest extends BsdRelationalConstraintTypeRequest {
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeFindRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintTypeFindIn BsdRelationalConstraintTypeObjectFilter for BsdRelationalConstraintTypeFindRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraintType")BsdRelationalConstraintTypeObjectFilter bsdRelationalConstraintTypeFindIn) {
    super(id, "BsdRelationalConstraintTypeFind");
    if (bsdRelationalConstraintTypeFindIn != null) {
      Integer index =  bsdRelationalConstraintTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(bsdRelationalConstraintTypeFindIn, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintTypeObjectDataList that results from the BsdRelationalConstraintTypeFindRequest call
 * @return BsdRelationalConstraintTypeObjectDataList resulting from udt call
 *
 */

  public BsdRelationalConstraintTypeObjectDataList getOutput() {
    return BsdRelationalConstraintTypeObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintTypeList");
  }
}
