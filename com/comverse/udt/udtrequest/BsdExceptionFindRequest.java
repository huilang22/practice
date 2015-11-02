/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionFindRequest.java
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

import com.csgsystems.sfq.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdExceptionFindRequest Udt Request
 *
 */

public class BsdExceptionFindRequest extends BsdExceptionRequest {
/**
 *
 * Constructor to create a  BsdExceptionFindRequest
 * @param id Unique request name
 * @param BsdExceptionFindExtIn BsdExceptionObjectFilter for BsdExceptionFindRequest
 *
 */
@JsonCreator
  public BsdExceptionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdException")BsdExceptionObjectFilter BsdExceptionFindExtIn) {
    super(id, "BsdExceptionFind");
    if (BsdExceptionFindExtIn != null) {
      Integer index =  BsdExceptionFindExtIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdException", BsdExceptionObjectHelper.toMap(BsdExceptionFindExtIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }

/**
 *
 * Retrieves the BsdExceptionObjectDataList that results from the BsdExceptionFindRequest call
 * @return BsdExceptionObjectDataList resulting from udt call
 *
 */

  public BsdExceptionObjectDataList getOutput() {
    return BsdExceptionObjectHelper.fromMapList(outputMap, "BsdExceptionList");
  }
}
