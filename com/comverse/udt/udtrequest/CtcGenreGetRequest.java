/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreGetRequest.java
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
 * Class used to create a CtcGenreGetRequest Udt Request
 *
 */

public class CtcGenreGetRequest extends CtcGenreSubRequestParent {
/**
 *
 * Constructor to create a  CtcGenreGetRequest
 * @param id Unique request name
 * @param GetIn CtcGenreObjectKeyData for CtcGenreGetRequest
 *
 */
@JsonCreator
  public CtcGenreGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcGenre")CtcGenreObjectKeyData GetIn) {
    super(id, "CtcGenreGet");
    if (GetIn != null) {
      addInput("CtcGenre", CtcGenreObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcGenreObjectKeyData").get("CtcGenreObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcGenreObjectData that results from the CtcGenreGetRequest call
 * @return CtcGenreObjectData resulting from udt call
 *
 */

  public CtcGenreObjectData getOutput() {
    return CtcGenreObjectHelper.fromMap(outputMap, "CtcGenre");
  }
}
