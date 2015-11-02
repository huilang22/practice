/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusIdFindRequest.java
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
 * Class used to create a InvElementPlusIdFindRequest Udt Request
 *
 */

public class InvElementPlusIdFindRequest extends InvElementPlusRequest {
/**
 *
 * Constructor to create a  InvElementPlusIdFindRequest
 * @param id Unique request name
 * @param InvIdFindIn InvElementPlusObjData for InvElementPlusIdFindRequest
 *
 */
@JsonCreator
  public InvElementPlusIdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElementPlus")InvElementPlusObjData InvIdFindIn) {
    super(id, "InvElementPlusIdFind");
    if (InvIdFindIn != null) {
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(InvIdFindIn, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }

/**
 *
 * Retrieves the InvElementPlusObjDataList that results from the InvElementPlusIdFindRequest call
 * @return InvElementPlusObjDataList resulting from udt call
 *
 */

  public InvElementPlusObjDataList getOutput() {
    return InvElementPlusObjHelper.fromMapList(outputMap, "InvElementPlusList");
  }
}
