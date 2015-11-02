/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreDeleteRequest.java
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
 * Class used to create a CtcGenreDeleteRequest Udt Request
 *
 */

public class CtcGenreDeleteRequest extends CtcGenreSubRequestParent {
/**
 *
 * Constructor to create a  CtcGenreDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcGenreObjectKeyData for CtcGenreDeleteRequest
 *
 */
@JsonCreator
  public CtcGenreDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcGenre")CtcGenreObjectKeyData DeleteIn) {
    super(id, "CtcGenreDelete");
    if (DeleteIn != null) {
      addInput("CtcGenre", CtcGenreObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcGenreObjectKeyData").get("CtcGenreObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcGenreObjectData that results from the CtcGenreDeleteRequest call
 * @return CtcGenreObjectData resulting from udt call
 *
 */

  public CtcGenreObjectData getOutput() {
    return CtcGenreObjectHelper.fromMap(outputMap, "CtcGenre");
  }
}
