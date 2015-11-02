/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusAutoContRequest.java
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
 * Class used to create a InvElementPlusAutoContRequest Udt Request
 *
 */

public class InvElementPlusAutoContRequest extends InvElementPlusRequest {
/**
 *
 * Constructor to create a  InvElementPlusAutoContRequest
 * @param id Unique request name
 * @param InvAutoContIn InvElementPlusObjFilter for InvElementPlusAutoContRequest
 *
 */
@JsonCreator
  public InvElementPlusAutoContRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElementPlus")InvElementPlusObjFilter InvAutoContIn) {
    super(id, "InvElementPlusAutoCont");
    if (InvAutoContIn != null) {
      Integer index =  InvAutoContIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(InvAutoContIn, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }

/**
 *
 * Retrieves the InvElementPlusObjDataList that results from the InvElementPlusAutoContRequest call
 * @return InvElementPlusObjDataList resulting from udt call
 *
 */

  public InvElementPlusObjDataList getOutput() {
    return InvElementPlusObjHelper.fromMapList(outputMap, "InvElementPlusList");
  }
}
