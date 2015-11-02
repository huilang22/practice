/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskCreateRequest.java
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
 * Class used to create a CitTaskCreateRequest Udt Request
 *
 */

public class CitTaskCreateRequest extends CitTaskSubRequestParent {
/**
 *
 * Constructor to create a  CitTaskCreateRequest
 * @param id Unique request name
 * @param citTaskCreateIn CitTaskObjectBaseData for CitTaskCreateRequest
 *
 */
@JsonCreator
  public CitTaskCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTask")CitTaskObjectBaseData citTaskCreateIn) {
    super(id, "CitTaskCreate");
    if (citTaskCreateIn != null) {
      addInput("CitTask", CitTaskObjectBaseHelper.toMap(citTaskCreateIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }

/**
 *
 * Retrieves the CitTaskObjectBaseData that results from the CitTaskCreateRequest call
 * @return CitTaskObjectBaseData resulting from udt call
 *
 */

  public CitTaskObjectBaseData getOutput() {
    return CitTaskObjectBaseHelper.fromMap(outputMap, "CitTask");
  }
}
