/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionFindRequest.java
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
 * Class used to create a BsdConstraintDescriptionFindRequest Udt Request
 *
 */

public class BsdConstraintDescriptionFindRequest extends BsdConstraintDescriptionRequest {
/**
 *
 * Constructor to create a  BsdConstraintDescriptionFindRequest
 * @param id Unique request name
 * @param bsdConstraintDescriptionFindIn BsdConstraintDescriptionObjectFilter for BsdConstraintDescriptionFindRequest
 *
 */
@JsonCreator
  public BsdConstraintDescriptionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdConstraintDescription")BsdConstraintDescriptionObjectFilter bsdConstraintDescriptionFindIn) {
    super(id, "BsdConstraintDescriptionFind");
    if (bsdConstraintDescriptionFindIn != null) {
      Integer index =  bsdConstraintDescriptionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(bsdConstraintDescriptionFindIn, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }

/**
 *
 * Retrieves the BsdConstraintDescriptionObjectDataList that results from the BsdConstraintDescriptionFindRequest call
 * @return BsdConstraintDescriptionObjectDataList resulting from udt call
 *
 */

  public BsdConstraintDescriptionObjectDataList getOutput() {
    return BsdConstraintDescriptionObjectHelper.fromMapList(outputMap, "BsdConstraintDescriptionList");
  }
}
