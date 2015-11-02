/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrFindRequest.java
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
 * Class used to create a InvsHlrFindRequest Udt Request
 *
 */

public class InvsHlrFindRequest extends InvsHlrRequest {
/**
 *
 * Constructor to create a  InvsHlrFindRequest
 * @param id Unique request name
 * @param InvsHlrFindIn InvsHlrObjectFilter for InvsHlrFindRequest
 *
 */
@JsonCreator
  public InvsHlrFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsHlr")InvsHlrObjectFilter InvsHlrFindIn) {
    super(id, "InvsHlrFind");
    if (InvsHlrFindIn != null) {
      Integer index =  InvsHlrFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(InvsHlrFindIn, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }

/**
 *
 * Retrieves the InvsHlrObjectDataList that results from the InvsHlrFindRequest call
 * @return InvsHlrObjectDataList resulting from udt call
 *
 */

  public InvsHlrObjectDataList getOutput() {
    return InvsHlrObjectHelper.fromMapList(outputMap, "InvsHlrList");
  }
}
