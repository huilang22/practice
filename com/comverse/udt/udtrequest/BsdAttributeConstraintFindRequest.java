/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintFindRequest.java
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
 * Class used to create a BsdAttributeConstraintFindRequest Udt Request
 *
 */

public class BsdAttributeConstraintFindRequest extends BsdAttributeConstraintRequest {
/**
 *
 * Constructor to create a  BsdAttributeConstraintFindRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintFindIn BsdAttributeConstraintObjectFilter for BsdAttributeConstraintFindRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraint")BsdAttributeConstraintObjectFilter bsdAttributeConstraintFindIn) {
    super(id, "BsdAttributeConstraintFind");
    if (bsdAttributeConstraintFindIn != null) {
      Integer index =  bsdAttributeConstraintFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectHelper.toMap(bsdAttributeConstraintFindIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintObjectDataList that results from the BsdAttributeConstraintFindRequest call
 * @return BsdAttributeConstraintObjectDataList resulting from udt call
 *
 */

  public BsdAttributeConstraintObjectDataList getOutput() {
    return BsdAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintList");
  }
}
