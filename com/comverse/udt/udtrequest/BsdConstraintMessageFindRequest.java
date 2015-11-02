/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageFindRequest.java
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
 * Class used to create a BsdConstraintMessageFindRequest Udt Request
 *
 */

public class BsdConstraintMessageFindRequest extends BsdConstraintMessageRequest {
/**
 *
 * Constructor to create a  BsdConstraintMessageFindRequest
 * @param id Unique request name
 * @param bsdConstraintMessageFindIn BsdConstraintMessageObjectFilter for BsdConstraintMessageFindRequest
 *
 */
@JsonCreator
  public BsdConstraintMessageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdConstraintMessage")BsdConstraintMessageObjectFilter bsdConstraintMessageFindIn) {
    super(id, "BsdConstraintMessageFind");
    if (bsdConstraintMessageFindIn != null) {
      Integer index =  bsdConstraintMessageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectHelper.toMap(bsdConstraintMessageFindIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }

/**
 *
 * Retrieves the BsdConstraintMessageObjectDataList that results from the BsdConstraintMessageFindRequest call
 * @return BsdConstraintMessageObjectDataList resulting from udt call
 *
 */

  public BsdConstraintMessageObjectDataList getOutput() {
    return BsdConstraintMessageObjectHelper.fromMapList(outputMap, "BsdConstraintMessageList");
  }
}
