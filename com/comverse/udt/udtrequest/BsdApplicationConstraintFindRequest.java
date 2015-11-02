/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintFindRequest.java
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
 * Class used to create a BsdApplicationConstraintFindRequest Udt Request
 *
 */

public class BsdApplicationConstraintFindRequest extends BsdApplicationConstraintRequest {
/**
 *
 * Constructor to create a  BsdApplicationConstraintFindRequest
 * @param id Unique request name
 * @param bsdApplicationConstraintFindIn BsdApplicationConstraintObjectFilter for BsdApplicationConstraintFindRequest
 *
 */
@JsonCreator
  public BsdApplicationConstraintFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationConstraint")BsdApplicationConstraintObjectFilter bsdApplicationConstraintFindIn) {
    super(id, "BsdApplicationConstraintFind");
    if (bsdApplicationConstraintFindIn != null) {
      Integer index =  bsdApplicationConstraintFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectHelper.toMap(bsdApplicationConstraintFindIn, new HashMap(), "BsdApplicationConstraint").get("BsdApplicationConstraint"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationConstraintObjectDataList that results from the BsdApplicationConstraintFindRequest call
 * @return BsdApplicationConstraintObjectDataList resulting from udt call
 *
 */

  public BsdApplicationConstraintObjectDataList getOutput() {
    return BsdApplicationConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationConstraintList");
  }
}
