/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a RateClassDescrFindRequest Udt Request
 *
 */

public class RateClassDescrFindRequest extends RateClassDescrRequest {
/**
 *
 * Constructor to create a  RateClassDescrFindRequest
 * @param id Unique request name
 * @param RCDFndIn RateClassDescrObjectFilter for RateClassDescrFindRequest
 *
 */
@JsonCreator
  public RateClassDescrFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateClassDescr")RateClassDescrObjectFilter RCDFndIn) {
    super(id, "RateClassDescrFind");
    if (RCDFndIn != null) {
      Integer index =  RCDFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(RCDFndIn, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }

/**
 *
 * Retrieves the RateClassDescrObjectDataList that results from the RateClassDescrFindRequest call
 * @return RateClassDescrObjectDataList resulting from udt call
 *
 */

  public RateClassDescrObjectDataList getOutput() {
    return RateClassDescrObjectHelper.fromMapList(outputMap, "RateClassDescrList");
  }
}
