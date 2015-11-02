/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskUpdateRequest.java
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

import com.csgsystems.cit.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CitTaskUpdateRequest Udt Request
 *
 */

public class CitTaskUpdateRequest extends CitTaskSubRequestParent {
/**
 *
 * Constructor to create a  CitTaskUpdateRequest
 * @param id Unique request name
 * @param citTaskUpdateIn CitTaskObjectBaseData for CitTaskUpdateRequest
 *
 */
@JsonCreator
  public CitTaskUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTask")CitTaskObjectBaseData citTaskUpdateIn) {
    super(id, "CitTaskUpdate");
    if (citTaskUpdateIn != null) {
      addInput("CitTask", CitTaskObjectBaseHelper.toMap(citTaskUpdateIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }

/**
 *
 * Retrieves the CitTaskObjectBaseData that results from the CitTaskUpdateRequest call
 * @return CitTaskObjectBaseData resulting from udt call
 *
 */

  public CitTaskObjectBaseData getOutput() {
    return CitTaskObjectBaseHelper.fromMap(outputMap, "CitTask");
  }
}
