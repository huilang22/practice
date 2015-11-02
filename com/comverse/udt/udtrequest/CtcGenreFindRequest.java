/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreFindRequest.java
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
 * Class used to create a CtcGenreFindRequest Udt Request
 *
 */

public class CtcGenreFindRequest extends CtcGenreRequest {
/**
 *
 * Constructor to create a  CtcGenreFindRequest
 * @param id Unique request name
 * @param FindIn CtcGenreObjectFilter for CtcGenreFindRequest
 *
 */
@JsonCreator
  public CtcGenreFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcGenre")CtcGenreObjectFilter FindIn) {
    super(id, "CtcGenreFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(FindIn, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }

/**
 *
 * Retrieves the CtcGenreObjectDataList that results from the CtcGenreFindRequest call
 * @return CtcGenreObjectDataList resulting from udt call
 *
 */

  public CtcGenreObjectDataList getOutput() {
    return CtcGenreObjectHelper.fromMapList(outputMap, "CtcGenreList");
  }
}
