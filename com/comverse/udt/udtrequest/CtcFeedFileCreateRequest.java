/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFeedFileCreateRequest.java
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
 * Class used to create a CtcFeedFileCreateRequest Udt Request
 *
 */

public class CtcFeedFileCreateRequest extends CtcFeedFileSubRequestParent {
/**
 *
 * Constructor to create a  CtcFeedFileCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcFeedFileObjectData for CtcFeedFileCreateRequest
 *
 */
@JsonCreator
  public CtcFeedFileCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFeedFile")CtcFeedFileObjectData CreateIn) {
    super(id, "CtcFeedFileCreate");
    if (CreateIn != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(CreateIn, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }

/**
 *
 * Retrieves the CtcFeedFileObjectData that results from the CtcFeedFileCreateRequest call
 * @return CtcFeedFileObjectData resulting from udt call
 *
 */

  public CtcFeedFileObjectData getOutput() {
    return CtcFeedFileObjectHelper.fromMap(outputMap, "CtcFeedFile");
  }
}
