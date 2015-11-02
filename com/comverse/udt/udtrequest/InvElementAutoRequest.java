/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementAutoRequest.java
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
 * Class used to create a InvElementAutoRequest Udt Request
 *
 */

public class InvElementAutoRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementAutoRequest
 * @param id Unique request name
 * @param InvAutoIn InvElementObjFilter for InvElementAutoRequest
 *
 */
@JsonCreator
  public InvElementAutoRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjFilter InvAutoIn) {
    super(id, "InvElementAuto");
    if (InvAutoIn != null) {
      Integer index =  InvAutoIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvAutoIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the InvElementAutoRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
