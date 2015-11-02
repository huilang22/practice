/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreCreateRequest.java
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
 * Class used to create a CtcGenreCreateRequest Udt Request
 *
 */

public class CtcGenreCreateRequest extends CtcGenreSubRequestParent {
/**
 *
 * Constructor to create a  CtcGenreCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcGenreObjectData for CtcGenreCreateRequest
 *
 */
@JsonCreator
  public CtcGenreCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcGenre")CtcGenreObjectData CreateIn) {
    super(id, "CtcGenreCreate");
    if (CreateIn != null) {
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(CreateIn, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }

/**
 *
 * Retrieves the CtcGenreObjectData that results from the CtcGenreCreateRequest call
 * @return CtcGenreObjectData resulting from udt call
 *
 */

  public CtcGenreObjectData getOutput() {
    return CtcGenreObjectHelper.fromMap(outputMap, "CtcGenre");
  }
}
