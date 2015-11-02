/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionFindInternalRequest.java
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
 * Class used to create a BsdExceptionFindInternalRequest Udt Request
 *
 */

public class BsdExceptionFindInternalRequest extends BsdExceptionRequest {
/**
 *
 * Constructor to create a  BsdExceptionFindInternalRequest
 * @param id Unique request name
 * @param BsdExceptionFindIn BsdExceptionObjectFilter for BsdExceptionFindInternalRequest
 *
 */
@JsonCreator
  public BsdExceptionFindInternalRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdException")BsdExceptionObjectFilter BsdExceptionFindIn) {
    super(id, "BsdExceptionFindInternal");
    if (BsdExceptionFindIn != null) {
      Integer index =  BsdExceptionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdException", BsdExceptionObjectHelper.toMap(BsdExceptionFindIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }

/**
 *
 * Retrieves the BsdExceptionObjectDataList that results from the BsdExceptionFindInternalRequest call
 * @return BsdExceptionObjectDataList resulting from udt call
 *
 */

  public BsdExceptionObjectDataList getOutput() {
    return BsdExceptionObjectHelper.fromMapList(outputMap, "BsdExceptionList");
  }
}
