/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFeedFileUpdateRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcFeedFileUpdateRequest Udt Request
 *
 */

public class CtcFeedFileUpdateRequest extends CtcFeedFileSubRequestParent {
/**
 *
 * Constructor to create a  CtcFeedFileUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcFeedFileObjectData for CtcFeedFileUpdateRequest
 *
 */
@JsonCreator
  public CtcFeedFileUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFeedFile")CtcFeedFileObjectData UpdateIn) {
    super(id, "CtcFeedFileUpdate");
    if (UpdateIn != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(UpdateIn, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }

/**
 *
 * Retrieves the CtcFeedFileObjectData that results from the CtcFeedFileUpdateRequest call
 * @return CtcFeedFileObjectData resulting from udt call
 *
 */

  public CtcFeedFileObjectData getOutput() {
    return CtcFeedFileObjectHelper.fromMap(outputMap, "CtcFeedFile");
  }
}
