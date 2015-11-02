/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AtmPoplistFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AtmPoplistFindRequest Udt Request
 *
 */

public class AtmPoplistFindRequest extends AtmPoplistRequest {
/**
 *
 * Constructor to create a  AtmPoplistFindRequest
 * @param id Unique request name
 * @param atmFindIn AtmPoplistObjectFilter for AtmPoplistFindRequest
 *
 */
@JsonCreator
  public AtmPoplistFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AtmPoplist")AtmPoplistObjectFilter atmFindIn) {
    super(id, "AtmPoplistFind");
    if (atmFindIn != null) {
      Integer index =  atmFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(atmFindIn, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }

/**
 *
 * Retrieves the AtmPoplistObjectDataList that results from the AtmPoplistFindRequest call
 * @return AtmPoplistObjectDataList resulting from udt call
 *
 */

  public AtmPoplistObjectDataList getOutput() {
    return AtmPoplistObjectHelper.fromMapList(outputMap, "AtmPoplistList");
  }
}
