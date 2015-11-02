/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusAutoRequest.java
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
 * Class used to create a InvElementPlusAutoRequest Udt Request
 *
 */

public class InvElementPlusAutoRequest extends InvElementPlusRequest {
/**
 *
 * Constructor to create a  InvElementPlusAutoRequest
 * @param id Unique request name
 * @param InvAutoIn InvElementPlusObjFilter for InvElementPlusAutoRequest
 *
 */
@JsonCreator
  public InvElementPlusAutoRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElementPlus")InvElementPlusObjFilter InvAutoIn) {
    super(id, "InvElementPlusAuto");
    if (InvAutoIn != null) {
      Integer index =  InvAutoIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(InvAutoIn, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }

/**
 *
 * Retrieves the InvElementPlusObjDataList that results from the InvElementPlusAutoRequest call
 * @return InvElementPlusObjDataList resulting from udt call
 *
 */

  public InvElementPlusObjDataList getOutput() {
    return InvElementPlusObjHelper.fromMapList(outputMap, "InvElementPlusList");
  }
}
