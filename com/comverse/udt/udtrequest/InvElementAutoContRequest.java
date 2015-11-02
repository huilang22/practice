/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementAutoContRequest.java
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
 * Class used to create a InvElementAutoContRequest Udt Request
 *
 */

public class InvElementAutoContRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementAutoContRequest
 * @param id Unique request name
 * @param InvAutoContIn InvElementObjFilter for InvElementAutoContRequest
 *
 */
@JsonCreator
  public InvElementAutoContRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjFilter InvAutoContIn) {
    super(id, "InvElementAutoCont");
    if (InvAutoContIn != null) {
      Integer index =  InvAutoContIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvAutoContIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the InvElementAutoContRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
