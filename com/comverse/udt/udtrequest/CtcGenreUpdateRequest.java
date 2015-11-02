/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreUpdateRequest.java
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
 * Class used to create a CtcGenreUpdateRequest Udt Request
 *
 */

public class CtcGenreUpdateRequest extends CtcGenreSubRequestParent {
/**
 *
 * Constructor to create a  CtcGenreUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcGenreObjectData for CtcGenreUpdateRequest
 *
 */
@JsonCreator
  public CtcGenreUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcGenre")CtcGenreObjectData UpdateIn) {
    super(id, "CtcGenreUpdate");
    if (UpdateIn != null) {
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(UpdateIn, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }

/**
 *
 * Retrieves the CtcGenreObjectData that results from the CtcGenreUpdateRequest call
 * @return CtcGenreObjectData resulting from udt call
 *
 */

  public CtcGenreObjectData getOutput() {
    return CtcGenreObjectHelper.fromMap(outputMap, "CtcGenre");
  }
}
