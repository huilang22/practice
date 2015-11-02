/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusContFindRequest.java
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
 * Class used to create a InvElementPlusContFindRequest Udt Request
 *
 */

public class InvElementPlusContFindRequest extends InvElementPlusRequest {
/**
 *
 * Constructor to create a  InvElementPlusContFindRequest
 * @param id Unique request name
 * @param InvContFindIn InvElementPlusObjData for InvElementPlusContFindRequest
 *
 */
@JsonCreator
  public InvElementPlusContFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElementPlus")InvElementPlusObjData InvContFindIn) {
    super(id, "InvElementPlusContFind");
    if (InvContFindIn != null) {
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(InvContFindIn, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }

/**
 *
 * Retrieves the InvElementPlusObjDataList that results from the InvElementPlusContFindRequest call
 * @return InvElementPlusObjDataList resulting from udt call
 *
 */

  public InvElementPlusObjDataList getOutput() {
    return InvElementPlusObjHelper.fromMapList(outputMap, "InvElementPlusList");
  }
}
