/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineFindRequest.java
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
 * Class used to create a NrcLineFindRequest Udt Request
 *
 */

public class NrcLineFindRequest extends NrcLineRequest {
/**
 *
 * Constructor to create a  NrcLineFindRequest
 * @param id Unique request name
 * @param nlFindIn NrcLineObjectFilter for NrcLineFindRequest
 *
 */
@JsonCreator
  public NrcLineFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcLine")NrcLineObjectFilter nlFindIn) {
    super(id, "NrcLineFind");
    if (nlFindIn != null) {
      Integer index =  nlFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NrcLine", NrcLineObjectHelper.toMap(nlFindIn, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }

/**
 *
 * Retrieves the NrcLineObjectDataList that results from the NrcLineFindRequest call
 * @return NrcLineObjectDataList resulting from udt call
 *
 */

  public NrcLineObjectDataList getOutput() {
    return NrcLineObjectHelper.fromMapList(outputMap, "NrcLineList");
  }
}
