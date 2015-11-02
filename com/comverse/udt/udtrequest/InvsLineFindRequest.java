/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineFindRequest.java
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
 * Class used to create a InvsLineFindRequest Udt Request
 *
 */

public class InvsLineFindRequest extends InvsLineRequest {
/**
 *
 * Constructor to create a  InvsLineFindRequest
 * @param id Unique request name
 * @param InvsLineFindIn InvsLineObjectFilter for InvsLineFindRequest
 *
 */
@JsonCreator
  public InvsLineFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLine")InvsLineObjectFilter InvsLineFindIn) {
    super(id, "InvsLineFind");
    if (InvsLineFindIn != null) {
      Integer index =  InvsLineFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLine", InvsLineObjectHelper.toMap(InvsLineFindIn, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }

/**
 *
 * Retrieves the InvsLineObjectDataList that results from the InvsLineFindRequest call
 * @return InvsLineObjectDataList resulting from udt call
 *
 */

  public InvsLineObjectDataList getOutput() {
    return InvsLineObjectHelper.fromMapList(outputMap, "InvsLineList");
  }
}
