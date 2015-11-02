/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsLocationInvAssocFindRequest Udt Request
 *
 */

public class InvsLocationInvAssocFindRequest extends InvsLocationInvAssocRequest {
/**
 *
 * Constructor to create a  InvsLocationInvAssocFindRequest
 * @param id Unique request name
 * @param InvsLocationInvAssocFindIn InvsLocationInvAssocObjectFilter for InvsLocationInvAssocFindRequest
 *
 */
@JsonCreator
  public InvsLocationInvAssocFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationInvAssoc")InvsLocationInvAssocObjectFilter InvsLocationInvAssocFindIn) {
    super(id, "InvsLocationInvAssocFind");
    if (InvsLocationInvAssocFindIn != null) {
      Integer index =  InvsLocationInvAssocFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(InvsLocationInvAssocFindIn, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }

/**
 *
 * Retrieves the InvsLocationInvAssocObjectDataList that results from the InvsLocationInvAssocFindRequest call
 * @return InvsLocationInvAssocObjectDataList resulting from udt call
 *
 */

  public InvsLocationInvAssocObjectDataList getOutput() {
    return InvsLocationInvAssocObjectHelper.fromMapList(outputMap, "InvsLocationInvAssocList");
  }
}
